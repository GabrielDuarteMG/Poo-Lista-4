
public class Quadrado {
	
	public int lado;
	public int area;
	public int perimetro;
	public Quadrado(){
		
	}
	public Quadrado(int lado) {
		// TODO Auto-generated constructor stub
		this.lado = lado;
		calcularArea();
		calcularPerimetro();
	}
	public void calcularArea() {
		area = lado * lado;
	}
	public void calcularPerimetro() {
		perimetro = lado *4;
	}
	public void println() {
		System.out.println("Lado: " + this.lado + "m\nArea: "+ this.area + "m\nPerimetro: " + this.perimetro);
	}
}
