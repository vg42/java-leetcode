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

        return ten(n / 10) + addWhiteSpace(oneDigit(n % 10));
    }

    public String ten(int n) {
        String[] d = {"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        if (n >= 2 && n <= 9) {
            return d[n - 2];
        }

        return "";
    }

    public String twoDigitsLess20(int n) {
        String[] d = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        if (n >= 10 && n <= 19) {
            return d[n - 10];
        }

        return "";
    }

    public String oneDigit(int n) {
        String[] d = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        if (n >=1 && n <= 9) {
            return d[n - 1];
        }

        return "";
    }

}
