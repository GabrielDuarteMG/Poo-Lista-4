
public class Retangulo {
	public int comprimento;
	public int largura;
	public int area;
	public int perimetro;
	public Retangulo(int Comprimento,int Largura) {
		// TODO Auto-generated constructor stub
		this.comprimento = Comprimento;
		this.largura = Largura;
		calcularArea();
		calcularPerimetro();
		
	}
	public void calcularArea() {
		area = comprimento * largura;
	}
	public void calcularPerimetro() {
		perimetro = (comprimento*2) + ( largura * 2);
	}
	public void println() {
		System.out.println("Comprimento: " + this.comprimento  +"m\nLargura: "+this.largura+ "m\nArea: "+ this.area + "m\nPerimetro: " + this.perimetro);
	}
}
