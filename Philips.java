package Exercise4;

public class Philips extends Multicooker{
	
	private int quantity;
	
	Philips(String b, String m, String c, double p, int q){
		super(b,m,c,p);
		quantity = q;
	}
	
	public double getquantity() {
		return quantity;
	}
	
	public double gettotalPrice() {
		return super.getprice()*quantity;
	}
	
	public double getPDiscount() {
		return super.getprice()*quantity - ((super.getprice()*quantity)*0.03);
	}
	
	public String toString() {
		return super.toString() + "\nQuantity\t\t\t: " + quantity;
	}

}
