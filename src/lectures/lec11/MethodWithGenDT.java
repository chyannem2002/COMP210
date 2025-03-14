package lectures.lec11;

// Example of methods with generic data types
public class MethodWithGenDT {
    public static void main (String[] args){
        Integer[] a = {1, 2, 3, 4};     // Integer is a wrapper class of int, converts int to an object.
        Double[] d = {1.1, 2.2, 3.3, 4.4}; // Double is a wrapper class of double, converts it to an object// .
        Short[] sh = {10, 20, 30};
        printGen(a);
        printGen(d);
        printGen(sh);
    }

    public static <T> void printGen (T[] x){
        System.out.println("printGen method:");
        for (int i=0; i<x.length; i++){
            System.out.print(x[i]+" ");
        }
        System.out.println(", Class name = " + x.getClass().getName());
    }
}
