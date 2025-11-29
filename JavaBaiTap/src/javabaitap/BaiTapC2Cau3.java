
package javabaitap;

import java.util.Scanner;

// vuông, vuông cân, cân, đều, tam giác thường.

public class BaiTapC2Cau3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao 3 so bat ki: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        // Kiem tra canh la cua tam giac
        if(isTriangle(a, b, c)){
            System.out.println(a + " " + b + " " + c + " la 3 canh cua 1 tam giac");
            if (isEquilateralTri(a, b, c)){
                System.out.println(a + " " + b + " " + c + " la 3 canh cua 1 tam giac deu ");
            } else if (isIsoAndSqrTri(a, b, c)){
                System.out.println(a + " " + b + " " + c + " la 3 canh cua 1 tam giac vuong can ");
            } else if (isSquareTriangle(a, b, c)){
                System.out.println(a + " " + b + " " + c + " la 3 canh cua 1 tam giac vuong ");
            } else if (isIsoscelesTri(a, b, c)){
                System.out.println(a + " " + b + " " + c + " la 3 canh cua 1 tam giac can ");
            } else {
                System.out.println(a + " " + b + " " + c + " la 3 canh cua 1 tam giac thuong ");
            }
            
        } else {
            System.out.println(a + " " + b + " " + c + " khong la 3 canh cua 1 tam giac");
        }
        

    }
    // check tam giac
    public static boolean isTriangle(int a, int b, int c){
        if ((a+b>c) && (a+c>b) && (b+c>a)){
            return  true;
        } else return false;
        
    }
    //check tam giac vuong
    public static boolean isSquareTriangle(int a, int b, int c){
        if (isTriangle(a, b, c)){
            if ( (a*a + b*b == c*c) || (a*a + c*c == b*b) || (b*b + c*c == a*a) ){
                return true;
            } else return false;
        } else return false;
    }
    //check tam giac can
    public static boolean isIsoscelesTri(int a, int b, int c){
        if (isTriangle(a, b, c)){
            if ( (a == b) || (a == c) || (b == c) ){
                return true;
            } else return false;
        } else return false;
    }
    //check tam giac vuong can
    public static boolean isIsoAndSqrTri(int a, int b, int c){
        if (isTriangle(a, b, c)){
            if (isIsoscelesTri(a, b, c) && isSquareTriangle(a, b, c)){
                return true;
            } else return false;
        } else return false;
    }
    // check tam giac deu
    public static boolean isEquilateralTri(int a, int b, int c){
        if (isTriangle(a, b, c)){
            if ((a==b) && (b==c)){
                return true;
            } else return false;
        } else return false;
    }
    
}
    

