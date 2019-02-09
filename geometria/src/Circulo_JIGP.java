
public class Circulo_JIGP extends FiguraGeometrica_JIGP {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public Circulo_JIGP(double r, String tipoFigura) {
		super(tipoFigura);
		radio = r;
		if(r<0){ //Todo numero que menor que cero es negativo
			r=r*(-1); 
			} 
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
