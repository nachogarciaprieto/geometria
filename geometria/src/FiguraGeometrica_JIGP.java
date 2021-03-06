/**
 * 
 * @author nacho
 * versi�n inicial
 *
 */
public abstract class FiguraGeometrica_JIGP {

	protected String tipoFigura;

	public FiguraGeometrica_JIGP(String tipoFigura) {
		super();
		this.tipoFigura = tipoFigura;
	}

	public abstract double area();
	
	public abstract double perimetro();

	public String getTipoFigura() {
		return tipoFigura;
	}

	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}

}
