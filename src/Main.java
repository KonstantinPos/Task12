import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MyClass myClass = new MyClass();
        System.out.println("Введите первое число");
        myClass.setA(scanner.nextInt());
        System.out.println("Введите второе число. Оно должно быть больше первого");
        myClass.setB(scanner.nextInt());
        while (myClass.getA() >= myClass.getB()) {
            System.out.println("Условие не выполнено, введите число больше чем " + myClass.getA());
            myClass.setB(scanner.nextInt());
        }  {
            System.out.println("Случайное число в дипазоне от " + myClass.getA() + " до " + myClass.getB() + " равно " + ((int) (Math.random() * (myClass.getB() - myClass.getA())) + myClass.getA()));
        }
    }
    static class MyClass {
        int a;
        int b;

        int getA() {
            return a;
        }

        void setA(int a) {
            this.a = a;
        }

        int getB() {
            return b;
        }

        void setB(int b) {
            this.b = b;
        }


    }
}
