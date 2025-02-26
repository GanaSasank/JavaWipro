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
    }
}