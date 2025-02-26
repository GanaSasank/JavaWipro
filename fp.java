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
        for (int i = 0; i < 10; i++) {
            obj1.shows();
        }

        for (int i = 0; i < 10; i++) {
            obj2.shows();
        }
    }

}

class A {
    public void shows() {
        System.out.println("Hello");
    }
}

class B {
    public void shows() {
        System.out.println("Hi");
    }

}