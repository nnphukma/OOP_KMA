
package javacoban;


public class Calculator {
        /**
     * Cộng hai số nguyên.
     *
     * @param a Số nguyên thứ nhất.
     * @param b Số nguyên thứ hai.
     * @return Tổng của a và b.
     */
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public double divide(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("5 + 3 = " + c.add(5, 3));
        System.out.println("5 - 3 = " + c.subtract(5, 3));
        System.out.println("5 * 3 = " + c.multiply(5, 3));
        System.out.println("5 / 3 = " + c.divide(5, 3));
    }


}

