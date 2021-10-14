package StringAlgorithm;

public class Rotation {
    public static void main(String[] args) {
        System.out.println(rotation("abcdef", 2).equals("cdefab"));

        char[] values = "abcdef".toCharArray();
        rotation(values, 2);
        assert new String(values).equals("cdefab");
    }

    // Move characters in front of given string to the end of string time complexity: O(n)
    // space complexity: O(n)
    public static String rotation(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }

    // Move characters in front of given character array to the end of array time
    // complexity: O(n) space complexity: O(1)
    public static void rotation(char[] values, int n) {
        reverse(values, 0, n - 1);
        reverse(values, n, values.length - 1);
        reverse(values, 0, values.length - 1);
    }

    /**
     * Reverse character array
     *
     * @param values character array
     * @param from   begin index of given array
     * @param to     end index of given array
     */
    public static void reverse(char[] values, int from, int to) {
        while (from < to) {
            char temp = values[from];
            values[from] = values[to];
            values[to] = temp;
            from++;
            to--;
        }
    }
}