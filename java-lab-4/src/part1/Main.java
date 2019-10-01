package part1;

import part1.library.Library;
import part1.media.Book;
import part1.media.Media;
import part1.media.Newspaper;
import part1.media.Video;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Library<Media> library = new Library<>();
        library.store(new Book("Necronomicon", 1000));
        library.store(new Video("Cats", 60));
        library.store(new Newspaper("Times", 5));

        ArrayList<Media> media = library.retrieveAll();
        media.forEach(System.out::println);
        System.out.println();

        Media m = library.retrieveByName("Times");
        if (m != null) {
            System.out.println(m);
        } else {
            System.out.println("Can't find!");
        }
    }
}
