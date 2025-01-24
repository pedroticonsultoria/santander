import dao.CartaoDAO;
import model.CartaoModel;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CartaoDAO cartaoDAO = new CartaoDAO();

        List<CartaoModel> cartoes = cartaoDAO.listarTodos();

        if (cartoes.isEmpty()) {
            System.out.println("Nenhum cartão encontrado.");
        } else {
            for (CartaoModel cartao : cartoes) {
                System.out.println(cartao);
            }
        }
    }
}
