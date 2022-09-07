package exercicio1;

public class Register {

    private Sale sale;

    public Register(){

    }

    public void makeLineItem(int quantity){
        sale.add(quantity);
    }


    public void print(){
        for (int i = 0; i < this.sale.salesLineSize(); i++) {
            System.out.println(this.sale.getItems().get(i).getProduct().getItemID() + "x "+ this.sale.getItems().get(i).getQuantity() + "." +
                    ".." +
                    "... = R$" + this.sale.getItems().get(i).getSubtotal());
        }

        System.out.println("R$ "+ this.sale.getTotal());
    }
}
