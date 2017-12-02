package ZADACA_30_11_2017;

public class zadatak3 {


	public static void main(String[] args) {
		
		
		int [][] sihtarica= {{2,4,3,4,5,8,8},
							 {7,3,4,3,3,4,4},
							 {3,3,4,3,3,2,2},
							 {9,3,4,7,3,4,1},
							 {3,5,4,3,6,3,8},
							 {3,4,4,6,3,4,4},
							 {3,7,4,8,3,8,4}};
		
		
		int [] radnisati= new int[sihtarica.length];
		
		for (int i=0;i<sihtarica.length;i++){
			for (int j=0;j<sihtarica.length;j++){
				radnisati[i]=radnisati[i]+sihtarica[i][j];
				
			}
		}
		
		
		int maxsati=0;
		int radnikindex=0;
		
		for (int i=0;i<radnisati.length;i++){
	
			for (int j=0;j<radnisati.length;j++){
				if (radnisati[j]>maxsati){
				maxsati=radnisati[j];
				radnikindex=j;
					}
				}
			}	
		
		
		System.out.println(" Radnik sa indexom "+radnikindex+" ima: "+maxsati+" radnih sati");


	}
}



