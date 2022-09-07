package exercicio1;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Sale {
    private Time time;
    private Date date;
    private double total;

    private ArrayList<SalesLineItem> items;

    public Sale() {
        items = new ArrayList<SalesLineItem>();
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void add (int quantity) {
        for (int i = 0; i < quantity; i++){
            SalesLineItem salesLineItem1 = new SalesLineItem();
            items.add(salesLineItem1);
        }

    }

    public int salesLineSize(){
        return items.size();
    }

    public ArrayList<SalesLineItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<SalesLineItem> items) {
        this.items = items;
    }

    public double getTotal(){
        double total = 0.0;
         for (SalesLineItem item : items){
            total += item.getSubtotal();
        }
         return total;
    }
}
