
public class Amount {
		public static void priceAmount(int mprice,  int discount) {
			int sprice=100-discount;
			int price= (sprice*mprice)/100;
			System.out.println("price after discount:"+price);
		}
	public static void main(String[] args) {
		System.out.println("welcome to shop");
		Amount.priceAmount (300,700);
	}
	}