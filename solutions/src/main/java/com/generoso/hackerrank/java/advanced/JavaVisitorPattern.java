package com.generoso.hackerrank.java.advanced;

import java.util.*;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private final int value;
    private final Color color;
    private final int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private final ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis {
    public abstract int getResult();

    public abstract void visitNode(TreeNode node);

    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {

    private int sum;

    public int getResult() {
        return sum;
    }

    public void visitNode(TreeNode node) {
        // do nothing
    }

    public void visitLeaf(TreeLeaf leaf) {
        sum += leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {

    private int product = 1;
    private final int MOD = 1000000007;

    public int getResult() {
        return product;
    }

    public void visitNode(TreeNode node) {
        if (node.getColor() == Color.RED) {
            product = (int) ((long) product * node.getValue() % MOD);
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.RED) {
            product = (int) ((long) product * leaf.getValue() % MOD);
        }
    }
}

class FancyVisitor extends TreeVis {
    private int evenDepthSum = 0;
    private int greenLeafSum = 0;

    public int getResult() {
        return Math.abs(evenDepthSum - greenLeafSum);
    }

    public void visitNode(TreeNode node) {
        if (node.getDepth() % 2 == 0) {
            evenDepthSum += node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.GREEN) {
            greenLeafSum += leaf.getValue();
        }
    }

}

public class JavaVisitorPattern {

    private static Tree solve() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scan.nextInt();
        }

        Color[] colors = new Color[n];
        for (int i = 0; i < n; i++) {
            colors[i] = scan.nextInt() == 0 ? Color.RED : Color.GREEN;
        }

        Map<Integer, Set<Integer>> edges = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            int u = scan.nextInt();
            int v = scan.nextInt();
            edges.computeIfAbsent(u, k -> new HashSet<>()).add(v);
            edges.computeIfAbsent(v, k -> new HashSet<>()).add(u);
        }

        return buildTree(1, 0, values, colors, edges, new boolean[n + 1]);
    }

    private static Tree buildTree(
            int nodeNum,
            int depth,
            int[] values,
            Color[] colors,
            Map<Integer, Set<Integer>> edges,
            boolean[] visited
    ) {
        visited[nodeNum] = true;
        Tree tree;
        if (!edges.containsKey(nodeNum) || edges.get(nodeNum).stream().allMatch(v -> visited[v])) {
            tree = new TreeLeaf(values[nodeNum - 1], colors[nodeNum - 1], depth);
        } else {
            tree = new TreeNode(values[nodeNum - 1], colors[nodeNum - 1], depth);
            for (int child : edges.get(nodeNum)) {
                if (!visited[child]) {
                    ((TreeNode) tree).addChild(buildTree(child, depth + 1, values, colors, edges, visited));
                }
            }
        }
        return tree;
    }


    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}