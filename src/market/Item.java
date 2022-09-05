package market;

public class Item {

    private String itemID;
    private double price;

    public Item(String itemID, double price){
        this.itemID = itemID;
        this.price = price;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
