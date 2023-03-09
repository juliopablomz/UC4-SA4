package senai.uc4.sa4;

public class App {


    public static void main(String[] args) {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        Produto produto = new Produto("Celular",100,1);

        produtoDAO.create(produto);
    }


}
