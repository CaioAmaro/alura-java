public class Condicional {
    public static void main(String[] args) {
        int anoDeLacamento = 2022;
        boolean incluidoNoPlano = true;
        double media = (9.8 + 6.3 + 8.0) / 3;
        String tipoPlano = "plus";

        if(anoDeLacamento >= 2022){
            System.out.println("Lançamentos que os clientes estão curtindo");
        }else{
            System.out.println("Filme retrô qu vale a pena assitir!");
        }

        if(incluidoNoPlano == true || tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        }else{
            System.out.println("Deve pagar a locação");
        }



    }
}
