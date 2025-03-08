package lectures.lec11;

// Example of methods without generic data types
public class MethodWithoutGenDT {
    public static void main (String[] args){
        int[] a = {1, 2, 3, 4};
        double[] d = {1.1, 2.2, 3.3, 4.4};
        printOL(a);
        printOL(d);
    }

    static void printOL (int[] x){
        System.out.println("print with int method:");
        for (int i=0; i<x.length; i++){
            System.out.print(x[i]+" ");
        }
        System.out.println();
    }

    static void printOL (double[] x) {
        System.out.println("print with double method:");
        for (double e : x) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
