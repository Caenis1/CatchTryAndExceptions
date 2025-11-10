
/**
 * Exceção personalizada para indicar que um cliente não foi encontrado.
 */

public class ClienteNaoEncontradoException extends Exception {

      public ClienteNaoEncontradoException(String msg) {
        super(msg);
    }

}
