package part2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {

    public static void main(String[] args) throws IOException {
        final String FILE = "file.txt";
        final char CHAR = 'a';
        final int MIN = 0;
        final int MAX = 20;

        File file = new File(FILE);
        RandomAccessFile accessFile = new RandomAccessFile(
                file, "rw");

        while (true) {
            try {
                int writeCount = (int) ((Math.random() * ((MAX - MIN) + 1)) + MIN);
                int readCount = (int) ((Math.random() * ((MAX - MIN) + 1)) + MIN);

                System.out.println("Write:");
                for (int j = 0; j < writeCount; j++) {
                    accessFile.writeChar(CHAR);
                    System.out.print(CHAR + " ");
                }
                System.out.println();
                System.out.println("Read:");
                for (int j = 0; j < readCount; j++) {
                    char c = accessFile.readChar();
                    System.out.print(c + " ");
                }
                System.out.println();
            } catch (Exception e) {
                break;
            }
        }
    }
}
