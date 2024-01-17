package week2.giorno3;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1L, "paragon", "Game", 50.0));
        //products.add(new Product(2L, "passeggino", "Baby", 1.0));
        products.add(new Product(3L, "harry potter", "Books", 15.0));
        products.add(new Product(8L, "harry potter due", "Books", 110.0));
        products.add(new Product(4L, "Schiuma da barba", "Boys", 4.0));
        //products.add(new Product(5L, "Ciuccio", "Baby", 3.0));
        List<Product> products2 = new ArrayList<>();
        products2.add(new Product(1L, "paragon", "Game", 50.0));
        products2.add(new Product(2L, "mouse", "Game", 1.0));
        products2.add(new Product(3L, "harry potter", "Books", 15.0));
        products2.add(new Product(8L, "harry potter due", "Books", 110.0));
        products2.add(new Product(4L, "Schiuma da barba", "Boys", 4.0));
        products2.add(new Product(5L, "Ciuccio", "Baby", 3.0));
        Stream<Product> productStream = products.stream();
        List<Product> books = new ArrayList<>(productStream.filter(product -> product.getCategory().equals("Books") && product.getPrice() > 100).collect(Collectors.toList()));
        System.out.println(books.toString());
        Customer customer = new Customer(1L, "maruko", 10);
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(10L, "delivered", LocalDate.of(2010, 10, 20), LocalDate.of(2010, 11, 10), products, customer));
        orders.add(new Order(11L, "pending", LocalDate.of(2010, 10, 20), LocalDate.of(2010, 11, 15), products2, customer));
        Stream<Order> orderStream = orders.stream();
        List<Order> baby = new ArrayList<>(orderStream.filter(order -> !order.getProducts().stream().filter(product -> product.getCategory().equals("Baby")).findAny().isEmpty()).collect(Collectors.toList()));
        System.out.println(baby);
        Stream<Product> productStream2 = products.stream();
        List<Product> boys = new ArrayList<>(productStream2.filter(product -> product.getCategory().equals("Boys")).map(product -> {
            Product p = new Product(product.getId(), product.getName(), product.getCategory(), product.getPrice() * 0.9);
            return p;
        }).collect(Collectors.toList()));
        System.out.println(boys);
    }
}
