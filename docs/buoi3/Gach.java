package thbuoi3;

import java.util.Scanner;

public class Gach {
	private String maso, mau;
	private int soluong, chieudai, chieungang;
	private long giaban;
	public Gach() {
		maso="abc";
		mau="trang";
		soluong=10;
		chieudai=20;
		chieungang=20;
		giaban=100000;
	}
	public Gach(String ms, String m, int sl, int cd, int cn, int gb) {
		maso = ms;
		mau = m;
		soluong = sl;
		chieudai = cd;
		chieungang = cn;
		giaban = gb;
	}
	public Gach(Gach g) {
		maso = g.maso;
		mau = g.mau;
		soluong = g.soluong;
		chieudai = g.chieudai;
		chieungang = g.chieungang;
		giaban = g.giaban;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so: ");
		maso = sc.nextLine();
		System.out.println("Nhap mau: ");
		mau = sc.nextLine();
		System.out.println("Nhap so luong: ");
		soluong = sc.nextInt();
		System.out.println("Nhap chieu dai: ");
		chieudai = sc.nextInt();
		System.out.println("Nhap chieu ngang: ");
		chieungang = sc.nextInt();
		System.out.println("Nhap gia ban: ");
		giaban = sc.nextInt();
	}
	public void hienthi() {
		System.out.println("Ma so: "+maso);
		System.out.println("Mau: "+mau);
		System.out.println("So luong: "+soluong);
		System.out.println("Chieu dai: "+chieudai);
		System.out.println("Chieu ngang: "+chieungang);
		System.out.println("Gia ban: "+giaban);
	}
	public float giaBanLe() {
		return (float)giaban/soluong * 1.2f; 
	}
	public float dientichnentoida() {
		return chieudai*chieungang*soluong;
	}
	public int soLuongHop(int D, int N) {
		double sovienD = Math.ceil((float)D/chieudai);
		double sovienN = Math.ceil((float)N/chieungang);
		return (int) Math.ceil(sovienD*sovienN/soluong);
	}
	public float chiphilot() {
		return (float)giaban/dientichnentoida();
	}
	public int getGiaBan() {
		return (int) giaban;
	}
}