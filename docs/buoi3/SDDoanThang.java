package thbuoi3;

import buoi2.Diem;

public class SDDoanThang {

	public static void main(String[] args) {
		Diem A = new Diem(2,5);
		Diem B = new Diem(20,35);
		DoanThang AB = new DoanThang(A,B);
		AB.hienthi();
		AB.tinhtien(5, 3);
		AB.hienthi();
		System.out.println(AB.dodai());
		DoanThang CD = new DoanThang();
		CD.nhap();
		CD.hienthi();
		System.out.println(CD.dodai());
	}
}
