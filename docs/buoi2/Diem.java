package buoi2;

import java.util.Scanner;

public class Diem {
	private int x, y;
	public Diem() {
		x=1;
		y=1;
	}
	public Diem(int a, int b) {
		x=a;
		y=b;
	}
	public void nhapDiem() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap x: ");
		x = sc.nextInt();
		System.out.println("Nhap y: ");
		y = sc.nextInt();	
	}
	public void hienThi() {
		System.out.println("("+x+","+y+")");
	}
	public void doiDiem(int dx, int dy) {
		x += dx;
		y += dy;
	}
	public int giaTriX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int giaTriY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public float khoangCach() {
		return (float) Math.sqrt(x*x+y*y);
	}
	public float khoangCach(Diem d) {
		float dX = this.x - d.giaTriX();
		float dY = this.y - d.giaTriY();
		return (float) Math.sqrt(dX+dX+dY*dY);
	}
}
