class FixingExceptions {

    public static void calculateSquare(int[] array, int index) {
        // write your code here
        try {
            int square = array[index - 1] * array[index - 1];
            System.out.println(square);
        } catch (Exception e) {
            System.out.println("Exception!");
        }

    }

    public static void main(String[] args) {
        int array[] = {1,2,3,4};
        calculateSquare(array, 5);
    }
}

