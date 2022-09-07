package market;

public class CreditCard implements PaymentMethod{
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

    public double calcInstallments(int installment){
        return showTotal()/installment;
    }
}
