package buoi2;

import java.util.Scanner;

public class SDPhanSo {

	public static void main(String[] args) {
		PhanSo a = new PhanSo(3, 7);
		PhanSo b = new PhanSo(4, 9);
		a.hienthi();
		b.hienthi();
		
		PhanSo x = new PhanSo();
		x.nhap();
		x.hienthi();
		
		PhanSo y = new PhanSo();
		y.nhap();
		y.hienthi();
		
		x.giatriNghichDao();
		x.hienthi();
		
		PhanSo x1 = x.cong(y);
		x1.hienthi();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = sc.nextInt();
		PhanSo ds[] = new PhanSo[n];
		for(int i=0;i<n;i++) {
			ds[i] = new PhanSo();
			ds[i].nhap();
		}
		System.out.println("Danh sach phan so vua nhap la: ");
		for(int i=0;i<n;i++) {
			ds[i].hienthi();
		}
		System.out.println("Tong danh sach phan so la: ");
		PhanSo sum = ds[0];
		for(int i=0;i<n;i++) {
			sum=sum.cong(ds[i]);
		}
		sum.hienthi();
		System.out.println("Phan so lon nhat la: ");
		float lonnhat = ds[0].giatrithuc();
		PhanSo psln = ds[0];
		for(int i=0;i<n;i++) {
			if(ds[i].giatrithuc()>lonnhat) {
				lonnhat = ds[i].giatrithuc();
				psln = ds[i];
			}
		}
		psln.hienthi();
		System.out.println("Danh sach phan so khi sap xep: ");
		int l = ds.length;
		for(int i=0;i<l;i++) {
			for(int j=i;j<i;j++) {
				if(ds[j].giatrithuc() > ds[i].giatrithuc()){
					PhanSo temp = ds[i];
					ds[i] = ds[j];
					ds[j] = temp;
				}
			}
		}
		for(int i=0; i<l; i++) {
			ds[i].hienthi();
		}
	}
}
