public class String_Basic{
	public static void main(String[] args) {
			//Basisdatentypen -> String
			int age = 30;
			char gender = 'm';
			double score = 88.3;
			boolean pass = true;
			String str1 = age +"";
			String str2 = gender +"";
			String str3 = score +"";
			String str4 = pass +"";
			System.out.println(str1+"\t"+str2+"\t"+str3+"\t"+str4);
			//String -> Basisdatentypen
			String str ="123";
			int num1 = Integer.parseInt(str);// Zahlen aus String in einen Integer zu speichern
			double num2 = Double.parseDouble(str);// Zahlen aus String in einen Double zu speichern
			float num3 = Float.parseFloat(str);// Zahlen aus String in einen Float zu speichern
			long num4 = Long.parseLong(str);// Zahlen aus String in einen Long zu speichern
			byte num5 = Byte.parseByte(str);// Zahlen aus String in einen Byte zu speichern
			short num6 = Short.parseShort(str);// Zahlen aus String in einen Short zu speichern
			char c = str.charAt(0);//erstes Zeichen von der Zeichenkette in einen Char zu speichern
			boolean b = Boolean.parseBoolean("true");
			System.out.println(num1+"\t"+num2+"\t"+num3+"\t"+num4+"\t"+num5+"\t"+num6+"\t");
			System.out.println(c);
			System.out.println(b);

			System.out.println(100+98);//198
			System.out.println("100"+98);//10098
			System.out.println(100+3+"hello");//103hello
			System.out.println("hello"+100+3);//hello1003
			
		}	
}