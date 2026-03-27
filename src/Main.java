public class Main {
    public static void main(String[] args) {
        MenuItem m1 = new MenuItem("C-01", "Espresso", 9.0, "coffee");
        MenuItem m2 = new MenuItem("C-02", "Cappuccino", 13.5, "coffee");
        MenuItem m3 = new MenuItem("D-01", "Cheesecake", 16.0, "dessert");
        MenuItem m4 = new MenuItem("T-01", "Green Tea", 7.0, "tea");
        MenuItem m5 = new MenuItem("D-02", "Brownie", 12.0, "dessert");

        CafeCustomer customer = new CafeCustomer(100, "Julia", "Mazur", "j.mazur@mail.pl");

        Order order = new Order(customer);
        order.addItem(m1);
        order.addItem(m2);
        order.addItem(m3);

        System.out.println(customer);
        System.out.println(order);
        System.out.println("Total value: " + order.calculateTotal());
        System.out.println("Number of items: " + order.countItems());
        System.out.println("Number of products created in the system: " + MenuItem.getProductCount());

        MenuItem espressoCopy = new MenuItem("C-01", "Espresso duplicate", 9.0, "coffee");
        System.out.println("Are the products equal? " + m1.equals(espressoCopy));
        System.out.println("Next order number will be " + order.getNextOrderNumber());
        order.markAsPaid();
        System.out.println(order);

        CafeCustomer customer2 = new CafeCustomer(101, "Piotr", "Nowak", "p.nowak@mail.pl");
        Order order2 = new Order(customer2);
        order2.addItem(m4);
        order2.addItem(m5);
        System.out.println(customer2);
        System.out.println(order2);
        System.out.println("Total value: " + order2.calculateTotal());
        System.out.println("Number of items: " + order2.countItems());
        System.out.println("Next order number will be " + order.getNextOrderNumber());
        order2 .markAsPaid();
        System.out.println(order2);
        System.out.println("Number of products created in the system: " + MenuItem.getProductCount());
    }
}

