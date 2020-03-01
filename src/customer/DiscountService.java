package customer;

public class DiscountService {
    public Double calculateDiscountPrice(Client client, double price) {
        if (client.premium)
            return calculatePremiumDiscount(price);
        else
            return calculateStandardDiscount(price);
    }

    private double calculateStandardDiscount(double price) {
        if (price > 1000) {
            return applyDiscount(price, 0.1);
        } else {
            return price;
        }
    }

    double calculatePremiumDiscount(double price) {
        if (price > 1000) {
            return applyDiscount(price, 0.15);
        } else {
            return applyDiscount(price, 0.05);
        }
    }

    private double applyDiscount(double price, double discoutnt) {
        return price * (1 - discoutnt);

    }
}









