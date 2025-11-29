
package javacoban;
class Logger {
    public Logger(Student3 s) {
        System.out.println("Tạo logger cho sinh viên: " + s.getName());
    }
}
class Student3 {
    private String name;
    public Student3(String name) {
        this.name = name;
        new Logger(this); 
    }
    public String getName() {
        return name;
    }
}


public class ThisHamTao {
    public static void main(String[] args) {
         Student3 s = new Student3("An");
     }

}
// class Main3 {
//    public static void main(String[] args) {
//         Student3 s = new Student3("An");
//     }
//
//}
