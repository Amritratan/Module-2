package com.driver;

public class Bill {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Pizza order1 = new Pizza(true);
        order1.takeAway();
        System.out.println(order1.generateBill());
 
        System.out.println();
        Deluxpizza order2 = new Deluxpizza(false);
        order2.takeAway();
        System.out.println(order2.generateBill());
 
    }
}

