class Employee {
    int id;
    String name;

    void printDetails() {
        System.out.println(id);
        System.out.println(name);
    }
}

public class oops {
    public static void main(String[] args) {

        Employee e1 = new Employee();

        e1.id = 1;
        e1.name = "Aryan";

        e1.printDetails();
    }
}
