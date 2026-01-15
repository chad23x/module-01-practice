public class Store {

String productType;
double price;

    public Store (String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    public void increasePrice(double priceToAdd) {
        double newPrice = priceToAdd + price;
        price = newPrice;
    }
    
    public double priceWithTax() {
        double tax = 0.08;
        double totalPrice = price - price*tax;
        return totalPrice;
    }

    public String toString() {
        return "This store sells " + productType + " at a price of " + price + ".";
    }

    public static void main (String[] args) {
        Store lemonadeStand = new Store("Lemonade", 3.75);
        Store cookieShop = new Store("Cookies", 5);
        System.out.println(lemonadeStand);
        System.out.println(cookieShop);

        lemonadeStand.increasePrice(1.00);
        cookieShop.increasePrice(2.01);

        double finalLemonadePrice = lemonadeStand.priceWithTax();
        System.out.println("Final price for lemonade is " + finalLemonadePrice);
        double finalCookiePrice = cookieShop.priceWithTax();
        System.out.println("Final price for cookies are " + finalCookiePrice);
    }
}
