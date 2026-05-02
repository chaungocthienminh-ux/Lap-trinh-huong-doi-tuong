package buoi2;

public class SDDate {

	public static void main(String[] args) {
		Date d = new Date();
		d.nhapngay();
		d.hienthi();
		Date d1 = d.ngayHomSau();
		d1.hienthi();
		Date d2 = d.congNgay(5);
		d2.hienthi();
	}
}
