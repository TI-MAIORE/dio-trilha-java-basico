public class OperadorIncremento {
    public static void main(String[] args) {
        int numero = 5;
        //X repetição
        numero = numero + 1;
        //Podemos incrementar de maneira abreviada:
        numero++;
        //Que é a mesma coisa de numero = numero +1;

        System.out.println(++numero);

        numero--;
        System.out.println(numero);
        System.out.println(numero--);

        boolean variavel = true;

        variavel = !variavel;
        System.out.println(variavel);
    }
}
