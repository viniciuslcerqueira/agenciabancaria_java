import java.util.HashMap;
import java.util.Map;

public class DBClientes {


    public static Map<String, ContaBancaria> contas = new HashMap<>();

    // Getter para acessar o mapa
    public static Map<String, ContaBancaria> getContas() {
        return contas;
    }

}
