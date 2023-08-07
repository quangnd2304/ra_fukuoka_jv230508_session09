package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //Khởi tạo một danh sách từ Interface List và lớp ArrayList
        List<Student> listStudent = new ArrayList<>();
        //add(obj): Thêm một phần tử vào cuối danh sách
        Student student1 = new Student("SV001", "Nguyen Van A", 20);
        Student student2 = new Student("SV002", "Nguyen Van B", 22);
        Student student3 = new Student("SV003", "Nguyen Van C", 25);
        listStudent.add(student1);
        listStudent.add(student2);
        //addAll(list): Thêm một danh sách vào danh sách hiện tại
        List<Student> listStudentNew = new ArrayList<>();
        listStudentNew.addAll(listStudent);

        //contains(obj): Kiểm tra đối tượng obj có trong danh sách không
        System.out.println("Kiểm tra student3 có trong listStudent: " + listStudent.contains(student3));
        System.out.println("Kiểm tra student2 có trong listStudent: " + listStudent.contains(student2));
        //containsAll(list): kiểm tra list có trong danh sách không
        System.out.println("Kiểm tra listStudentNew có trong danh sách listStudent: " + listStudent.containsAll(listStudentNew));
        //clear(): Xóa tất cả các phần tử trong danh sách
        listStudentNew.clear();
        //isEmpty(): Kiểm tra danh sách có phần tử chưa
        System.out.println("Kiếm tra listStudent có phần tử chưa: " + listStudent.isEmpty());
        //remove(object obj): Xóa phần tử obj trong danh sách
        listStudent.remove(student1);
        //size(): trả ra số phần tử trong danh sách
        System.out.println("Số phần tử trong listStudent: " + listStudent.size());
        //add(int index, object obj): Thêm phần tử vào chỉ số index
        listStudent.add(0, student1);
        listStudent.add(2, student3);
        listStudent.add(3, student1);
        //get(index): lấy phần tử chỉ số index
        System.out.println("Sinh viên có chỉ số 1 là: " + listStudent.get(1));
        //indexOf(obj): Trả ra chỉ số obj trong danh sách
        System.out.println("Chỉ số student1 năm trong danh sách: " + listStudent.indexOf(student1));
        System.out.println("Chỉ số student1 nằm cuối trong danh sách: " + listStudent.lastIndexOf(student1));
        //remove(index): Xóa phần tử tại chỉ số index
        listStudent.remove(0);
        //set(index,element): Đè phần tử element vào vị trí index
        listStudent.set(0, student1);
        //subList(fromIndex,toIndex): Cắt danh sách từ chỉ số formIndex đến <toIndex
        List<Student> listSub = listStudent.subList(0, 2);
        System.out.println("Danh sách sinh viên: " + listStudent);
        System.out.println("Danh sách sinh viên mới: " + listStudentNew);
        System.out.println("Danh sách cắt: " + listSub);

        ArrayList<Student> objListStudent = new ArrayList<>(10);//objListStudent có thể chứa được 10 phần tử
        objListStudent.add(student1);
        objListStudent.add(student2);
        objListStudent.add(student3);
        //objListStudent có thể chứa 10 phần tử
        objListStudent.trimToSize();//objListStudent có thể chứa 3 phần tử


    }
}
