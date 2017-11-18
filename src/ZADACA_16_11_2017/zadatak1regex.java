package ZADACA_16_11_2017;

public class zadatak1regex {

	public static void main(String[] args) {

			System.out.print(format(34, 5));
	
	}

	
	public static String format(int number, int width){
		
		return String.format("%0" + width + "d", number);
	}
}
