package Dominio;

public class Llantas {
	private long codigoBarra;
	private String marca;
	private String medidas;
	private float precio;
	private int existencia;

	public Llantas(long codigoBarra, String marca, String medidas, float precio, int existencia) {
		this.codigoBarra = codigoBarra;
		this.marca = marca;
		this.medidas = medidas;
		this.precio = precio;
		this.existencia = existencia;
	}

	@Override
	public String toString() {
		return "Llantas [codigoBarra=" + codigoBarra + ", marca=" + marca + ", medidas=" + medidas + ", precio="
				+ precio + ", existencia=" + existencia + "]\n";
	}

	public long getCodigoBarra() {
		return codigoBarra;
	}

	public void setCodigoBarra(long codigoBarra) {
		this.codigoBarra = codigoBarra;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMedidas() {
		return medidas;
	}

	public void setMedidas(String medidas) {
		this.medidas = medidas;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getExistencia() {
		return existencia;
	}

	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}

}
