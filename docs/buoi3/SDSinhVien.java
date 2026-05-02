package thbuoi3;

import java.util.Arrays;
import java.util.Scanner;

public class SDSinhVien {

	public static void main(String[] args) {
		/*SinhVien a = new SinhVien();
		a.nhap();
		a.nhapdiem();
		a.dangkyhp("LTHDT", "A");
		System.out.println(a);*/
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhap so luong sinh vien: ");
		n = sc.nextInt();
		SinhVien[] ds = new SinhVien[n];
		for(int i=0; i<n; i++) {
			ds[i] = new SinhVien();
			ds[i].nhap();
			ds[i].nhapdiem();
		}
		for(int i=0; i<n; i++) {
			System.out.println(ds[i]);
		}
		System.out.println("Sinh vien bi canh bao hoc vu la: ");
		for(int i=0; i<n; i++) {
			if(ds[i].diemtb()<1) {
				System.out.println(ds[i]);
			}
		}
		
		SinhVien lonnhat = ds[0];
		System.out.println("Sinh vien co diem trung binh cao nhat la: ");
		for(int i=0; i<n; i++) {
			if(ds[i].diemtb()>lonnhat.diemtb()) {
				lonnhat = ds[i];		
			}
		}
		System.out.println("Sinh vien co diem trung binh cao nhat la: "+lonnhat);
		
		Arrays.sort(ds);
		System.out.println("Danh sach duoc sap xep la: ");
		for(int i=0; i<n; i++) {
			System.out.println(ds[i]);
		}
	}
	
}
