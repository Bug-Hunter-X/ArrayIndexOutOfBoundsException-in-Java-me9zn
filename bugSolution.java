public class MyClass {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int index = 10;
        if (index >= 0 && index < array.length) {
            System.out.println(array[index]);
        } else {
            System.out.println("Index out of bounds");
        }
    }
}