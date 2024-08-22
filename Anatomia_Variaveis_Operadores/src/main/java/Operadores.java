import java.sql.SQLOutput;

public class Operadores {

    public static void main(String[] args) {
        // Concatenação

        System.out.println("Concatenação\n");

        String nomeCompleto = "Linguagem " + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        // Ele irá somar os 3 primeiros valores, e concatenar com o último valor pois é uma String
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

        int numero = 5;

        numero = -5;

        System.out.println(numero);

        // Transformar em número positivo
        numero = numero * -1;

        System.out.println(numero);

        // Incrementação

        System.out.println("\nIncrementação \n");

        numero = 5;

        // Mesma representação de numero + 1
        numero++;

        System.out.println(numero);

        System.out.println("\nUnário \n");

        // Unário

        // Primeiro ele irá imprimir o valor original, depois irá incrementar
        System.out.println(numero++);

        System.out.println(numero);

        numero--;

        // Mesma representação de numero - 1
        System.out.println(numero);

        // Negar expressões booleanas

        boolean variavel = true;

        System.out.println("\nInverter expressão booleana\n");

        // Inverte apenas em memória, a variável continua sendo true
        System.out.println(!variavel);

        System.out.println(variavel);

        System.out.println("\nTernário \n");

        // Ternário

        int a, b;
        a = 5;
        b = 6;

        String resultado = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado);

        System.out.println("\nRelacionais \n");

        // Relacionais

        String nomeUm = "GLEYSON";
        String nomeDois = new String("GLEYSON");

        // Equals compara se o conteúdo dos objetos são iguais
        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        System.out.println("numero1: " + numero1 + "\nnumero2: " + numero2);

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2) {
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("numero1 é igual a numero2? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numero1 é diferente do numero2? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numero1 é maior que o numero2? " + simNao);

        System.out.println("\nLógicos \n");

        // Lógicos
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("as duas condições são verdadeiras");
        }

        if (condicao1 || condicao2) {
            System.out.println("uma das condições são verdadeiras");
        }

        System.out.println("Fim");
    }
}
