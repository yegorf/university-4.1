package part1.library;

import part1.media.Media;

import java.util.ArrayList;

public class Library<T> implements Librariable<T> {
    private ArrayList<T> storage = new ArrayList<>();

    @Override
    public void store(T media) {
        storage.add(media);
    }

    @Override
    public ArrayList<T> retrieveAll() {
        return storage;
    }

    public T retrieveByName(String name) {
        for (T t : storage) {
            Media media = (Media)t;
            if (media.getName().equals(name)) {
                return t;
            }
        }
        return null;
    }
}
