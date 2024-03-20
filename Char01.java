public class Char01{
	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = '\t';// \t wird als ein Zeichen betrachtet
		char c3 = 65; //das ist auch OK! solange die Zahl zwischen 0-65535 ist 
		System.out.println("c1= "+c1);
		System.out.print("c2= "+c2);
		System.out.println("*");
		System.out.println("c3= "+c3);
	}
}