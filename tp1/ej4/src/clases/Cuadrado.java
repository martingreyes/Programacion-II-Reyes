package clases;

public class Cuadrado implements FiguraGeometrica{
    private double base;
    private double altura;

    public Cuadrado(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Cuadrado() {
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

    @Override
    public double calcularPerimetro() {
        return 2*(base*altura);
    }
    @Override
    public double calcularSuperficie() {
        return base*altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
