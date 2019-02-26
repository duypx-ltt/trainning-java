package training1;

public class Square {
	public float edge;

	public void printEdge() {
		System.out.println("edge = " + edge);
	}

	public void perimeter() {
		System.out.println("perimeter = " + (edge * 4));
	}

	public void area() {
		System.out.println("area = " + (edge * edge));
	}

	public void printAll() {
		this.printEdge();
		this.perimeter();
		this.area();
	}

}
