package objectAndClass;


// 3 ways to initialize  object
public class TestStudent {
    int id;
    String name;

}
class TestStudent2{

    public static void main(String[] args) {
        // By reference variable
        TestStudent s1 = new TestStudent();
        s1.id = 1;
        s1.name = "Sunda";
        System.out.println(s1.id + " " + s1.name);

    }

}
