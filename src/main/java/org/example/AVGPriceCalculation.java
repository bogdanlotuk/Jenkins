package org.example;
import java.text.DecimalFormat;

public class AVGPriceCalculation {

    final DecimalFormat df = new DecimalFormat("0.00");
    double priceLocation1Category1;
    double occupancyLocation1Category1;
    double priceLocation1Category2;
    double occupancyLocation1Category2;
    double priceLocation2Category1;
    double occupancyLocation2Category1;
    double priceLocation2Category2;
    double occupancyLocation2Category2;

    public String avgPriceCalculation(
            String priceLocation1Category1Input,
            String occupancyLocation1Category1Input,
            String priceLocation1Category2Input,
            String occupancyLocation1Category2Input,
            String priceLocation2Category1Input,
            String occupancyLocation2Category1Input,
            String priceLocation2Category2Input,
            String occupancyLocation2Category2Input
    ) {
        this.priceLocation1Category1 = Double.parseDouble(priceLocation1Category1Input);
        this.occupancyLocation1Category1 = Double.parseDouble(occupancyLocation1Category1Input);
        this.priceLocation1Category2 = Double.parseDouble(priceLocation1Category2Input);
        this.occupancyLocation1Category2 = Double.parseDouble(occupancyLocation1Category2Input);
        this.priceLocation2Category1 = Double.parseDouble(priceLocation2Category1Input);
        this.occupancyLocation2Category1 = Double.parseDouble(occupancyLocation2Category1Input);
        this.priceLocation2Category2 = Double.parseDouble(priceLocation2Category2Input);
        this.occupancyLocation2Category2 = Double.parseDouble(occupancyLocation2Category2Input);


        double Location1Category1Sum = priceLocation1Category1 * occupancyLocation1Category1;
        double Location1Category2Sum = priceLocation1Category2 * occupancyLocation1Category2;
        double Location2Category1Sum = priceLocation2Category1 * occupancyLocation2Category1;
        double Location2Category2Sum = priceLocation2Category2 * occupancyLocation2Category2;

        String TotalPrice = df.format((Location1Category1Sum + Location1Category2Sum + Location2Category1Sum + Location2Category2Sum) / (occupancyLocation1Category1 + occupancyLocation1Category2 + occupancyLocation2Category1 + occupancyLocation2Category2)).replace(",", ".");
        return TotalPrice;
    }
}
