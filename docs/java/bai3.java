package buoi1;

import java.util.Scanner;

public class bai3 {

	public static void nhapkytu() {
		Scanner sc = new Scanner(System.in);
		char kytu;
		while(true) {
		System.out.println("Nhap 1 ky tu: ");
		kytu = sc.nextLine().charAt(0);
		if(kytu=='q') break;
		System.out.println("Ky tu vua nhap la: "+kytu);
		}
	}
	public static void main(String[] args) {
		nhapkytu();
	}

}
