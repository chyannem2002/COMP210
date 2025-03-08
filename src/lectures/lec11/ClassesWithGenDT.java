package lectures.lec11;

class  GenericArray <E> {

    void printArray(E[] x) {
        System.out.println("\nPrinting Generic Array:");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
    int searchArray(E[] x, E key) {
        for (int i = 0; i < x.length; i++)
            if (x[i] == key)
                return (i);
        return (-1);
    }

    void copyArray(E[] x, E[] y) {
        for (int i=0 ; i<x.length ; i++) {
            y[i] = x[i];
        }
    }
}

public class ClassesWithGenDT {
    public static void main (String[] args){
        Integer[] a = {10, 20, 30, 40};
        GenericArray<Integer> aI = new GenericArray<Integer>();
        aI.printArray(a);
        int key1 = 30;
        System.out.println(key1 + " found at index: " +
                aI.searchArray(a, key1));

        Integer[] a2 = new Integer[a.length];
        aI.copyArray(a, a2);
        aI.printArray(a2);

        String[] s = {"Hi", "COMP210", "students!"};
        GenericArray<String> aS = new GenericArray<String>();
        aS.printArray(s);
        String key2 = "COMP210";
        System.out.println(key2 + " found at index: " +
                aS.searchArray(s, key2));
    }
}
