import org.jetbrains.annotations.NotNull;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] array = Arrays.stream(sc.nextLine().split(" "))
                .mapToLong(Long::parseLong)
                .toArray();
        int index = sc.nextInt();
        long value = sc.nextLong();
        String[] arguments = {"Shivam", "Evan","Devrup"};
        run(arguments);
        addValueByIndex(array, index, value);
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));

    }

    public static void addValueByIndex(@NotNull long[] array, int index, long value) {
        array[index] += value;
    }

    public static void run(@NotNull String[] args) {
        // implement me
        for(String element : args) {
            System.out.println(element);
        }
    }
}
