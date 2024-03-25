public class Product {
    private static int idCounter = 1;
    private int id;
    private double unitPrice;
    private double discountRate;
    private int amountStock;
    private String productName;
    private Trademark trademark;
    private int storage;
    private double screenSize;
    private int camera;
    private double battery;
    private int ram;
    private String color;

    public Product(double unitPrice, int amountStock, String productName, Trademark trademark, int storage, double screenSize, int camera, double battery) {
        this.id = idCounter++;
        this.unitPrice = unitPrice;
        this.amountStock = amountStock;
        this.productName = productName;
        this.trademark = trademark;
        this.storage = storage;
        this.screenSize = screenSize;
        this.camera = camera;
        this.battery = battery;
    }

    public Product(double unitPrice, int amountStock, String productName, Trademark trademark, int storage, double screenSize, int ram) {
        this.id = idCounter++;
        this.unitPrice = unitPrice;
        this.amountStock = amountStock;
        this.productName = productName;
        this.trademark = trademark;
        this.storage = storage;
        this.screenSize = screenSize;
        this.ram = ram;
    }

    public Product(int id, double unitPrice, double discountRate, int amountStock, String productName, Trademark trademark, int storage, double screenSize, int camera, double battery, int ram, String color) {
        this.id = idCounter++;
        this.id = id;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.amountStock = amountStock;
        this.productName = productName;
        this.trademark = trademark;
        this.storage = storage;
        this.screenSize = screenSize;
        this.camera = camera;
        this.battery = battery;
        this.ram = ram;
        this.color = color;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public int getId() {
        return id;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public int getAmountStock() {
        return amountStock;
    }

    public String getProductName() {
        return productName;
    }

    public Trademark getTrademark() {
        return trademark;
    }

    public int getStorage() {
        return storage;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getCamera() {
        return camera;
    }

    public double getBattery() {
        return battery;
    }

    public int getRam() {
        return ram;
    }

    public String getColor() {
        return color;
    }
}
