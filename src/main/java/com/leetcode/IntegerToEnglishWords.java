package com.leetcode;

/**
 * Solution for IntegerToEnglishWords problem.
 * https://leetcode.com/problems/integer-to-english-words/
 *
 * @author Vasyl Grygoryev (aka Basil Gregory)
 *         created on 3/18/19
 */
public class IntegerToEnglishWords {

    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }

        int m = num % 1000;
        String result = threeDigits(m);
        String[] groups = {"Thousand", "Million", "Billion"};

        for (int i = 0; i < groups.length; i++) {
            num /= 1000;
            if (num > 0) {
                m = num % 1000;
                result = treeDigitsSomething(m, groups[i]) + addWhiteSpace(result);
            }
        }

        return result;
    }

    public String treeDigitsSomething(int n, String something) {
        String result = threeDigits(n);
        if (!result.isEmpty()) {
            result += " " + something;
        }

        return result;
    }

    public String addWhiteSpace(String s) {
        if (!s.isEmpty() && s.charAt(0) != ' ') {
            return " " + s;
        }

        return s;
    }

    public String threeDigits(int n) {
        if (n < 100) {
            return twoDigits(n);
        }

        return oneDigit(n / 100) + " Hundred" + addWhiteSpace(twoDigits(n % 100));
    }

    public String twoDigits(int n) {
        if (n < 10) {
            return oneDigit(n);
        }
        if (n < 20) {
            return twoDigitsLess20(n);
        }

        return ten(n) + addWhiteSpace(oneDigit(n % 10));
    }

    public String ten(int n) {
        switch (n / 10) {
            case 2: return "Twenty";
            case 3: return "Thirty";
            case 4: return "Forty";
            case 5: return "Fifty";
            case 6: return "Sixty";
            case 7: return "Seventy";
            case 8: return "Eighty";
            case 9: return "Ninety";
        }
        return "";
    }

    public String twoDigitsLess20(int n) {
        switch (n) {
            case 10: return "Ten";
            case 11: return "Eleven";
            case 12: return "Twelve";
            case 13: return "Thirteen";
            case 14: return "Fourteen";
            case 15: return "Fifteen";
            case 16: return "Sixteen";
            case 17: return "Seventeen";
            case 18: return "Eighteen";
            case 19: return "Nineteen";
        }
        return "";
    }

    public String oneDigit(int n) {
        switch (n) {
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
        }
        return "";
    }

}
