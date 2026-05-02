package thbuoi3;

import java.util.Scanner;

import buoi2.Date;

public class SinhVien implements Comparable{
	private String mssv, hoten;
	private Date ngaysinh;
	private int soluonghp;
	private String[] tenhp, diemhp;
	public SinhVien() {
		mssv = "b123";
		hoten = "NVA";
		ngaysinh = new Date(1,1,2005);
		soluonghp = 100;
		tenhp = new String[100];
		diemhp = new String[100];
	}
	public SinhVien(String ms, String ht, Date ns, int slhp, String[] thp, String[] dhp) {
		mssv = ms;
		hoten = ht;
		ngaysinh = new Date(ns);
		soluonghp = slhp;
		tenhp = new String[100];
		diemhp = new String[100];
		for(int i=0; i<slhp; i++) {
			tenhp[i] = thp[i];
			diemhp[i] = dhp[i];
		}
	}
	public SinhVien(SinhVien s) {
		mssv = s.mssv;
		hoten = s.hoten;
		ngaysinh = new Date(s.ngaysinh);
		soluonghp = s.soluonghp;
		tenhp = new String[100];
		diemhp = new String[100];
		for(int i=0; i<soluonghp; i++) {
			tenhp = s.tenhp;
			diemhp = s.diemhp;
		}
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so sinh vien: ");
		mssv = sc.nextLine();
		System.out.println("Nhap ho ten sinh vien: ");
		hoten = sc.nextLine();
		System.out.println("Nhap ngay thang nam sinh: ");
		ngaysinh.nhapngay();
	}
	public void nhapdiem() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong hoc phan: ");
		soluonghp = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<soluonghp; i++) {
			System.out.println("Nhap ten hoc phan thu "+i+": ");
			tenhp[i] = sc.nextLine();
			System.out.println("Nhap diem hoc phan thu "+i+": ");
			diemhp[i] = sc.nextLine();
		}
	}
	public String toString() {
		String str = mssv+" / "+hoten+" / "+ngaysinh+" / "+soluonghp;
		for(int i=0; i<soluonghp; i++) 
			str += tenhp[i]+" - "+diemhp[i];
		return str;
	}
	public float doidiem(String diemchu) {
		switch(diemchu) {
		case "A": return 4;
		case "B+": return 3.5f;
		case "B": return 3;
		case "C+": return 2.5f;
		case "C": return 2;
		case "D+": return 1.5f;
		case "D": return 1;
		case "F": return 0;
		default: return 0;
		}
	}
	public float diemtb() {
		float sum = 0;
		for(int i=0; i<soluonghp; i++) {
			sum += doidiem(diemhp[i]);
		}
		return (float)sum/soluonghp;
	}
	public void dangkyhp(String t, String d) {
		if(soluonghp<100) {
			tenhp[soluonghp] = t;
			diemhp[soluonghp] = d;
			soluonghp++;
		} else {
			System.out.println("Khong the them hoc phan!");
		}
	}
	public void xoahp(String t) {
		for(int i=0; i<soluonghp; i++) {
			if(tenhp[i].equals(t)) {
				for(int j=i; j<soluonghp; j++) {
					tenhp[j] = tenhp[j+1];
					diemhp[j] = diemhp[j+1];
				}
				soluonghp--;
			}
		}
	}
	@Override
	public int compareTo(Object o) {
		return Float.compare(diemtb(), ((SinhVien)o).diemtb());
	}
}
