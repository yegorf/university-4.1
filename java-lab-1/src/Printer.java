import java.util.Objects;

public class Printer extends Device {
    private String printerType;
    private String paperSize;

    public String getPrinterType() {
        return printerType;
    }

    public void setPrinterType(String printerType) {
        this.printerType = printerType;
    }

    public String getPaperSize() {
        return paperSize;
    }

    public void setPaperSize(String paperSize) {
        this.paperSize = paperSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Printer printer = (Printer) o;
        return printerType.equals(printer.printerType) &&
                paperSize.equals(printer.paperSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), printerType, paperSize);
    }

    @Override
    public String toString() {
        return "Printer{" +
                "printerType='" + printerType + '\'' +
                ", paperSize='" + paperSize + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}
