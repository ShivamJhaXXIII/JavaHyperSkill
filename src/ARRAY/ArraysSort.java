package ARRAY;

public class ArraysSort {
    public static void main(String[] args) {
        String[] array = {"y","d","b","u","t","f"};
        System.out.println(java.util.Arrays.toString(sortArray(array)));
    }

    public static String[] sortArray(String[] array) {
        java.util.Arrays.sort(array);
        return array;
    }
}
