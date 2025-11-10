import javax.swing.JOptionPane;

/**
 * Interface simples via JOptionPane.
 */

public class App {
     public static void main(String args[]) {
        
        String codigo = JOptionPane.showInputDialog(
                null,
                "Digite o código do cliente:",
                "Consulta de Cliente",
                JOptionPane.QUESTION_MESSAGE
        );

        try {
            ClienteService.consultarCliente(codigo);
            JOptionPane.showMessageDialog(
                    null,
                    "✅ Cliente encontrado com sucesso!",
                    "Resultado",
                    JOptionPane.INFORMATION_MESSAGE
            );

        } catch (ClienteNaoEncontradoException e) {
            JOptionPane.showMessageDialog(
                    null,
                    e.getMessage(),
                    "Aviso",
                    JOptionPane.WARNING_MESSAGE
            );
        }
    }
}
