public class Product {
    String name;
    float price;

    Product (String someName, float somePrice) {
        this.name = someName;
        this.price = somePrice;
    }

    String getName () {
        return this.name;
    }

    float getPrice () {
        return this.price;
    }

    void setPrice (float newPrice) {
        this.price = newPrice;
    }

    public float applyDiscount(int discount) {
        return this.price - (this.price * discount / 100);
    }
}
