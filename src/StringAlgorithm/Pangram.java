package StringAlgorithm;

public class Pangram {
    public static void main(String[] args) {
        System.out.println(isPangram("The quick brown fox jumps over the lazy dog"));
        System.out.println(isPangram("The quick brown fox jumps over the azy dog")); // not exists l character
    }

    // Данный алгоритм проверяет является ли строка панраммом или нет
    public static boolean isPangram(String s) {
        boolean[] marked = new boolean[26]; // by default all letters don't exists
        char[] values = s.toCharArray();
        for (char value : values) {
            if (Character.isLetter(value)) {
                int index = Character.isUpperCase(value) ? value - 'A' : value - 'a';
                marked[index] = true; // mark current character exists
            }
        }

        for (boolean b : marked) {
            if (!b) {
                return false;
            }
        }
        return true;
    }
}