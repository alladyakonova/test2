public class Car {
    int year;
    String brand;

    Car(int someYear, String someBrand) {
        this.year = someYear;
        this.brand = someBrand;
    }

    int getYear() {
        return this.year;
    }

    String getBrand() {
        return this.brand;
    }

    void setYear(int newYear) {
        this.year = newYear;
    }

    void setBrand (String newBrand) {
        this.brand = newBrand;
    }

    void print() {
        System.out.println("Марка авто: " + this.brand + ", Год выпуска: " + this.year);
    }
}
