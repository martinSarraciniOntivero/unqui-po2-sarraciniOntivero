package TPDoubles;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PokerStatus {

    public boolean verificar(String c1, String c2, String c3, String c4, String c5) {
 
        List<Carta> cartas = List.of(
            Carta.desdeString(c1), Carta.desdeString(c2),
            Carta.desdeString(c3), Carta.desdeString(c4), Carta.desdeString(c5)
        );


        Map<String, Long> frecuencias = cartas.stream()
            .collect(Collectors.groupingBy(Carta::getNumero, Collectors.counting()));

 
        return frecuencias.values().contains(4L);
    }
    
}
