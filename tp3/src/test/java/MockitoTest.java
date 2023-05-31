import org.example.Fecha;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class MockitoTest {
    @Test
    public void Test1() {
        Fecha servicioMock = mock(Fecha.class);
        servicioMock.setAnio(2019);
        servicioMock.setMes(01);
        servicioMock.setDia(01);
        when(servicioMock.sumarDias(180)).thenReturn("2019-06-30");
        assertEquals("2019-06-30", servicioMock.sumarDias(180));
        verify(servicioMock).sumarDias(180);
    }

}
