package clases;

public class Circulo implements FiguraGeometrica{
    private double radio;

    private double x;

    private double y;

    public Circulo(double radio) throws MiExcepcion{
        if (radio < 0) {
            throw new MiExcepcion("El radio no puede ser negativo");
        }
        else {
        this.radio = radio;
        }
    }

    public Circulo() {
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }

    @Override
    public double calcularPerimetro() {
        return 2*Math.PI * radio;
    }

    @Override
    public double calcularSuperficie() {
        return Math.PI * Math.pow(radio,2);
    }

    @Override
    public void setUbicacion(double x, double y) throws MiExcepcion {
        if (x < 0 || y < 0) {
            throw new MiExcepcion("Los parametros de ubicacion no pueden ser negativos");
        }
        else {
            this.x = x;
            this.y = y;
        }
    }

    @Override
    public String getUbicacion() {
        return "(" + x + "," + y + ")";
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) throws MiExcepcion{
        if (radio < 0) {
            throw new MiExcepcion("El radio no puede ser negativo");
        }
        else {
            this.radio = radio;
        }
    }
}