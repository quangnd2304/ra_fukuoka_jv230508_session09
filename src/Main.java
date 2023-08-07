import generic.Book;
import generic.BookImp;
import generic.ClassGeneric;
import generic.MethodGeneric;

public class Main {
    public static void main(String[] args) {
        Integer[] arrInt = {3,5,7,9};
        String[] arrString = {"Chuỗi 1","Chuỗi 2","Chuỗi 3"};
        Float[] arrFloat = {5.8F,9.2F};
        MethodGeneric mg = new MethodGeneric();
        mg.printArray(arrInt);
        mg.printArray(arrString);
        mg.printArray(arrFloat);
        ClassGeneric<String,String> cg = new ClassGeneric<>("Study","Học");
        System.out.println("Nghĩa của "+cg.getKey()+":"+cg.getValue());

        BookImp<Book> bookImp = new BookImp<>();
        Book book = new Book("B001","Toán học");
        bookImp.create(book);
    }
}