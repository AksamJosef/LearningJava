package Exceptions;

public class less727 {

    public static void main(String[] args) {
        try (Car car = new Car()) {
            car.drive();
        } catch (Exception e) {
        }
    }
    public static class Car implements AutoCloseable {
        public void drive() {
            System.out.println("Машина поехала.");
        }

        public void close() throws Exception {
            System.out.println("Машина закрывается...");
        }
    }

}
