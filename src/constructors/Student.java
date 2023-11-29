package constructors;

//The parameterized constructor is used to provide different values to distinct objects.
// However, you can provide the same values also.
public class Student {

    int id;
    String name;

    //creating a parameterized constructor
    Student(int i, String s) {
        id = i;
        name = s;
    }
    //method to display the values
    void display() {
        System.out.printf("Id: %s Name: %s\n", id, name );

    }

    public static void main(String[] args) {

        //creating objects and passing values
        Student s1 = new Student(1, "Lua");
        Student s2 = new Student(2, "Maga");

        s1.display();
        s2.display();
    }
}
