import java.util.Scanner;

public class Tienda{
	public static void main(String[] args) {
		int counter=0;
		double ventas[] = new double[30];
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese las 30 ventas del mes:");

		for(int i=0; i<30; i++){
			System.out.print("Venta #" + (i+1) + ": ");
			ventas[i] = sc.nextDouble();
		}

		for(int i=0; i<30; i++){
			if(ventas[i]>=2000){
				System.out.println(ventas[i]);
				counter++;
			}
		}
		System.out.println(counter);
	}
}