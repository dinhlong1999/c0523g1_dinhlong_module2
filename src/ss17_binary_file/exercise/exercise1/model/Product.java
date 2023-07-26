package ss17_binary_file.exercise.exercise1.model;

public class Product implements Comparable<Product> {
    private int id;
    private String name;
    private int price;
    private String brand;
    private String describe;

    public Product() {
    }

    public Product(int id, String name, int price, String brand, String describe) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.describe = describe;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public  String getInformation(){
        return this.id+","+this.name+","+this.price+","+this.brand+","+this.describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", brand='" + brand + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return this.getPrice() - o.getPrice();
    }
}
