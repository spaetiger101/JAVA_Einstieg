public class Float01{
	public static void main(String[] args) {
		//float num1 = 1.1; // double passt nicht in float
		float num2 = 1.1f;
		double num3 = 3.3;
		double num4 = 1.1f; //float passt in double
		double num5 = .123;
		System.out.println(num5);
		System.out.println(5.12e3); //5.12e3 = 5,12 x 10^3=5120
		System.out.println(5.12E-2); //5.12E-2 = 5,12 x 10^2 = ... 
		//double ist präziser als float, Wenn Sie nicht sicher sind ...
		double num9 = 2.1234567891;
		float num10 = 2.1234567891f;
		System.out.println("double Variante: "+num9);
		System.out.println("float Variante: "+num10);

		//Fälle bei flat/double Daten
		double num11 = 2.7;
		double num12 = 8.1/3; //8.1/3 = 2.7
		System.out.println(num12);

		if (Math.abs(num11-num12)<0.0001){
			System.out.println("gleich!");
		} else{
			System.out.println("ungleich!");
		}
	}
}