package Behavioral.Memento;

public class MementoDemo {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();

        Employee employee = new Employee();

        employee.setName("Ahmed");
        employee.setPhone("1234");

        System.out.println("before save " + employee);

        careTaker.save(employee);

        employee.setName("new name");

        System.out.println("before after change " + employee);

        careTaker.revert(employee);

        System.out.println("before after redo " + employee);

    }
}
