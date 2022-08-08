package clases;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {
    private Map<Integer, List<Prenda>> prendas = new HashMap<>();
    private Integer identificador = 0;

    public Integer guardarPrenda(List<Prenda> listPrendas ) {
        identificador++;
        prendas.put(identificador, listPrendas);
        return identificador;
    }

    public void mostrarPrendas(){
        prendas.forEach((key, value) -> System.out.println(key+":"+value));
    }

    public List<Prenda> devolverPrenda(Integer numero) {
        return prendas.get(numero);
    }

}
