package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AVGPriceCalculation avgPriceCalculation = new AVGPriceCalculation();
        String total = avgPriceCalculation.avgPriceCalculation(
                "50",
                "50",
                "50",
                "50",
                "50",
                "50",
                "50",
                "50");
       System.out.println(total);
    }
}
