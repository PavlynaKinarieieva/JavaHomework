public class Main {
    public static void main(String[] args) {
        Account account = new Account(1500, "scientist");

        Car car1 = new Car(2000, "stylish");
        Car car2 = new Car(1000, "scientist");

        Phone phone1 = new Phone(1000, "programmer");
        Phone phone2 = new Phone(1500, "captain");

        Plane plane1 = new Plane(1500, "scientist");
        Plane plane2 = new Plane(2000, "captain");

        DownshifterKit kit = new DownshifterKit(0, "stylish");

        buyItem(account, car1, car2, phone1, phone2, plane1, plane2, kit);
    }

    public static void buyItem(Account account, Car car1, Car car2, Phone phone1, Phone phone2, Plane plane1, Plane plane2, DownshifterKit kit) {
        if (account.currentAmount >= plane1.price && account.category.equals(plane1.category)) {
            System.out.println("Buying Plane(Price: " + plane1.price + ", Category: " + plane1.category + ")");
        }
        else if (account.currentAmount >= plane2.price && account.category.equals(plane2.category)) {
            System.out.println("Buying Plane(Price: " + plane2.price + ", Category: " + plane2.category + ")");
        }
        else if (account.currentAmount >= phone1.price && account.category.equals(phone1.category)) {
            System.out.println("Buying Phone(Price: " + phone1.price + ", Category: " + phone1.category + ")");
        }
        else if (account.currentAmount >= phone2.price && account.category.equals(phone2.category)) {
            System.out.println("Buying Phone(Price: " + phone2.price + ", Category: " + phone2.category + ")");
        }
        else if (account.currentAmount >= car1.price && account.category.equals(car1.category)) {
            System.out.println("Buying Car(Price: " + car1.price + ", Category: " + car1.category + ")");
        }
        else if (account.currentAmount >= car2.price && account.category.equals(car2.category)) {
            System.out.println("Buying Car(Price: " + car2.price + ", Category: " + car2.category + ")");
        }
        else {
            System.out.println("Cannot buy any item with the current account information.");
        }
    }
}