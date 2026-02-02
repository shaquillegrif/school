public class Main {
    public static void main(String[] args) {

        Car car = new Car("charger", "black", 1900000);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}
