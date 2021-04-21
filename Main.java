package Exercise4;

public class Main {

	public static void main(String[] args) {
		
		Multicooker objMulticooker = new Multicooker();
		System.out.println(objMulticooker);
		System.out.println();
		
		Philips objPhilips = new Philips("Philips", "HD2145/62", "Black", 1099, 2);
		System.out.println(objPhilips);
		System.out.println("Total price\t\t\t: RM" + objPhilips.gettotalPrice());
		System.out.println("Total price after 3 % discount\t: RM" + objPhilips.getPDiscount());
	}

}
