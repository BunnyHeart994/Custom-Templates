public class Swap {
    public static Object a, b;

    //MAIN METHOD FOR TESTS
    /*public static void main(String[] args) {
        swap("a", "b");
        Print.print(Swap.a + " " + Swap.b);
    }*/

    public static void swap(Object a, Object b) {
        Swap.a = b;
        Swap.b = a;
    }
}
//HOW IT WORKS:
//To swap two values with this class, first call the static method "swap",
//with 2 parameters - the first is the value that you want to be swapped
//with the value in the second parameter. Then, to use the values,
//use the static variables "a" and "b" [the values will already be swapped
//("a" as "b" and vice versa)].