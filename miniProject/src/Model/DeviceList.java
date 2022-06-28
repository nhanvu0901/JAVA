package Model;

import java.util.ArrayList;
import java.util.List;

/*
 * is a list Device of either Laptop or Phone (use 2 DeviceList, one for Laptop, one for Phone)
 * perform the functions: adding, removing, modifing, searching in List
 */
public class DeviceList {
   private List<Device> list = new ArrayList<Device>();

   public void add(Device newDv){
       if(list.contains(newDv)){
          int i = list.indexOf(newDv);
          list.get(i).amount +=1;
       }
       else{
           list.add(newDv);
       }
   }

   public void remove(Device dv ){
       list.remove(dv);
   }

   public void modify(Device dv , Device dvModified){
       int i = list.indexOf(dv);
       list.remove(dv);
       list.add(i,dvModified);
   }
    public List<Device> searchByBrandAndName(String make, String name, int status) {
        List<Device> searchedList = new ArrayList<>();
        int minDv = status;
        /*
         * status = 0 <=> all <=> amount of Device >= 0
         * status = 1 <=> stocking <=> amount of Device >= 1
         * => temporary: minDv = status
         * */
        for (Device dv : list)
            if (dv.amount >= minDv && dv.name.toUpperCase().contains(name.toUpperCase()) && dv.brand.toUpperCase().contains(make.toUpperCase())) searchedList.add(dv);


        return searchedList;
    }

}
