package part1.library;

import java.util.ArrayList;

public interface Librariable<T> {

    void store(T media);

    ArrayList<T> retrieveAll();
}
