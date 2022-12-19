public class CarrinhoCompra {

    public static void main(String[] args) {

        String[] produtos = {"Coca-Cola Zero 2L", "Arroz Fantástico 5kg", "Chocolate Garoto ao leite 120g",
                "Bote Inflável", "Bolacha Trakinas", "Bolacha Oreo", "Batata Palha Yoki", "Bombom Ouro Branco",
                "Kit-kat", "Leite-Ninho"};

        int[] qtd = {2, 2, 7, 2, 2, 4, 2, 3, 6, 1};

        double[] preço = {qtd[0]*8, qtd[1]*21.60, qtd[2]*5.5, qtd[3]*254.34, qtd[4]*5, qtd[5]*3.59, qtd[6]*5.49,
                qtd[7]*1.5, qtd[8]*2.5, qtd[9]*16};

        double somaTotal = 0;

        for(int value = 0; value < preço.length; value++ ){
          somaTotal += preço[value];
        }

        System.out.println("Itens da compra: " + produtos[0] + ", " + produtos[1] + ", " + produtos[2] + ", " +
                produtos[3] + ", " + produtos[4] + ", " + produtos[5] + ", " + produtos[6] + ",  \n" +
                produtos[7] + ", " + produtos[8] + "e " + produtos[9] + "." + " Cada item custou " +
                "respectivamente: " + "R$ "+ preço[0] + ", R$ " + preço[1] + ", R$ " + preço[2] + ", R$ "
                + preço[3] + ", R$ " + preço[4] + ", R$ " + preço[5] + ", R$ " + preço[6] + ", R$ " + preço[7] +
                ",  \n" + ", R$ " + preço[8] + " e " + "R$ " + preço[0] + "." + "\n \n" +
                "Valor total da compra: " + "R$ " + somaTotal);

    }
}
