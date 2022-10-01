package HouseArchitecture;

public class CheckPolymorphism {
	public static void main(String args[]) {
		HouseArchitecture ha;
		
		ha = new Villas();
		System.out.println("Average price of the villas are: "+String.format("%.0f",ha.getPrice()));
		System.out.println("Bank who provides loan are: "+ ha.getLoanBank());
		
		ha = new FarmHouse();
		System.out.println("Average price of the farmhouse are: "+String.format("%.0f",ha.getPrice()));
		System.out.println("Bank who provides loan are: "+ ha.getLoanBank());
		
		ha = new Apartments();
		System.out.println("Average price of the villas are: "+String.format("%.0f",ha.getPrice()));
		System.out.println("Bank who provides loan are: "+ ha.getLoanBank());
	}
}
