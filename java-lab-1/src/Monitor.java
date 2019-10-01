import java.util.Objects;

public class Monitor extends Device {
    private String screenType;
    private int resolutionX;
    private int resolutionY;

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Monitor monitor = (Monitor) o;
        return resolutionX == monitor.resolutionX &&
                resolutionY == monitor.resolutionY &&
                screenType.equals(monitor.screenType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), screenType, resolutionX, resolutionY);
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "screenType='" + screenType + '\'' +
                ", resolutionX=" + resolutionX +
                ", resolutionY=" + resolutionY +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}
