import java.util.HashMap;

public class Inventory {
    private HashMap<String, Item> items = new HashMap<>();

    
    public void addItem(Item item) {
        items.put(item.getItemId(), item);
        System.out.println("Item added successfully!");
    }

    
    public void removeItem(String id) {
        if (items.remove(id) != null) {
            System.out.println("Item removed!");
        } else {
            System.out.println("Item not found!");
        }
    }

    
    public void updateQuantity(String id, int quantity) {
        Item item = items.get(id);
        if (item != null) {
            item.setQuantity(quantity);
            System.out.println("Quantity updated!");
        } else {
            System.out.println("Item not found!");
        }
    }

    
    public void searchItem(String keyword) {
        boolean found = false;
        for (Item item : items.values()) {
            if (item.getItemId().equalsIgnoreCase(keyword) ||
                item.getItemName().equalsIgnoreCase(keyword)) {
                System.out.println(item);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Item not found!");
        }
    }

    
    public void displayAll() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty!");
        } else {
            for (Item item : items.values()) {
                System.out.println(item);
            }
        }
    }
}