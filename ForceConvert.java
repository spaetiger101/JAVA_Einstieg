public class ForceConvert{
	public static void main(String[] args) {
		int n1 = (int)1.9;
		System.out.println("n1= "+n1);
		int n2 = 200;
		byte b1 = (byte)n2;
		System.out.println("b1= "+ b1); //?-56
		//int x = (int)10*3.5 + 6*1.5;
		//? double darf nicht in int umgewandelt werden
		int y = (int)(10*3.5 + 6*1.5);
		System.out.println(y);//?44
		char c1 = 100;
		int m = 100;
	 	//char c2 =m;//? geht nicht
		char c3 =(char)m;//? geht
		System.out.println(c3);

		long l1 = 100;
		float f1 = l1;//? long passt in float
		System.out.println(f1);

		
	}
}