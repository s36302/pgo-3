public static void main(String[] args) {

    // --- create some items ---
    MenuItem a = new MenuItem("C01", "Latte", 4.50, "Coffee");
    MenuItem b = new MenuItem("C01", "Latte Large", 5.50, "Coffee"); // same code, different name/price
    MenuItem c = new MenuItem("T01", "Tea", 2.00, "Tea");

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(a.equals(b));
    System.out.println(a.equals(c));

    System.out.println(MenuItem.getProductCount());
}

