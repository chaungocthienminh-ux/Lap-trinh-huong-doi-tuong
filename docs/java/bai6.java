package buoi1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class bai6 {

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
		public static boolean ktsonguyento(int songuyen) {
			for(int i=2; i<Math.sqrt(songuyen);i++) {
				if(songuyen % 2 == 0)
					return false;
			}
			return true;
	}
		public static void hienthinhiphan(int songuyen) {
			//System.out.println(Integer.toBinaryString(songuyen));
			int thuong = songuyen, sodu;
			String nhiphan = "";
			do {
				sodu = thuong%2;
				nhiphan += sodu;
				thuong /= 2;
			} while (thuong != 0);
			for(int i=nhiphan.length()-1;i>=0;i--)
				System.out.print(nhiphan.charAt(i));
		}
		public static int tinhtong(int songuyen) {
			float tong = 0;
			while (songuyen != 0) {
				tong += songuyen%10;
				songuyen /= 10;
			}
			return (int) tong;
		}
		public static void uocnguyento(int songuyen) {
			for(int i=1; i<=songuyen; i++) {
				if(songuyen%i==0) {
					if(ktsonguyento(songuyen/i)) {
						System.out.println("Uoc nguyen to la: " + songuyen/i);
					}
				}
			}
		}
	
	public static void main(String[] args) {
		int a = nhapsonguyen();
		System.out.println("Kiem tra so nguyen to: " + ktsonguyento(a));
		hienthinhiphan(a);
		System.out.println("Tong cac chu so cua so nguyen la: " + tinhtong(a));
		uocnguyento(a);
	}
}
