package ZADACA_29_11_2017;

public class zadatak4 {

	public static void main(String[] args) {
		
		int [][] matrica = new int[4][4];
		
		for (int i=0;i<4;i++){
			for (int j=0;j<4;j++){
				matrica[i][j]=(int)(Math.random()*2);
			}
		}
		
		
		for (int i=0;i<4;i++){
			for (int j=0;j<4;j++){
				System.out.print(matrica[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("U redu "+brojredove(matrica)+" ima najviše jedinica...");
		System.out.println("U koloni "+brojkolone(matrica)+" ima najviše jedinica...");
		
		

	}
	
	public static int brojredove(int[][]matrica){
		
	
		int jedinicetrenutno=0;
		int rednajvise=0;
		int maxred=0;
		
		for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){

                if (matrica[i][j]==1)
                    jedinicetrenutno++;
                
            }
            if (jedinicetrenutno > rednajvise){
                rednajvise=jedinicetrenutno;
                maxred=i;
				
			}
            
           jedinicetrenutno=0;
           
		}
		return maxred;
		
	}
	
	public static int brojkolone(int[][]matrica){
		
		int jedinicetrenutno=0;
		int kolonanajvise=0;
		int maxkolona=0;
		
		for (int j=0;j<4;j++){
			for (int i=0;i<4;i++){
				
				if (matrica[i][j]==1)
					jedinicetrenutno++;
			}
			
			if (jedinicetrenutno>kolonanajvise){
				kolonanajvise=jedinicetrenutno;
				maxkolona=j;
			}			
		jedinicetrenutno=0;		
	}
		return maxkolona;
}
}

