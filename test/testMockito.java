import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.Test;

public class testMockito {

    @Test
    public void testMockitoFunciona() {

        List<String> listaMock = mock(List.class);

        when(listaMock.size()).thenReturn(5);

        assertEquals(5, listaMock.size());
    }
}