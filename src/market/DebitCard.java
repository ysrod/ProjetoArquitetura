package market;

public class DebitCard implements PaymentMethod{
    @Override
    public void calculateTotal() {

    }

    @Override
    public double showTotal() {
        return 0;
    }

    public boolean validatePIN(int PIN){
        return true;
    }
}
