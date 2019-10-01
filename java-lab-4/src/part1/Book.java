package part1.media;

import part1.Media;

public class Book extends Media {
    private int number;

    public Book(String name, int number) {
        super(name);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Book{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
