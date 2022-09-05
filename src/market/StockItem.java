package market;

public class StockItem {

    private Item item;
    private int quantity;
    private StockItem next;
    private StockItem prior;

    public StockItem(Item item, int quantity){
        this.item = item;
        this.quantity = quantity;
        this.next = null;
        this.prior = null;
    }

    public StockItem getNext() {
        return next;
    }

    public void setNext(StockItem next) {
        this.next = next;
    }

    public StockItem getPrior() {
        return prior;
    }

    public void setPrior(StockItem prior) {
        this.prior = prior;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
