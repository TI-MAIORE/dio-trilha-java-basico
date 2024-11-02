public class OperadorTernario {
    public static void main(String[] args) {
        int a, b;

        a = 6;
        b = 6;

//        String resultado = "";
//        if(a==b) //Se a for == b o resultado é verdadeiro
//            resultado = "Verdadeiro";
//        else // Se não o resultado será falso
//            resultado = "Falso";

        //Usando operador ternário:
//      String resultado = a==b ? "Verdadeiro" : "Falso";
        int resultado = a==b ? 1 : 0;
        System.out.println(resultado);

    }
}
