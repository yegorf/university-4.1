package part2;

import java.util.Objects;

public class Fruit implements Comparable<Fruit> {
    protected boolean ripeness;
    protected float price;

    public Fruit(boolean ripeness, float price) {
        this.ripeness = ripeness;
        this.price = price;
    }

    public boolean isRipeness() {
        return ripeness;
    }

    public void setRipeness(boolean ripeness) {
        this.ripeness = ripeness;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return ripeness == fruit.ripeness &&
                Float.compare(fruit.price, price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ripeness, price);
    }

    @Override
    public int compareTo(Fruit fruit) {
        return Float.compare(this.price, fruit.price);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "ripeness=" + ripeness +
                ", price=" + price +
                '}';
    }
}
