package model;

public class Product {
    private int id;
    private String Product;
    private String Tool;
    private int price;

    public Product(int id, String product, String tool, int price) {
        this.id = id;
        this.Product = product;
        this.Tool = tool;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct() {
        return this.Product;
    }

    public void setProduct(String product) {
        this.Product = product;
    }

    public String getTool() {
        return this.Tool;
    }

    public void setTool(String tool) {
        this.Tool = tool;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
