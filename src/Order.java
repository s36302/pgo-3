import java.util.ArrayList;

public class Order {
    private int orderNumber;
    private CafeCustomer customer;
    private ArrayList<MenuItem> items;
    private boolean paid;
    private static int nextOrderNumber =1 ;

    public Order(CafeCustomer customer) {
        this.orderNumber = nextOrderNumber;
        this.customer = customer;
        this.items = new ArrayList<>();
        this.paid = false;
        nextOrderNumber++;
    }
    public void addItem(MenuItem item){
        items.add(item);
    }
    public double calculateTotal(){
        double total = 0;
        for(MenuItem item : items){
            total += item.getPrice();
        }
        return total;
    }
    public int countItems(){
        return items.size();
    }
     public void markAsPaid(){
        paid = true;
     }
     public static int getNextOrderNumber() {
        return nextOrderNumber;
     }

    @Override
    public String toString() {
        String status = paid ? "PAID" : "UNPAID";
        String result = "Order #" + orderNumber + " for: " + customer + " [" + status + "]\n";
        for (MenuItem item : items) {
            result += "  - " + item + "\n";
        }
        return result;
    }
}
