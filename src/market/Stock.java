package market;

import java.util.Objects;

public class Stock {
    private StockItem firstItem;
    private StockItem lastItem;
    private int counter;


    public int size(){
        return counter;
    }
    public Stock(){
        this.firstItem = null;
        this.lastItem = null;
        this.counter = 0;
    }

    public void add(Item item, int quantity){
        StockItem newStockItem = new StockItem(item, quantity);

        if(firstItem == null){
            firstItem = newStockItem;
            lastItem = newStockItem;
            firstItem.setNext(lastItem);
            lastItem.setPrior(firstItem);
        } else {
            lastItem.setNext(newStockItem);
            newStockItem.setPrior(lastItem);
            lastItem = newStockItem;

        }
        counter++;
    }

    public void updateQuantity(String itemID, int quantityBought){
        StockItem aux = firstItem;
        while (!Objects.equals(aux.getItem().getItemID(), itemID)){
            aux = aux.getNext();
        }

        if (aux.getQuantity() > 0) {
            aux.setQuantity(aux.getQuantity()-quantityBought);
        }

        if (aux.getQuantity() < 0) {
            aux.setQuantity(0);
        }

    }

    public int stockQuantity(String itemID){
        StockItem aux = firstItem;
        while (!Objects.equals(aux.getItem().getItemID(), itemID)){
            aux = aux.getNext();
        }
        return aux.getQuantity();
    }
}
