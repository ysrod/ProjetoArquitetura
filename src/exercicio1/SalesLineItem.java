package exercicio1;

public class SalesLineItem {
    private int quantity;
    private double subtotal;
    private ProductDescription product;

    public SalesLineItem() {
        product = new ProductDescription();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSubtotal(){
        return quantity * product.getPrice();
    }
}
