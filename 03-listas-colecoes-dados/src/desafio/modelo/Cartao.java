package desafio.modelo;

import java.util.ArrayList;
import java.util.List;

public class Cartao {
    private double limite;
    private final List<Produto> listaCompras = new ArrayList<>();

    public void adicionarLista(Produto produto){
        this.listaCompras.add(produto);
        this.limite -= produto.getValor();
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public List<Produto> getListaCompras() {
        return listaCompras;
    }

}
