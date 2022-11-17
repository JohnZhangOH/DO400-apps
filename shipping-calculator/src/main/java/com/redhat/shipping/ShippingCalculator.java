package com.redhat.shipping;
import java.util.HashMap;
import java.util.Map;
public class ShippingCalculator{
     /*
    public int costForRegion(String name){
       
        if (name.equals("NA")){
            return 100;
        }
        if (name.equals("LATAM")){
            return 200;
        }
        if (name.equals("EMEA")){
            return 300;
        }
        if (name.equals("APAC")){
            return 400;
        }
    }
        */
    public static final Map<String, Integer> REGIONS = new HashMap<>();
    public ShippingCalculator() {
        ShippingCalculator.REGIONS.put("NA", 100);
        ShippingCalculator.REGIONS.put("LATAM", 200);
        ShippingCalculator.REGIONS.put("EMEA", 300);
        ShippingCalculator.REGIONS.put("APAC", 400);
    }
    /*
    public int costForRegion(String name) {
        if (ShippingCalculator.REGIONS.containsKey(name)) {
            return ShippingCalculator.REGIONS.get(name);
        }
    */
    public int costForRegion(String name) throws RegionNotFoundException {
        if (ShippingCalculator.REGIONS.containsKey(name)) {
            return ShippingCalculator.REGIONS.get(name);
        }
        throw new RegionNotFoundException();
    }

}
