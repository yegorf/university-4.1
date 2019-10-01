package part1;

import java.io.*;
import java.util.Scanner;

public class Main {
    private final static String TEXT_FILE_NAME = "java-lab-5/data.txt";

    public static void main(String[] args) throws IOException {
        double[] array = new double[]{0.21, 5.44, 1.23, 54.21, 76.34, 77.54, 21.45, 67.00, 90.54, 32.14};
        final String SEPARATOR = "%7c"; //

        writeToTextFile(array, SEPARATOR);
        readTextFile(SEPARATOR);
    }

    private static void writeToTextFile(double[] array, final String SEPARATOR) throws IOException {
        FileWriter writer = new FileWriter(TEXT_FILE_NAME, false);

        for (double d : array) {
            writer.write(d + SEPARATOR);
        }
        writer.flush();
        writer.close();
    }

    private static void readTextFile(final String SEPARATOR) throws FileNotFoundException {
        File file = new File(TEXT_FILE_NAME);
        Scanner scanner = new Scanner(file);

        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Array from file (converted to int)");
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] values = line.split(SEPARATOR);
            for (String value : values) {
                int d = (int) Double.parseDouble(value);
                System.out.print(d + " ");

                if (d % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        }
        System.out.println();
        System.out.println("Even count = " + evenCount);
        System.out.println("Odd count = " + oddCount);

        scanner.close();
    }
}
