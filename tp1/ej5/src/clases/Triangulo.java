package clases;

public class Triangulo implements FiguraGeometrica {
    private double lado1;
    private double lado2;
    private double lado3;
    private double altura;
    private double x;
    private double y;


    public Triangulo(double lado1, double lado2, double lado3, double altura) throws MiExcepcion{
        if (lado1 < 0 || lado2 < 0 || lado3 < 0 || altura < 0) {
            throw new MiExcepcion("Los parametros no pueden ser negativos");
        } else {
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
            this.altura = altura;
        }
    }

    public Triangulo() {
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 +
                ", altura=" + altura +
                '}';
    }

    @Override
    public double calcularPerimetro() {
        return lado1+lado2+lado3;
    }

    @Override
    public double calcularSuperficie() {
        return (lado1*altura)/2;
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

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) throws MiExcepcion{
        if (lado1 < 0) {
            throw new MiExcepcion("El lado 1 no puede ser negativo");
        } else {
            this.lado1 = lado1;
        }
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) throws MiExcepcion{
        if (lado2 < 0) {
            throw new MiExcepcion("El lado 2 no puede ser negativo");
        } else {
            this.lado2 = lado2;
        }
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) throws MiExcepcion{
        if (lado3 < 0) {
            throw new MiExcepcion("El lado 3 no puede ser negativo");
        } else {
            this.lado3 = lado3;
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
};
