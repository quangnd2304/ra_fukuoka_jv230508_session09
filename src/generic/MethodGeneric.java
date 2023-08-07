package generic;

public class MethodGeneric {
    public <T> void printArray(T[] arr) {
        System.out.println("Các phần tử trong mảng là: ");
        for (T element : arr) {
            System.out.println(element);
        }
    }
}
