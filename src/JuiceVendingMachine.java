
import java.util.*;

class JuiceVendingMachine implements VendingMachine {
    private List<Product> availableProducts;
    private int balance;

    public JuiceVendingMachine() {
        availableProducts = new ArrayList<>();
        balance = 0;
    }

    public List<Product> getAvailableProducts() {
        return availableProducts;
    }

    public boolean dispenseProduct(String productName, int amount) {
        for (Product product : availableProducts) {
            if (product.getName().equals(productName) && product.getQuantity() >= amount) {
                product.setQuantity(product.getQuantity() - amount);
                balance += amount * product.getPrice();
                return true;
            }
        }
        return false;
    }

    public void addProduct(Product product) {
        availableProducts.add(product);
    }

    public int checkBalance() {
        return balance;
    }

    public void refill(int amount) {
        balance += amount;
    }
}