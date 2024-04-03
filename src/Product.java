public abstract class Product {
    private static int idCounter = 1;
    int id;
    String name;
    double unitPrice;
    double discountRate;
    int stockCount;
    static Brand brand;
    String color;

    public Product(String name, double unitPrice, double discountRate, int stockCount, Brand brand,String color) {
        this.id = idCounter++;
        this.name = name;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.stockCount = stockCount;
        this.brand = brand;
        this.color= color;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getStockCount() {
        return stockCount;
    }

    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }

    public static Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}