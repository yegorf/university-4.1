package part1.media;

public class Newspaper extends part1.media.Media {
    private int period;

    public Newspaper(String name, int period) {
        super(name);
        this.period = period;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "period=" + period +
                ", name='" + name + '\'' +
                '}';
    }
}
