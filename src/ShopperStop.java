
public class ShopperStop {
    public static void main(String[] args) {
        JuiceVendingMachine juiceVendingMachine = new JuiceVendingMachine();
        juiceVendingMachine.addProduct(new Juice("Apple Juice", 50, 10));
        juiceVendingMachine.addProduct(new Juice("Orange Juice", 60, 5));
        juiceVendingMachine.addProduct(new Juice("Mango Juice", 70, 15));
        System.out.println("Available juices: " + juiceVendingMachine.getAvailableProducts());
        System.out.println("Dispensing apple Juice * 2" + juiceVendingMachine.dispenseProduct("Apple Juice", 2));
        System.out.println("Dispending Orange Juice * 2" + juiceVendingMachine.dispenseProduct("Orange Juice", 6));
        System.out.println("Current Balance " + juiceVendingMachine.checkBalance());
    }
}