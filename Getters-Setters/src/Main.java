public class Main {
    public static void main(String[] args) {

        Car car = new Car("charger", "black", 1900000);

        car.setColor("blue");
        car.setPrice(100);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}
