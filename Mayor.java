import java.util.Scanner;

public class Mayor{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];

		int mayor = 0;

		for(int i=0; i<5; i++){
			System.out.print("Ingresa el valor del arr[" + (i+1) + "]: ");
			arr[i] = sc.nextInt();
			if( i==0 ){
				mayor = arr[i];
			} else {
				if(mayor<arr[i]){
					mayor = arr[i];
				}
			}
		}

		System.out.println("El mayor es el " + mayor);
	}
}