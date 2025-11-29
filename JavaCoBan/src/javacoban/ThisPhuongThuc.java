
package javacoban;

class Printer1 {
    public void printStudent(Student2 s) {
        System.out.println("Tên sinh viên: " +s.getName());
    }
}
class Student2 {
    private String name;
    public Student2(String name) {
        this.name = name;
    }
    public String getName() {
        return name;}
    public void show(Printer1 printer) {
        printer.printStudent(this); }
} 
public class ThisPhuongThuc {
     public static void main(String[] args) {
        Student2 s = new Student2("Nam");
        Printer1 p = new Printer1();
        s.show(p);}
}
