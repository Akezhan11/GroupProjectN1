import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe("39Donuts");
        Customer customer = new Customer("1","Dias");
        MenuItem hotDog = new MenuItem("Hot dog", 1700);
        MenuItem sandwich = new MenuItem("Sandwich", 1800);
        MenuItem cake = new MenuItem("Cake", 800);
        Order order = customer.createOrder();
        order.addItem(hotDog);
        order.addItem(sandwich);
        order.addItem(cake);

        cafe.PLaceOrder(customer, order);

        System.out.println("\nOrder items:");
        for (MenuItem item : order.getItems()) {
            System.out.println("- " + item.getName() + ": " + item.getPrice());
        }

        System.out.println("Total price: " + order.getTotalPrice());
    }
}