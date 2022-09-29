package Arraysandlists;

public class Main1
{
	public static void main(String[] args) {
		statistics ob = new statistics(); 
        int arr[] = {12, 3, 5, 7, 4, 19, 26}; 
        int n = arr.length,k = 4; 
        System.out.println("K'th smallest element is "+ ob.statistics(arr, 0, n-1, k)); 
    }
}