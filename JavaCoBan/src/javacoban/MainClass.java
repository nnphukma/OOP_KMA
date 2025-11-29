
package javacoban;


public class MainClass {
    public static void main(String[] args) {
        

        /* Test Class Car và Engine: thuộc tính của lớp này là đối tượng của lớp kia
        
        Engine engine = new Engine("VF 8", 402);
        Car car = new Car("VinFast", engine);
        car.startCar();
        */
        
        /* Test Class BankAccount2 - Lớp Lồng Nhau
        
        BankAccount2 acc = new BankAccount2("Nguyễn Quang Minh", 500000);
        acc.showBalance();
        // Tạo giao dịch nạp tiền
        BankAccount2.Transaction t1 = acc.new Transaction("deposit", 200000);
        t1.process();
        // Tạo giao dịch rút tiền
        BankAccount2.Transaction t2 = acc.new Transaction("withdraw", 100000);
        t2.process();
        acc.showBalance();
        */

        /* Test class BankAccount
        
        BankAccount tkMinh = new BankAccount(1000);
        tkMinh.deposit(500);
        tkMinh.withdraw(800);
        System.out.println("Số dư là: "+ tkMinh.getBalance()) ;      
        */
        
        /* Test class Student
        
        Student sv = new Student();
        sv.setAge(30);
        sv.setName("Bình");
        System.out.println("Sinh viên: " + sv.getName() + ", tuổi: " + sv.getAge());
        */
    }

}
