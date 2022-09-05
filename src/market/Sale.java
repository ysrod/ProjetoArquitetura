package market;

import java.util.ArrayList;

public class Sale {
    private double cash;
    private ArrayList<Item> saleItems;
    private Stock stock;

    public void addItems(Item item, int quantity){
        if (stock.stockQuantity(item.getItemID())>0){
            this.saleItems.add(item);
            this.stock.updateQuantity(item.getItemID(), quantity);
        }


    }
}
