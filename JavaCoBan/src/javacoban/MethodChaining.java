
package javacoban;

class Person {
        private String name;
        private int age;
        public Person setName(String name) {
            this.name = name;
            return this; 
        }

        public void setAge(int age) {
            this.age = age;
        }
        
}

public class MethodChaining {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Nam").setAge(12);
    }

}
