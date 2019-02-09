/**
 * 
 * @author JOSÉ IGNACIO GARCIA PRIETO
 * @version 1.2
 *
 */
public class Rectangulo_JIGP extends FiguraGeometrica_JIGP {
	private double l1;
	private double l2;
	
	
	/**
	 * Este es el método constructor 
	 * de la clase Rectangulo_JIGP
	 * @param tipoFigura puede ser triángulo, círculo o rectángulo.
	 * @param lG esta variable es uno de los lados
	 * @param lP esta variable es el otro lado
	 */
	public Rectangulo_JIGP(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	
	/**
	 * Este método devuelve el área de un rectángulo
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Este método devuelve el perímetro de un rectángulo.
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
