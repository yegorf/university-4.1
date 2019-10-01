package part2;

import java.util.Objects;

public class Apple extends Fruit {
    private String variety;
    private AppleColor color;
    private float size;

    enum AppleColor {
        RED, YELLOW, GREEN
    }

    public Apple(boolean ripeness, float price, String variety, AppleColor color, float size) {
        super(ripeness, price);
        this.variety = variety;
        this.color = color;
        this.size = size;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public AppleColor getColor() {
        return color;
    }

    public void setColor(AppleColor color) {
        this.color = color;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Apple apple = (Apple) o;
        return Float.compare(apple.size, size) == 0 &&
                variety.equals(apple.variety) &&
                color == apple.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), variety, color, size);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "variety='" + variety + '\'' +
                ", color=" + color +
                ", size=" + size +
                ", ripeness=" + ripeness +
                ", price=" + price +
                '}';
    }
}
