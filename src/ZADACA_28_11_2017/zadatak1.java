package ZADACA_28_11_2017;

import java.util.Arrays;
import java.util.Scanner;

public class zadata1 {

	public static void main(String[] args) {
		
		
		Scanner unos=new Scanner(System.in);
		
		// niz sa 100000 random brojeva
		int []niz=new int[100000];
		
		for (int i=0;i<niz.length;i++){
			niz[i]=(int) (Math.random()*11+1);}
		
		// odabir broja za traženje
		System.out.println("Koji broj æeš da ti naaaaðem?");
		int broj=unos.nextInt();
		
		//linearno trazenje
		long pocetnovrijeme=System.currentTimeMillis();
		
		brojlinearno(niz, broj);
		
		long krajnjevrijeme=System.currentTimeMillis();
		
		long proslovrijeme=krajnjevrijeme-pocetnovrijeme;
		
		System.out.println("Broj "+broj+" nalazi se na "+brojlinearno(niz, broj)+" mjestu, trebalo mi je "+proslovrijeme+" nanosekundi.");
		
		System.out.println("-------------------------------------");
		
		// binarno trazenje
	
		long pocetno=System.currentTimeMillis();
		
		brojbinarno(niz,broj);
		
		long krajnje=System.currentTimeMillis();
		
		long proslo=krajnje-pocetno;
		System.out.println(broj+" je na "+brojbinarno(niz, broj)+" mjestu i trebalo je "+proslo+" milisekundi.");
		
		
		unos.close();
	}
	
	public static int brojlinearno(int[]niz, int kljuc){
		
		for (int i=0;i<niz.length;i++){
			if (kljuc==niz[i]){
				return i;
			}
		}
		
		return -1;
	}

	public static int brojbinarno(int[]niz, int kljuc){
		
		Arrays.sort(niz);
		
		int najnizi=0;
		int najvisi=niz.length-1;
		
		while (najvisi>=najnizi){
			
			int srednji=(najvisi+najnizi)/2;
			
			if (kljuc<niz[srednji]){
				najvisi=srednji-1;
			}
			else if (kljuc==niz[srednji]){
				return srednji;
			}
			else {
				najnizi=srednji+1;
			}
		}
		
		return -najnizi -1;

		}
	}

