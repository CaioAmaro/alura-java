package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel c){
        if(c.getClassificao() >= 4){
            System.out.println("Está entre os preferidos do momento");
        }else{
            System.out.println("Coloque na sua lista para assitir depois.");
        }
    }
}
