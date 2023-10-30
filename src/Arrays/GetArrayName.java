package Arrays;

public class GetArrayName {
    public static void main(String[] args) {
        ////declaration and initialization of array
        int[] arr = {1, 2, 3};
        Class c = arr.getClass();
        String name = c.getName();
        System.out.println(name);

    }
}
