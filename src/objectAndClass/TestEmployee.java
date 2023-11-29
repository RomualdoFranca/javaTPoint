package objectAndClass;


class Employee {
    int id;
    String name;
    float salary;

    // no metodo de inserir dados, os parametros fazem referencia as variaveis de instacias
    void insert(int i, String n, float s ) {
        id = i;
        name = n;
        salary = s;
    }

    void display() {
        System.out.printf("ID: %s\nName: %s\nSalary: %.2f\n", id, name, salary);
    }
}
public class TestEmployee {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        // Initialization of reference variables:
        Employee employee3 = new Employee(), employee4 = new Employee(), employee5 = new Employee();

        employee1.insert(1, "Lua", 2000);
        employee2.insert(2, "Puga", 100);
        employee3.insert(3, "Romualdo", 3700);

        employee1.display();
        employee2.display();
        employee3.display();
    }
}
