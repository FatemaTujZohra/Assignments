package homeworkLutforOnControlStatements;

public class DataTypeProgram2 {

	public static void main(String[] args) {
		
		String DataType = "Primitiv";
		if (DataType=="Primitive") {
			System.out.println("Primitive data types are two kinds: Numeric and Non-numeric");
			
			String Primitive= "Numeric";
			switch (Primitive) {
			case "Numeric":
				System.out.print("2 kinds of numeric data type:integral (byte, short, int, long, char) and floating-point(float, double)");
				break;
				
			case "Non-numeric":
			System.out.println("Non-numeric data types: boolean");
			break;
				
			}
	          }
		else 
		{ System.out.println("Non-primitive data types are the custom type or user-defined data type,such as String, Array etc");

}
}
}
