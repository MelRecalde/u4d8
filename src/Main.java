import entities.Customer;
import entities.Order;
import entities.Product;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("ID12345", "Book Fantasy", "Books", 20.50),
                new Product("ID13456", "Book Romance", "Books", 15.60),
                new Product("ID21345", "Baby Toy", "Baby", 10.00),
                new Product("ID44567", "Boy's Shirt", "Boys", 5.00),
                new Product("ID88765", "Beauty Mask", "Beauty & SkinCare", 2.30)
        );

        List<Order> orders = List.of(
                new Order("ID111", "Shipped", LocalDate.of(2021, 2, 15),
                        LocalDate.of(2021, 2, 18), List.of(products.get(0), products.get(2)),
                        new Customer("USER10", "Red", 2)),
                new Order("ID222", "Delivered", LocalDate.of(2021, 3, 10),
                        LocalDate.of(2021, 3, 13), List.of(products.get(4), products.get(3)),
                        new Customer("USER5", "Blue", 2)),
                new Order("ID444", "Processing", LocalDate.of(2021, 4, 1),
                        LocalDate.of(2021, 4, 2), List.of(products.get(1), products.get(0)),
                        new Customer("USER13", "Yellow", 1))
        );

        List<Product> filteredProducts = products.stream()
                .filter(product -> "Books".equals(product.getCategory()) && product.getPrice() > 100)
                .toList();

        System.out.println("--------------ESERCIZIO 1--------------");
        System.out.println("Lista Books: " + filteredProducts);

        List<Order> babyOrders = orders.stream()
                .filter(order -> order.getProducts().stream().anyMatch(product -> "Baby".equals(product.getCategory())))
                .toList();

        System.out.println("--------------ESERCIZIO 2--------------");
        System.out.println("Order with baby's product = " + babyOrders);

        List<Product> saleBoysProd = products.stream()
                .filter(product -> "Boys".equals(product.getCategory()))
                .map(product -> new Product(product.getId(), product.getName(), product.getCategory(), product.getPrice() * 0.9))
                .toList();

        System.out.println("--------------ESERCIZIO 3--------------");
        System.out.println("Boys products with discount = " + saleBoysProd);
        
    }
}