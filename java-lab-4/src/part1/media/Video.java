package part1.media;

public class Video extends part1.media.Media {
    private int duration;

    public Video(String name, int duration) {
        super(name);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Video{" +
                "duration=" + duration +
                ", name='" + name + '\'' +
                '}';
    }
}
