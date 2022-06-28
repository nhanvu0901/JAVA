package Model;

import java.util.ArrayList;
import java.util.List;

// lop de add don hang
public class Cart {
    protected List<Device> list = new ArrayList<Device>();
    protected double totalCost, totalProfit;

    public void addDevice(Device newDV){
        Device tempDv;
        if(newDV.getType() == Device.LAPTOP_TYPE) tempDv = new Laptop(newDV); // minh can tempDv de bien cai newDv thanh laptop hoav phone
        else tempDv = new Phone(newDV);
        tempDv.amount=1;

        if(list.contains(tempDv)){
          int i = list.indexOf(tempDv);
          list.get(i).amount +=1;
        }
        else{
            list.add(tempDv);
        }
        totalCost += tempDv.sellPrice;
        totalProfit += tempDv.sellPrice - tempDv.costPrice;
    }
    public List<Device> getList(){
        return list;
    }
    public double getTotalCost() {
        return Math.round(totalCost*100)/100;
    }
}
