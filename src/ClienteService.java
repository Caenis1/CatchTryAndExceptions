
/**
 * Camada intermediária entre o App e o DAO.
 */

public class ClienteService {

     public static void consultarCliente(String codigo) throws ClienteNaoEncontradoException {
        ClienteDAO.consultarCliente(codigo);
    }

}
