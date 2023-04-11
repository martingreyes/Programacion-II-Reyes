package clases;

public interface FiguraGeometrica {

    public double calcularPerimetro();

    public double calcularSuperficie();

    public void setUbicacion(double x, double y) throws MiExcepcion;

    public String getUbicacion();
}