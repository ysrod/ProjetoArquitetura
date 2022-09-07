package exercicio1;

public class SalesLineItem {
    private int quantity;
    private double subtotal;
    private int itemID;
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

    public ProductDescription getProduct() {
        return product;
    }

    public void setProduct(ProductDescription product) {
        this.product = product;
    }
}
