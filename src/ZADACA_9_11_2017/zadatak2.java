package ZADACA_9_11_2017;

public class zadatak2 {

	public static void main(String[] args) {
		
	
	int	palindrom=0;
	int i=0;
	int z=0;
	int e=0;
	
	for (i=100;i<1000;i++){
	    int zadnja=i%10;
		int prva=i/100;
	if (zadnja==prva){
		palindrom=i;		
	}			
	

			
	for(z=2;z<1000;z++){
        
		int k=0;
        for(int j=2;j<z;j++){
        
            if(z%j==0){
            
                k=1;
                break;}
           
        }

        if (palindrom==z && k==0){
    		e=z;
    		}
	
	}       
}
		System.out.println(" Najveći prosti palindrom od 1 do 1000 je : " + z);
	}
}

	

