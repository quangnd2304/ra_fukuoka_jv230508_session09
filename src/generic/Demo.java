package generic;

public class Demo {
    public void printArray(int[] arr) {
        System.out.println("Các phần tử của mảng: ");
        for (int element : arr) {
            System.out.println(element);
        }
    }
    public void printArray(float[] arr) {
        System.out.println("Các phần tử của mảng: ");
        for (float element : arr) {
            System.out.println(element);
        }
    }
    public void printArray(String[] arr) {
        System.out.println("Các phần tử của mảng: ");
        for (String element : arr) {
            System.out.println(element);
        }
    }
}
