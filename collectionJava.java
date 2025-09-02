class CollectionJava{
    public static void main(String[] args) {
        String s = "AABAAB";
        String[] str = s.split("");

        str = removeCharAt(str, 0);
        str = removeCharAt(str, 2); // Adjusted index to 2 since array is 0-indexed

        System.out.println(java.util.Arrays.toString(str));
    }

    public static String[] removeCharAt(String[] str, int index) {
        String[] result = new String[str.length - 1];
        System.arraycopy(str, 0, result, 0, index);
        System.arraycopy(str, index + 1, result, index, str.length - index - 1);
        return result;
    }
}