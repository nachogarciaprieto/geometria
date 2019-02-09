/**
 * 
 * @author JOS� IGNACIO GARCIA PRIETO
 * @version 1.2
 *
 */
public class Rectangulo_JIGP extends FiguraGeometrica_JIGP {
	private double l1;
	private double l2;
	
	
	/**
	 * Este es el m�todo constructor 
	 * de la clase Rectangulo_JIGP
	 * @param tipoFigura puede ser tri�ngulo, c�rculo o rect�ngulo.
	 * @param lG esta variable es uno de los lados
	 * @param lP esta variable es el otro lado
	 */
	public Rectangulo_JIGP(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	
	/**
	 * Este m�todo devuelve el �rea de un rect�ngulo
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Este m�todo devuelve el per�metro de un rect�ngulo.
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
