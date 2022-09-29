package Arraysandlists;

public class Main
{
	public static void main(String[] args) {
		Rotation r = new Rotation();
        		int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
        		r.rotate(arr, 3); 
        		for(int i=0;i<arr.length;i++){
            			System.out.print(arr[i]+" ");
        		}
	}
}
