package week2.giorno3;

public class Product {


    private Long id;
    private String name;
    private String category;

    public void setPrice(Double price) {
        this.price = price;
    }

    private Double price;

    public Product(Long id, String name, String category, Double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public Long getId() {
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
    @Override
    public String toString() {
        return "id: " + this.id + " name: " +this.name + " category: " + this.category + " price: " + this.price;
    }
}
