package entities;

public class Customer {
    private String id;
    private String name;
    private Integer tier;

    public Customer(String id, String name, Integer tier) {
        this.id = id;
        this.name = name;
        this.tier = tier;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getTier() {
        return tier;
    }
}
