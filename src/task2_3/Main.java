package task2_3;

public class Main {
    public static void main(String[] args) {
        Employee manager = new Employee("Oksana", "office manager", "oksana@gmail.com", "+380679876543", 25);

        System.out.println(
                        "name: " + manager.getName() + "\n" +
                        "position: " + manager.getPosition() + "\n" +
                        "email: " + manager.getEmail() + "\n" +
                        "phone: " + manager.getPhone() + "\n" +
                        "age: " + manager.getAge() + "\n"
        );
    }
}
