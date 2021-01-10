SELECT N, 
       CASE
            WHEN P IS NULL THEN 'Root'
            WHEN (SELECT COUNT(1) FROM BST AS AUX WHERE AUX.P = TREE.N) = 0 THEN 'Leaf'
            ELSE 'Inner'
       END
  FROM BST AS TREE
 ORDER BY 1