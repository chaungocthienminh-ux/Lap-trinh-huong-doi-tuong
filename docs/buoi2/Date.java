package buoi2;

import java.util.Scanner;

public class Date {
	private int ngay, thang, nam;
	public Date() {
		ngay = 1;
		thang = 1;
		nam = 2000;
	}
	public Date(int ng, int th, int n) {
		ngay = ng;
		thang = th;
		nam = n;
	}
	public void hienthi() {
		System.out.println(ngay+"/"+thang+"/"+nam);
	}
	public boolean hopLe() {
		int[] max = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(nam%4==0 || (nam%100==0&&nam%400==0))
			max[2]=29;
		if(thang<0 || thang>12 || ngay<0 || ngay>max[thang])
			return false;
		return true;
	}
	public void nhapngay() {
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ngay: ");
		ngay = sc.nextInt();
		System.out.println("Nhap thang: ");
		thang = sc.nextInt();
		System.out.println("Nhap nam: ");
		nam = sc.nextInt();
		} while(!hopLe());
	}
	public Date ngayHomSau() {
		Date d = new Date(ngay+1,thang,nam);
		if(!d.hopLe()) {
			d.ngay = 1;
			d.thang++;
			if(!d.hopLe()) {
				d.thang = 1;
				d.nam++;
			}
		}
		return d;
	}
	public Date congNgay(int n) {
		Date d = new Date(ngay,thang,nam);
		for(int i=0;i<n;i++) {
			d = d.ngayHomSau();
		}
		return d;
	}
}
