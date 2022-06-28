package Model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    protected List<Store> list = new ArrayList<Store>();
    protected double totalCost;

    public void add(Store store) {
        Store tempStore = null;
        tempStore.food_number =1;

        if (list.contains(tempStore)) {
            int i = list.indexOf(tempStore);
            list.get(i).food_number += tempStore.food_number;
        }
        else {
            list.add(tempStore);
        }
        totalCost += tempStore.food_price;

    }

    public List<Store> getList() {
        return list;
    }

    public double getTotalCost() {
        return Math.round(totalCost*100)/100;
    }

}
