package buoi1;

import java.util.Scanner;

public class bai7 {

	public static void tachten() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho ten cua ban: ");
		String hoten = sc.nextLine();
		// tim khoang trang cuoi cung
		int in = hoten.lastIndexOf(" ");
		// neu tim thay khoang trang, in phan sau cua khoang trang
		if (in != -1) {
			String ten = hoten.substring(in + 1);
			System.out.println("Ten cua ban la: " + ten);
		}
	}
	public static void main(String[] args) {
		tachten();
	}
	
}
