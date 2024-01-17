package week2.giorno3;

import java.time.LocalDate;
import java.util.List;

public class Order {


    private Long id;
    private String status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private List<Product> products;
    private Customer customer;

    public Order(Long id, String status, LocalDate orderDate, LocalDate deliveryDate, List products, Customer customer) {
        this.id = id;
        this.status = status;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.customer = customer;
        this.products = products;

    }

    public Long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Customer getCustomer() {
        return customer;
    }
    @Override
    public String toString() {
      //  return "id: " + this.id + " status: " +this.status + " order date : " + this.orderDate + " delivery date: " + this.deliveryDate + " customer: " + this.customer + " product: " + this.products;
    return "id : " + this.id;
    }
}
