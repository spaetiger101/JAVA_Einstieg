public class AutoConvert{
	public static void main(String[] args) {
		int a = 'c'; //char kann in int umgewandelt werden
		double d = 80; //int kann in double umgewandelt werden
		System.out.println(a);//99
		System.out.println(d);//80.0
		int n1 = 10;
		double d1 = n1 + 1.1;//weil 1.1 automatisch als double erkannt wird
		float d2 = n1 + 1.1F;//1.1F als float, das Ergebnis auch float
		//(byte, short) char können nicht ineinander umgewandelt werden.
		//Das ist fest vorgeschrieben
		byte b1 = 10;
		int n2 = 1;
		//byte b2 = n2; //n2 int (4 xByte) passt nicht in eine byte
		//char c1 = b1; // byte darf nicht in char umgewandelt werden
		byte b2 = 1;
		byte b3 = 2;
		short s1 = 1;
		//short s2 = b2 +s1;//bei Kalulation werden byte und short in
		//in int umgewandelt. int darf nicht in short umgeandelt werden.
		int s2 = b2 + s1;
		//byte b4 = b2 +b3; //byte werden in int konvertiert.
		//int darf nicht in byte konvertiert werden.
		byte b4 =1;
		short s3 =100;
		int num200 =1;
		double num300 =1.1;
		double s = b4 + s4 + num200 + num300;//der größte Datentype in der
		// Berechung ist double dann das Ergebnis auch in double.
		sfloat f5 = s3 + num200 + num300;//double darf nicht in float konvertiert werden.
	}
}