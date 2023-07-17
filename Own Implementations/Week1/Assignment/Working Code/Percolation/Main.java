
public class Main {

	public static void main(String...strings) {
		Percolation p = new Percolation(3);
		
		System.out.println("Is 1,1 open : "+p.isOpen(1,1));
		System.out.println("Is the site full : "+p.isFull(1, 1));
		p.open(1, 1);
		System.out.println("Is 1,1 open : "+p.isOpen(1,1));
		System.out.println("Is the site full : "+p.isFull(1, 1));
		
//		System.out.println("Does it percolate : "+p.percolates());
	}
}
