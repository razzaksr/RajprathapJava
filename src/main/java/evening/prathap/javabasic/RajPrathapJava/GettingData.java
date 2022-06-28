package evening.prathap.javabasic.RajPrathapJava;

import java.util.Scanner;

public class GettingData {
	public static void main(String[] args) {
		int headSetModel=0, price=0;String headSetBrand="";
		double headSetBlueVersion=0;String type="";
		
		Scanner gopi=new Scanner(System.in);
		
		System.out.println("Tell us your desired brand ");
		headSetBrand=gopi.nextLine();
		System.out.println("Tell us the headet desired wearing type ");
		type=gopi.nextLine();
		System.out.println("Tell us your desired model ");
		headSetModel=gopi.nextInt();
		
		System.out.println("Tell us your desired bluetooth version ");
		headSetBlueVersion=gopi.nextDouble();
		
		System.out.println("Tell us desired price ");
		price=gopi.nextInt();
		
		System.out.println("Thanks showing intreset on "+headSetBrand+" for "+headSetModel
				+" the type of "+type+" in bluetooth version "+headSetBlueVersion
				+" will be notified once it is available");
		
		gopi.close();
	}
}
