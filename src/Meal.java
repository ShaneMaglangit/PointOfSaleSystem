/**
 *
 * @author maglangitsd
 */
public class Meal {
    private int quantity;
    private String name;
    private int price;

    public Meal(int quantity, String name, int price) {
        this.quantity = quantity;
        this.name = name;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getTotal() {
        return price * quantity;
    }
    
    @Override
    public String toString() {
        return quantity + "        " + name + "              " + price + "               " + getTotal();
    }
    
    
}
