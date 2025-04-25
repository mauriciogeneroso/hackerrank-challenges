package com.generoso.hackerrank.regex.applications;

import java.util.Scanner;

public class HackerRankLanguage {

    private static final String REGEX =
            "[Cc]|[Cc][Pp][Pp]|[Jj][Aa][Vv][Aa]|[Pp][Yy][Tt][Hh][Oo][Nn]|[Pp][Ee][Rr][Ll]|[Pp][Hh][Pp]|[Rr][Uu][Bb][Yy]|[Cc][Ss][Hh][Aa][Rr][Pp]|[Hh][Aa][Ss][Kk][Ee][Ll][Ll]|[Cc][Ll][Oo][Jj][Uu][Rr][Ee]|[Bb][Aa][Ss][Hh]|[Ss][Cc][Aa][Ll][Aa]|[Ee][Rr][Ll][Aa][Nn][Gg]|[Cc][Ll][Ii][Ss][Pp]|[Ll][Uu][Aa]|[Bb][Rr][Aa][Ii][Nn][Ff][Uu][Cc][Kk]|[Jj][Aa][Vv][Aa][Ss][Cc][Rr][Ii][Pp][Tt]|[Gg][Oo]|[Dd]|[Oo][Cc][Aa][Mm][Ll]|[Rr]|[Pp][Aa][Ss][Cc][Aa][Ll]|[Ss][Bb][Cc][Ll]|[Dd][Aa][Rr][Tt]|[Gg][Rr][Oo][Oo][Vv][Yy]|[Oo][Bb][Jj][Ee][Cc][Tt][Ii][Vv][Ee][Cc]";

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int numberOfLines = Integer.parseInt(scan.nextLine());
            while (numberOfLines-- > 0) {
                String ignoreApiId = scan.next();
                System.out.println(scan.next().matches(REGEX) ? "VALID" : "INVALID");
            }
        }
    }
}
