public class Notebook extends Product {
    private double screenSize;
    private int ram;
    private int storage;

    public Notebook(String name, double unitPrice, double discountRate, int stockCount, Brand brand, String color, double screenSize, int ram, int storage) {
        super(name, unitPrice, discountRate, stockCount, brand, String.valueOf(color));
        this.screenSize = screenSize;
        this.ram = ram;
        this.storage = storage;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
}