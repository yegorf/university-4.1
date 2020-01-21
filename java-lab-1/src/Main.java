import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Device device = new Device();
        device.setManufacturer("LG");
        device.setSerialNumber("645937");
        device.setPrice(200.50f);

        EthernetAdapter adapter = new EthernetAdapter();
        adapter.setManufacturer("CISCO");
        adapter.setSerialNumber("957384");
        adapter.setPrice(45.25f);
        adapter.setMac("00-11-22-33-44-55");
        adapter.setSpeed(100);

        Monitor monitor = new Monitor();
        monitor.setManufacturer("ASUS");
        monitor.setSerialNumber("354728");
        monitor.setPrice(100.00f);
        monitor.setScreenType("LSD");
        monitor.setResolutionX(1920);
        monitor.setResolutionY(1080);

        Printer printer = new Printer();
        printer.setManufacturer("CANON");
        printer.setSerialNumber("745629");
        printer.setPrice(200.00f);
        printer.setPaperSize("A4");
        printer.setPrinterType("laser");

        //Creation of the list, containing different types
        List<Device> devices = new LinkedList<>();
        devices.add(device);
        devices.add(adapter);
        devices.add(monitor);
        devices.add(printer);

        //Data output
        System.out.println("Devices list");
        devices.forEach(System.out::println);

        Device device1 = new Device();
        device1.setManufacturer("Xiaomi");
        device1.setSerialNumber("867463");
        device1.setPrice(300.00f);

        Device device2 = new Device();
        device2.setManufacturer("Apple");
        device2.setSerialNumber("903846");
        device2.setPrice(999.99f);
        System.out.println();

        //Equals testing
        System.out.println("Equals test");
        if (device1.equals(device2)) { //True only if all fields are equal
            System.out.println("device1 equals device2");
        } else {
            System.out.println("device1 not equals device2");
        }
        System.out.println();

        //Devices sort by price
        Collections.sort(devices);
        System.out.println("Sorted list");
        devices.forEach(System.out::println);
    }
}
