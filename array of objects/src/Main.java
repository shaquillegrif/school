public class Main {
    public static void main(String[] args) {

       Car[] cars = {new Car("mustang", "red"),
                    new Car("corvette", "blue"),
                    new Car("charger", "green"),
       };

        for (Car car : cars) {
            car.drive();
        }
    }
}
