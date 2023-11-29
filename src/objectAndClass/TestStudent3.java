package objectAndClass;

public class TestStudent3 {
    int id;
    String name;

    //create multiple objects and store information in it through reference variable.
    public static void main(String[] args) {
        // creating  objects
        TestStudent3 s1 = new TestStudent3();
        TestStudent3 s2 = new TestStudent3();

        // Initializing objects
        s1.id = 2;
        s1.name = "Loxa";
        s2.id = 3;
        s2.name = "Mario";
        // Print data
        System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + " " + s2.name);



    }
}
