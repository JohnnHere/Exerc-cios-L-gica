public class Main {
   static int result = 100;
    public static void main(String[] args) {

        double pontosCirculo = 0; double pontosTotais = 0;

        for (int value = 0; value <  result; value++) {

            double generatedNumber = Math.random();

            double generatedNumber2 = Math.random();

            double distance = generatedNumber * generatedNumber + generatedNumber2 * generatedNumber2;

            if (distance <= 1)
            pontosCirculo += 1;
            pontosTotais += 1;

            double total = 4 * (pontosCirculo / pontosTotais);
            System.out.println(total);
        }

    }
}