public class ClienteDAO {

   // Simulação de busca de cliente em banco de dados
    public static void consultarCliente(String codigo) throws ClienteNaoEncontradoException {

         boolean clienteExiste = "123".equals(codigo);

        if (!clienteExiste) {
            throw new ClienteNaoEncontradoException(
                "Cliente com código '" + codigo + "' não foi encontrado."
            );
        }
    }

}
