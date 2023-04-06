import java.io.*;
import java.util.*;

 class SelectionSortGenerics {

    private <E> void swap(E[] a, int i, int j) {
        if (i != j) {
            E temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    public <E extends Comparable<E>> void printArray(E[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            // find index of smallest element
            int smallest = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].compareTo(a[smallest])<=0) {
                    smallest = j;
                }
            }

            swap(a, i, smallest);  // swap smallest to front
        }
        
		 for (int i = 0; i < a.length ; i++) {
        System.out.println(a[i]);
    }
}
 }


public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	
		System.out.println("Enter n");
		int n=Integer.parseInt(br.readLine());

		Integer[]  intList=new Integer[n];
		Double[] doubleList=new Double[n];

		System.out.println("Enter integers one by one");
		for(int i=0;i<n;i++){
              intList[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter double values one by one");
		for(int i=0;i<n;i++){
              doubleList[i]=Double.parseDouble(br.readLine());
		}

		SelectionSortGenerics firstsort = new SelectionSortGenerics();

        System.out.println("Printing Integer Array");
		firstsort.printArray(intList);
		System.out.println("Printing Double Array");
		firstsort.printArray(doubleList);
		
	}
}

