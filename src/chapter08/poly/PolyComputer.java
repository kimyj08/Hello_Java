package chapter08.poly;

public class PolyComputer {

	public static void main(String[] args) {
		
		Game g = new Game();
		Amd gc = new Amd();
		g.display(gc);
		
		Nvidia gc2 = new Nvidia();
		g.display(gc2);

	}

}
