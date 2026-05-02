package thbuoi3;

import java.util.Scanner;

public class SDGach {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhap n: ");
		n = sc.nextInt();
		Gach []ds = new Gach[n];
		for(int i=0; i<n; i++) {
			ds[i] = new Gach();
			ds[i].nhap();
		}
		for (int i=0; i<n; i++) {
			ds[i].hienthi();
		}
		
		Gach renhat = ds[0];
		for(int i=0; i<n; i++) {
			if(ds[i].chiphilot()<renhat.chiphilot()) {
				renhat = ds[i];
			}
		}
		renhat.hienthi();
		
		for(int i=0; i<n; i++) {
			System.out.println("Chi phi lot loai "+i+": ");
			System.out.println(ds[i].soLuongHop(1500, 500) * ds[i].getGiaBan());
		}
	}

}
