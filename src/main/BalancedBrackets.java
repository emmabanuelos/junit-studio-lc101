package main;


public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets: ASSERTS TRUE FOR EACH ONE
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not: ASSERT FALSE EACH ONE
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        int brackets = 0;
        for (char ch : str.toCharArray()) { /*returns an array of chars after converting a String into a sequence of characters */
            if (ch == '[') {
                brackets++;
            } else if (ch == ']') {
                brackets--;
            }
        }
        return brackets == 0;
    }
}
