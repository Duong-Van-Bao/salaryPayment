import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
       /*
        *Bước 1: Tạo biến hours, rate, payment
        *Bước 2: In thông báo nhập hours
        *Bước 3  Cho người dùng nhập và gắn vào hours
        *Bước 4: In thông báo nhập rate
        *Bước 5: Cho người dùng nhập và gán vào rate
        *Bước 6: Xét hours > 40 hay không
        *Bước 7: Nếu 5 thì thanh toán theo công thức 
        *payment = 40*rate + 1.5* rate* (hours - 40);
        *Bước 8: Ngược lại payment = hours * rate
        *Bước 9: xuất kết quả  
        **/
		final int  STANDAR_HOUR = 40;
		final float RATE_OT = 1.5f; 
		float hours;
		float rate;
		float payment;

		Scanner scan = new Scanner(System.in);

		System.out.print(" Nhập giờ làm: ");
		hours = Float.parseFloat(scan.nextLine());

		System.out.print(" Nhập tiền theo giờ làm: ");
		rate = Float.parseFloat(scan.nextLine());

		if (hours > STANDAR_HOUR) {
			payment = STANDAR_HOUR * rate + RATE_OT * rate * (hours - STANDAR_HOUR);
		} else {
			payment = hours * rate;
		}
		
		System.out.println("Tiền phải trả: " + payment);
	}

}
