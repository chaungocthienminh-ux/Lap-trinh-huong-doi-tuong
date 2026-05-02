package thbuoi3;

import buoi2.Diem;

public class DoanThang {
	private Diem d1, d2;
	public DoanThang() {
		d1 = new Diem();
		d2 = new Diem();
	}
	public DoanThang(Diem a, Diem b) {
		d1 = new Diem(a);
		d2 = new Diem(b);
	}
	public DoanThang(int ax, int ay, int bx, int by) {
		d1 = new Diem(ax, ay);
		d1 = new Diem(bx, by);
	}
	public void nhap() {
		System.out.println("Nhap toa do cho d1 va d2: ");
		d1.nhapDiem();
		d2.nhapDiem();
	}
	public void hienthi() {
		d1.hienThi();
		d2.hienThi();
	}
	public void tinhtien(int dx, int dy) {
		d1.doiDiem(dx, dy);
		d2.doiDiem(dx, dy);
	}
	public float dodai() {
		return d1.khoangCach(d2);
	}
}
