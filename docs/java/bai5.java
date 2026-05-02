package buoi1;

import java.util.Scanner;

public class bai5 {
	public static void giaiPTbac2(float a, float b, float c) {
		if (a==0) {
			if (b==0) {
				System.out.println("Phuong trinh vo nghiem");
			} else {
				System.out.println("Phuong trinh co nghiem duy nhat x = " + (-c/b) );
			}
		}
		float x1, x2, d;
		d = b*b - 4*a*c;
		if(d>0) {
			x1 = (float) ((-b - Math.sqrt(d)) / (2*a));
			x2 = (float) ((-b + Math.sqrt(d)) / (2*a));
			System.out.println("Phuong trinh co 2 nghiem phan biet la x1 = " + x1 + " va x2 = " + x2);
		}
		else if(d==0) {
			x1 = (-b/2*a);
			System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + x1);
		}
		else {
			System.out.println("Phuong trinh vo nghiem");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap he so thu nhat: ");
		float a = sc.nextFloat();
		System.out.println("Nhap he so thu hai: ");
		float b = sc.nextFloat();
		System.out.println("Nhap he so thu ba: ");
		float c = sc.nextFloat();
		giaiPTbac2(a, b, c);
	}

}
