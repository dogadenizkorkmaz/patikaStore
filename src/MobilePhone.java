public class MobilePhone extends Product {
    int memory;
    double screenSize;
    int battery;
    int ram;
    String color;

    public MobilePhone(String name, double unitPrice, double discountRate, int stockCount, Brand brand, int memory, double screenSize, int battery, int ram, String color) {
        super(name, unitPrice, discountRate, stockCount, brand, String.valueOf(color));
        this.memory = memory;
        this.screenSize = screenSize;
        this.battery = battery;
        this.ram = ram;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}