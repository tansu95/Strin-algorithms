package StringAlgorithm;

public class Palindrome {
    public static void main(String[] args) {
        String[] palindromes = {null, "", "aba", "123321"};
        for (String s : palindromes) {
            System.out.println(isPalindrome(s) && isPalindromeRecursion(s) && isPalindrome1(s));
        }

        String[] notPalindromes = {"abb", "abc", "abc123"};
        for (String s : notPalindromes) {
            System.out.println(isPalindrome(s) && isPalindromeRecursion(s) && isPalindrome1(s));
        }
    }

    // Данный алгоритм проверяет является ли строка полиндромом
    public static boolean isPalindrome(String s) {
        return (s == null || s.length() <= 1) || s.equals(new StringBuilder(s).reverse().toString());
    }

    // Данный алгоритм проверяет является ли данная строка полиндромом,с помощью рекурсии
    public static boolean isPalindromeRecursion(String s) {
        if (s == null || s.length() <= 1) {
            return true;
        }

        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }

        return isPalindrome(s.substring(1, s.length() - 1));
    }

    // Данный алгоритм проверяет является ли строка полиндромом(ещё один вариант)
    public static boolean isPalindrome1(String s) {
        if (s == null || s.length() <= 1) {
            return true;
        }
        for (int i = 0, j = s.length() - 1; i < j; ++i, --j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}