package DailyQuiz.DailyQuiz6;

import Java_study.overloading_study.Calculator;

public class Cart {
    final private Product[] products;

    public Cart(Product[] products) {
        this.products = products;
    }

    public int getTotalPriceIncludeDiscount() {
        int total = 0;
        for (Product product : products) {
            int price = product.getPrice() - product.getDiscountAmount();
            total += price;
        }
        return total;
    }

    public double getTotalWeight() {
        double weight = 0;
        for (Product product : products) {
            weight += product.weight;
        }
        return weight;
    }

    public int calculateDeliveryCharge() {
        int deliveryCharge = Calculator.getDeliveryCharge(
                getTotalWeight(), getTotalPriceIncludeDiscount());
        return deliveryCharge;
    }

}

