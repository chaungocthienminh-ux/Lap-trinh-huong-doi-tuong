package buoi1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class bai4 {
	public static int nhapsonguyen() {
		Scanner sc = new Scanner(System.in);
		int songuyen;
		while(true) {
		try {
			System.out.println("Nhap so nguyen: ");
			songuyen = sc.nextInt();
			break;
		} catch (InputMismatchException e) {
			System.out.println("Nhap sai dinh dang");
			sc.nextLine();
			}
		}
		return songuyen;
	}
	
	public static int tinhtong(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		int a = nhapsonguyen();
		int b = nhapsonguyen();
		System.out.println(tinhtong(a,b));
	}

}
