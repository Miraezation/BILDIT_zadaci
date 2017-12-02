package ZADACA_30_11_2017;

public class zadatak2 {

	public static void main(String[] args) {
		
		int [] niz=new int[101];
		
		//1 otvoreno, 0 zatvoreno
		
			for (int i=1;i<niz.length;i++){
			niz[i]=1;
		}
			
			for (int i=2;i<niz.length;i=i+2){
				niz[i]=0;
			}
		
			for (int j=3; j<niz.length; j++){
				for (int i=j; i<niz.length;i=j+i){
				if(niz[i]==0){
					niz[i]=1;}
				else 
					niz[i]=0;
				}
			}
		
		
			System.out.println("Otvorena su vratanca s indexima:");
			
			for (int i=1; i<niz.length;i++){
			
				if (niz[i]==1)
				
				System.out.println(i+ " ");
				
			}
		}
	}
