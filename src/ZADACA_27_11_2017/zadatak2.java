package ZADACA_27_11_2017;


public class zadatak2 {

	public static void main(String[] args) {

		int[]prvi={1,2,3};
		int[]drugi={4,5,6};
		
		int[]obaniza=sabrani(prvi,drugi);
		
			for (int i=0;i<obaniza.length;i++){
				System.out.print(obaniza[i]+" ");
			}
			
			
		}
		
		
		
	

	
	public static int[] sabrani(int[]niz1, int[]niz2){
		
		int[]noviniz=new int[niz1.length+niz2.length];
		
		for (int i=0;i<noviniz.length;i=i+2){
			noviniz[i]=niz1[i/2];
			noviniz[i+1]=niz2[i/2];
		}
		
		
		return noviniz;
		}
	}

