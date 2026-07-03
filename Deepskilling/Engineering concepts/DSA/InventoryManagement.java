import java.util.HashMap;
class product{
    private String pdId;
    private String pdName;
    private int quantity;
    private double price;
    public product(String pdId, String pdName, int quantity, double price){
        this.pdId=pdId;
        this.pdName=pdName;
        this.quantity=quantity;
        this.price=price;
    }
    public String getId(){
        return pdId;
    }
    public String getName(){
        return pdName;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPrice(){
        return price;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public void setPrice(double price){
        this.price=price;
    }

}
class InventoryManager{
    private HashMap<String, product> products = new HashMap<>();
    public void addProduct(product product) {
        products.put(product.getId(), product);
    }
    public void removeProduct(String pdId) {
        products.remove(pdId);
    }
    public void updateQuantity(String pdId, int quantity){
        product p =products.get(pdId);
        if(p!=null){
            p.setQuantity(quantity);
        }
    }
    public void updatePrice(String pdId, double price){
        product p = products.get(pdId);
        if(p!=null){
            p.setPrice(price);
        }
    }
    public void getDetails(String pdId){
        product p = products.get(pdId);
        if(p!=null){
            System.out.println("ID: "+p.getId()+
            ", Name: "+p.getName()+
            ", Quantity: "+p.getQuantity()+
            ", Price: "+p.getPrice());
        }
        else{
            System.out.println("Product not found.");
        }
    }
    public void displayInventory(){
        System.out.println("Inventory:");
        for(product p: products.values()){
            System.out.println("ID: "+p.getId()+
            ", Name: "+p.getName()+
            ", Quantity: "+p.getQuantity()+
            ", Price: "+p.getPrice());
        }
    }

}
public class InventoryManagement {
    public static void main(String[] args) {
        InventoryManager inventoryManager = new InventoryManager();
        product p1 = new product("P001", "pdt1", 20, 100.0);
        product p2 = new product("P002", "pdt2", 30, 200.0);
        inventoryManager.addProduct(p1);
        inventoryManager.addProduct(p2);
        inventoryManager.displayInventory();
        
        inventoryManager.updateQuantity("P001", 25);
        inventoryManager.getDetails("P001");

        
    }
}