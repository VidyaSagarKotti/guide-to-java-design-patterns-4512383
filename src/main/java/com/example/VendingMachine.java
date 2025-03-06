package com.example;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;
import java.lang.IllegalArgumentException;

public class VendingMachine {
    private static final Map<String, Supplier<Snack>> snackMap = new HashMap<>();

    static {
        snackMap.put("Chips", Chips::new);
        snackMap.put("ChocolateBar", ChocolateBar::new);
        snackMap.put("Drink", Drink::new);
    }
    
    Snack getSnack(String snackType) {
        if(snackMap.get(snackType) != null){
            return snackMap.get(snackType).get();
        }
        else {
            throw new IllegalArgumentException("Invalid SnackType");
        }
    }


}
