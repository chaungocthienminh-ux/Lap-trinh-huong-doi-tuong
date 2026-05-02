package buoi2;

import java.util.Scanner;

public class PhanSo {
	private int tu, mau;
	public PhanSo() {
		tu = 1;
		mau = 1;
	}
	public PhanSo(int t, int m) {
		tu = t;
		mau = m;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tu so: ");
		tu = sc.nextInt();
		do {
		System.out.println("Nhap mau so: ");
		mau = sc.nextInt();
		} while(mau==0);
	}
	public void hienthi() {
		if(tu==0) {
			System.out.println(0);
		} else if (mau==1) {
			System.out.println(tu);
		} else {
			System.out.println(tu+"/"+mau);
		}
	}
	public void nghichDao() {
		if(tu==0) {
			System.out.println("Nghich dao khong duoc");
		} else {
			int temp;
			temp = tu;
			tu = mau;
			mau = temp;
		}
	}
	public PhanSo giatriNghichDao() {
		if(tu==0) {
			return new PhanSo(tu, mau);
		} else {
			return new PhanSo(mau, tu);
		}
	}
	public float giatrithuc() {
		return (float) tu/mau;	
	}
	public boolean lonHon(PhanSo a) {
		return giatrithuc()>a.giatrithuc();
	}

	PhanSo cong(PhanSo a) {
		int tumoi, maumoi;
		tumoi = tu*a.mau + mau*a.tu;
		maumoi = mau*a.mau;
		return new PhanSo(tumoi,maumoi);
	}
	PhanSo tru(PhanSo a) {
		int tumoi, maumoi;
		tumoi = tu*a.mau - mau*a.tu;
		maumoi = mau*a.mau;
		return new PhanSo(tumoi,maumoi);
	}
	PhanSo nhan(PhanSo a) {
		int tumoi, maumoi;
		tumoi = tu * a.tu;
		maumoi = mau * a.mau;
		return new PhanSo(tumoi, maumoi);
	}
	PhanSo chia(PhanSo a) {
		int tumoi, maumoi;
		tumoi = tu * a.mau;
		maumoi = mau * a.tu;
		return new PhanSo(tumoi, maumoi);
	}
	public PhanSo cong(int songuyen) {
		return new PhanSo(tu + songuyen * mau, mau);
	}
	public PhanSo tru(int songuyen) {
		return new PhanSo(tu - songuyen * mau, mau);
	} 
	public PhanSo nhan(int songuyen) {
		return new PhanSo(tu * songuyen, mau);
	}
	public PhanSo chia(int songuyen) {
		return new PhanSo(tu, mau * songuyen);
	}	
}
