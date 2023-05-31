package org.example;
import lombok.*;
import java.util.Arrays;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Fecha {

    private int anio;
    private int mes;
    private int dia;

    private List<Integer> diasPorMes = Arrays.asList(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);

    public Fecha(int anio, int mes, int dia) {
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }

    private int obtenerDiasEnMes(int mes_parametro, int anio_parametro) {
        int diasEnMes = diasPorMes.get(mes_parametro - 1);
        if (mes_parametro == 2 && esBisiesto(anio_parametro)) {
            diasEnMes++;
        }
        return diasEnMes;
    }

    private boolean esBisiesto(int anio_parametro) {
        return (anio_parametro % 4 == 0 && anio_parametro % 100 != 0) || (anio_parametro % 400 == 0);
    }

    public String sumarDias(int dias) {
        int dia_sumado = dia + dias;
        int mes_sumado = mes;
        int anio_sumado = anio;

        while (dia_sumado > obtenerDiasEnMes(mes_sumado, anio_sumado)) {
            dia_sumado -= obtenerDiasEnMes(mes_sumado,anio_sumado);
            mes_sumado = mes_sumado + 1;
            if (mes_sumado > 12) {
                mes_sumado = 1;
                anio_sumado = anio_sumado +1;
            }
        }

        String dia_str = "" + dia_sumado;
        if (dia_sumado < 10) {
            dia_str = "0" + dia_str;
        }
        String mes_str = "" + mes_sumado;
        if (mes_sumado < 10) {
            mes_str = "0" + mes_str;
        }
        return (anio_sumado + "-" + mes_str + "-" + dia_str);
    }

    public String restarDias(int dias) {
        int dia_restado = dia - dias;
        int mes_restado = mes;
        int anio_restado = anio;

        while (dia_restado < 1) {
            mes_restado = mes_restado - 1;
            if (mes_restado < 1) {
                mes_restado = 12;
                anio_restado = anio_restado - 1;
            }
            dia_restado = dia_restado + obtenerDiasEnMes(mes_restado, anio_restado);
        }

        String dia_str = "" + dia_restado;
        if (dia_restado < 10) {
            dia_str = "0" + dia_str;
        }
        String mes_str = "" + mes_restado;
        if (mes_restado < 10) {
            mes_str = "0" + mes_str;
        }
        return (anio_restado + "-" + mes_str + "-" + dia_str);
    }
}
