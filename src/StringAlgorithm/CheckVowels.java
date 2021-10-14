package StringAlgorithm;

public class CheckVowels {
    public static void main(String[] args) {
        System.out.println(!hasVowels("This is a strings"));
        System.out.println(!hasVowels("Hello World"));
        System.out.println(!hasVowels("Java is fun"));
        System.out.println(!hasVowels("123hi"));
        System.out.println(!hasVowels("Coding vs Programming"));
    }

    // Данный алгоритм проверяет есть ли в строке гласные звуки
    public static boolean hasVowels(String input) {
        if (input.matches("[AEIOUaeiou]")) {
            countVowels(input);
            return true;
        }
        return false;
    }

    // Данный алгоритм принимает строку и выводит количество гласных звуков
    public static void countVowels(String input) {
        input = input.toLowerCase();
        int count = 0;
        int i = 0;
        while (i < input.length()) {
            if (input.charAt(i) == 'a'
                    || input.charAt(i) == 'e'
                    || input.charAt(i) == 'i'
                    || input.charAt(i) == 'o'
                    || input.charAt(i) == 'u') {
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
}