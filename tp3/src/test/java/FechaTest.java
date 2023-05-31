import org.example.Fecha;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FechaTest {

    Fecha fecha;

    @Before
    public void preparacion() {
        this.fecha = new Fecha();
    }
    @Test
    public void testFecha1() {
        this.fecha.setDia(01);
        this.fecha.setMes(01);
        this.fecha.setAnio(2019);
        assertEquals("2019-01-02", this.fecha.sumarDias(1));
        assertEquals("2019-01-16",this.fecha.sumarDias(15));
        assertEquals("2019-02-10",this.fecha.sumarDias(40));
        assertEquals("2019-03-22",this.fecha.sumarDias(80));
        assertEquals("2019-06-30",this.fecha.sumarDias(180));

        assertEquals("2018-12-31", this.fecha.restarDias(1));
        assertEquals("2018-12-17",this.fecha.restarDias(15));
        assertEquals("2018-11-22",this.fecha.restarDias(40));
        assertEquals("2018-10-13",this.fecha.restarDias(80));
        assertEquals("2018-07-05",this.fecha.restarDias(180));


    }

    @Test
    public void testFecha2() {
        this.fecha.setDia(27);
        this.fecha.setMes(02);
        this.fecha.setAnio(2019);
        assertEquals("2019-02-28", this.fecha.sumarDias(1));

        assertEquals("2019-02-26", this.fecha.restarDias(1));
    }

    @Test
    public void testFecha3() {
        this.fecha.setDia(28);
        this.fecha.setMes(02);
        this.fecha.setAnio(2019);
        assertEquals("2019-03-01", this.fecha.sumarDias(1));

        assertEquals("2019-02-27", this.fecha.restarDias(1));
    }

    @Test
    public void testFecha4() {
        this.fecha.setDia(01);
        this.fecha.setMes(03);
        this.fecha.setAnio(2019);
        assertEquals("2019-03-02", this.fecha.sumarDias(1));
        assertEquals("2019-03-16", this.fecha.sumarDias(15));
        assertEquals("2019-04-10", this.fecha.sumarDias(40));
        assertEquals("2019-05-20", this.fecha.sumarDias(80));
        assertEquals("2019-08-28", this.fecha.sumarDias(180));
    }

    @Test
    public void testFecha5() {
        this.fecha.setDia(01);
        this.fecha.setMes(01);
        this.fecha.setAnio(2020);
        assertEquals("2020-01-02", this.fecha.sumarDias(1));
        assertEquals("2020-01-16", this.fecha.sumarDias(15));
        assertEquals("2020-02-10", this.fecha.sumarDias(40));
        assertEquals("2020-03-21", this.fecha.sumarDias(80));
        assertEquals("2020-06-29", this.fecha.sumarDias(180));
    }
    @Test
    public void testFecha6() {
        this.fecha.setDia(27);
        this.fecha.setMes(02);
        this.fecha.setAnio(2020);
        assertEquals("2020-02-28", this.fecha.sumarDias(1));
    }

    @Test
    public void testFecha7() {
        this.fecha.setDia(28);
        this.fecha.setMes(02);
        this.fecha.setAnio(2020);
        assertEquals("2020-02-29", this.fecha.sumarDias(1));
    }

    @Test
    public void testFecha8() {
        this.fecha.setDia(29);
        this.fecha.setMes(02);
        this.fecha.setAnio(2020);
        assertEquals("2020-03-01", this.fecha.sumarDias(1));

        assertEquals("2020-02-28", this.fecha.restarDias(1));
    }

    @Test
    public void testFecha9() {
        this.fecha.setDia(01);
        this.fecha.setMes(03);
        this.fecha.setAnio(2020);
        assertEquals("2020-03-02", this.fecha.sumarDias(1));
        assertEquals("2020-03-16", this.fecha.sumarDias(15));
        assertEquals("2020-04-10", this.fecha.sumarDias(40));
        assertEquals("2020-05-20", this.fecha.sumarDias(80));
        assertEquals("2020-08-28", this.fecha.sumarDias(180));

        assertEquals("2020-02-29", this.fecha.restarDias(1));
        assertEquals("2020-02-15",this.fecha.restarDias(15));
        assertEquals("2020-01-21",this.fecha.restarDias(40));
        assertEquals("2019-12-12",this.fecha.restarDias(80));
        assertEquals("2019-09-03",this.fecha.restarDias(180));
    }
    @Test
    public void testFecha10() {
        this.fecha.setDia(15);
        this.fecha.setMes(12);
        this.fecha.setAnio(2020);
        assertEquals("2020-12-16", this.fecha.sumarDias(1));
        assertEquals("2020-12-30", this.fecha.sumarDias(15));
        assertEquals("2021-01-24", this.fecha.sumarDias(40));
        assertEquals("2021-03-05", this.fecha.sumarDias(80));
        assertEquals("2021-06-13", this.fecha.sumarDias(180));

        assertEquals("2020-12-14", this.fecha.restarDias(1));
        assertEquals("2020-11-30",this.fecha.restarDias(15));
        assertEquals("2020-11-05",this.fecha.restarDias(40));
        assertEquals("2020-09-26",this.fecha.restarDias(80));
        assertEquals("2020-06-18",this.fecha.restarDias(180));
    }
}
