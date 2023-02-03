import java.util.List;

interface VendingMachine {
    List<Product> getAvailableProducts();

    boolean dispenseProduct(String productName, int amount);

    void addProduct(Product product);

    int checkBalance();

    void refill(int amount);
}
