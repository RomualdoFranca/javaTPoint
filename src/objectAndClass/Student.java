package objectAndClass;

public class Student {

    String name;
    int id;
    // Initialization through method
    void insertRecord(int r, String n) { // metodo para inserir os dados
        id = r;
        name = n;
    }

    void displayInformation() { // metodo para o output dos dados
        System.out.println(id + " " + name);

    }
}

class TestStudent4 {
    public static void main(String[] args) {
        // criando objeto estudante
        Student s1 = new Student();
        Student s2 = new Student();

        // chamando o metodo para inserir dados
        s1.insertRecord(10, "Mamão");
        s2.insertRecord(20, "Puga");

        // chamando o metodo para imprimir os dados
        s1.displayInformation();
        s2.displayInformation();
    }
}
