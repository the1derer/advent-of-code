import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Day1
 */
public class Day1 {

    public static void main(String[] args) throws Exception {
        // BufferedReader input = new BufferedReader(new FileReader("./input.txt"));
        Scanner input = new Scanner(new FileReader("2022/input.txt"));
        TreeSet<Long> set = new TreeSet<>();
        
        long maxCal = 0;
        // long maxCalElf = 0;
        // long elf = 1;
        long currentElfCal = 0;

        while(input.hasNext()) {

            String str = input.nextLine();

            if(str == "") {

                // if(currentElfCal > maxCal) {
                //     maxCal = currentElfCal;
                //     // maxCalElf = elf;
                // }
                set.add(currentElfCal);
                currentElfCal = 0;
                // elf++;
                // System.out.println("current elf count: " + elf);

                continue;
            }

            currentElfCal += Long.parseLong(str);
        }

        // System.out.println(currentElfCal + " = " + maxCal);
        // System.out.println(currentElfCal > maxCal ? elf : maxCalElf);
        System.out.println(set.pollLast() + set.pollLast() + set.pollLast());
        Stream.of(1, 2, 3, 4).

    }

    // static List<String> getElfWiseList(BufferedReader input) {
    // }

    static int partOne(Scanner input) {

    }

    static int partTwo(Scanner input) {

    }
}