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

    public double getTotal(){
        double total = 0.0;
         for (SalesLineItem item : items){
            total += item.getSubtotal();
        }
         return total;
    }
}
