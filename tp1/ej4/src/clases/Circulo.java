package clases;

public class Circulo implements FiguraGeometrica{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
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

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
