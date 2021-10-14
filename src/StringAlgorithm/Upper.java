package StringAlgorithm;

public class Upper {
    public static void main(String[] args) {
        String[] strings = {"ABC", "ABC123", "abcABC", "abc123ABC"};
        for (String s : strings) {
            assert toUpperCase(s).equals(s.toUpperCase());
        }
    }

    // Данный алгоритм переводит все символы строки в верхний регистр
    public static String toUpperCase(String s) {
        char[] values = s.toCharArray();
        for (int i = 0; i < values.length; ++i) {
            if (Character.isLetter(values[i]) && Character.isLowerCase(values[i])) {
                values[i] = Character.toUpperCase(values[i]);
            }
        }
        return new String(values);
    }
}