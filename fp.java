// byte code stores a data upto -128 to 127 bits
/**
 * fp
 */
// public class fp {

// public static void main(String[] args) {
// int a=0;
// System.out.println(a);
// a++;
// System.out.println(a);
// ++a;
// System.out.println(a);
// a=a+1;
// System.out.println(a);
// a=a-1;
// System.out.println(a);
// }
// }

// As a part of Threading Here needed few changes in the code Like the
// 1 normal class should become Thread
// 2 There should be Start method
// 3 There should be run menthods

public class fp {

    public static void main(String[] args) {
        int a = 0;
        int b = 12;
        try {
            System.out.println(b / a);
        } catch (ArithmeticException e) {
            System.out.println("Denominator cant be zero");
        }

        A obj1 = new A();
        B obj2 = new B();
        obj1.start();
        obj2.start();
    }

}

class A extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
        }
    }

}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
        }
    }

}

/// Working Thread code