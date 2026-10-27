public class Main {
    public static void main(String[] args) {
        Car firstCar = new Car(2004, "Audi");
        firstCar.setYear(2007);
        firstCar.print();
        ///
        Rectangle rectangle = new Rectangle(3,4);
        rectangle.setWidth(7);
        int sq = rectangle.calculateArea();
        System.out.println("Площадь прямоугольника равна " + sq);
        ///
        BankAccount account = new BankAccount("Иван Иванов", 20000);
        account.setBalance(account.deposit(5000));
        account.setBalance(account.withdraw(9000));
        account.printBalance();
        ///
        Book book1 = new Book("Евгений Онегин", "Александр Пушкин");
        book1.setAuthor("Александр Дюма");
        book1.printInfo();
        ///
        Point point1 = new Point(-4, 8);
        point1.setX(-19);
        System.out.println("Координаты точки: " + point1.x + ";" + point1.y);
        ///
        StudentGroup group1 = new StudentGroup("АГ-2032", 21);
        group1.setStudentCount(16);
        group1.printInfo();
        ///
        Circle circle = new Circle(4.2);
        circle.setRadius(1.9);
        System.out.println("Площадь круга: " + circle.calculateArea() + ", Длина окружности: " + circle.calculateCircumference());
        ///
        Teacher teacher1 = new Teacher("Федотов Михаил Петрович", "Математика");
        teacher1.setSubject("Физика");
        teacher1.printInfo();
        ///
        Product id1 = new Product("Сыр", 140.8F);
        id1.setPrice(200.0F);
        System.out.println("Цена товара: " + id1.applyDiscount(50));
        ///
        Laptop laptop1 = new Laptop("Lenovo", 56700);
        laptop1.setPrice(68900);
        laptop1.printInfo();



    }
}
