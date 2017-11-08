package ZADAÆA_8_11_2017;

import java.util.Scanner;

public class zadatak5unos {

	public static void main(String[] args) {
		
	Scanner unos=new Scanner(System.in);
	
	System.out.println(" Kol'ko æemo spratova majstore? ");
	int spratovi=unos.nextInt();
	
	
	for ( int i=1; i<=spratovi; i++){
		for ( int j=1; j<=i;j++){
			System.out.print(j+" ");}
		System.out.println();
		}
	
	System.out.println();
	
	for (int i=spratovi; i>=1; i--){
		for ( int j=1; j<=i; j++){
			System.out.print(j+ " ");}
		System.out.println();
		}
	
	System.out.println();
	
	for (int i=1; i<=spratovi; i++){
		for (int j=0; j<=spratovi-1-i; j++){
			System.out.print("  ");}
		
		for (int k=1; k<=i; k++){
			System.out.print(k+" ");}
		System.out.println();
		}
	
	System.out.println();
	
	for (int i=spratovi; i>=1; i--){
		for (int j=spratovi;j>i;j--){
			System.out.print("  ");}
		for (int k=1; k<=i; k++){
			System.out.print(k+" ");}
		System.out.println();
		}
	unos.close();
	}
}
	
