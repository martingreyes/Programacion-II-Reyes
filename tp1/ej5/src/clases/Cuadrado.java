package clases;

public class Cuadrado implements FiguraGeometrica{
    private double base;
    private double altura;
    private double x;
    private double y;

    public Cuadrado(double base, double altura) throws MiExcepcion{
        if (base < 0 || altura < 0) {
            throw new MiExcepcion("Los parametros no pueden ser negativos");
        } else {
            this.base = base;
            this.altura = altura;
        }
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

    public double getBase() {
        return base;
    }

    public void setBase(double base) throws MiExcepcion{
        if (base < 0) {
            throw new MiExcepcion("La base no puede ser negativa");
        } else {
            this.base = base;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) throws MiExcepcion{
        if (altura < 0) {
            throw new MiExcepcion("La altura no puede ser negativa");
        } else {
            this.altura = altura;
        }
    }
}
