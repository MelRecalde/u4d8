package entities;

public class Product {
    private String id;
    private String name;
    private String category;
    private Double price;

    public Product(String id, String name, String category, Double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id: " + id +
                " , name: '" + name + '\'' +
                " , category: '" + category + '\'' +
                " , price: " + price +
                '}';
    }
}
