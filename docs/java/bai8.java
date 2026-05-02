package buoi1;

import java.util.Scanner;

public class bai8 {
	public static void nhapsonguyen(int a[], int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap danh sach so nguyen: ");
		for (int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
	}
	
	public static void main(String[] args) {
		int n;
		System.out.println("Nhap so luong phan tu");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int a[] = new int[n];
		nhapsonguyen(a,n);
		//nhap phan tu x va dem xem so phan tu x
		int x;
		System.out.println("Nhap phan tu x: ");
		x = sc.nextInt();
		int k=0;
		for(int i=0; i<n; i++) {
			if(a[i]==x) {
				k++;
			}
		}
		System.out.println("So phan tu x trong danh sach la: " + k);
		//sap xep danh sach theo thu tu tang dan
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<i;j++) {
				if(a[i]>a[j]) {
					int t=a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		System.out.println("Danh sach da sap xep: ");
		for(int i=0;i<n;i++) {
			System.out.print(" " + a[i]);
		}
	}

}
