import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        List<Integer> listaNumero = new ArrayList();
        int totalMedia, numero, numero2Digitado, menornum, quantidadeprimo, qtd5, qtd3;
        numero2Digitado = 0;
        qtd5=0;
        qtd3 =0;
        menornum = 0;
        quantidadeprimo = 0;
        totalMedia= 0;

        for (Integer i = 1; i < 20; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

            // Maior que 20 cai fora.
            if (numero > 20) {
                break;
            }

            totalMedia += numero;

            // adiciona a uma lista.
            listaNumero.add(numero);

            // Verifica se é número 2.
            if (numero == 2) {
                numero2Digitado++;
            }

            //Número par ou ímpar.
            if ((numero % 2) == 0) {
                System.out.println("O número " + numero + " é par");
            } else {
                System.out.println("O número " + numero + " é ímpar");
            }

            //Número primo ou não.
            if (EhPrimo(numero)) {
                quantidadeprimo++;
                System.out.println("O número " + numero + " é primo");
            } else {
                System.out.println("O número " + numero + " não é primo");
            }

            //Múltiplos de 5 e 3//
            if ((numero % 5) == 0) {
                qtd5++;
            }
            if ((numero % 3) == 0) {
                qtd3++;
            }


            for (Integer menorNumero = 1; menorNumero > 1000; menornum++) {
                for (Integer num : listaNumero) {
                    if (menorNumero == num) {
                        menornum = num;
                        break;
                    }
                }
            }
        }

        System.out.println("A média aritmética é: " + totalMedia / listaNumero.size());
        System.out.println("O fatorial do menor número é: " + CalculaFatorial(menornum));
        System.out.println("Quantidade dos números mútiplos de 5 é " + qtd5);
        System.out.println("Quantidade dos números mútiplos de 3 é " + qtd3);
        System.out.println("Quantidade dos números primos digítados foi " + quantidadeprimo);
        System.out.println("O número 2 foi digitado " + numero2Digitado + " vezes");

    }


    private static boolean EhPrimo(Integer numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;
        }
        return true;
    }

    private static String CalculaFatorial(Integer numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
               return numero.toString();
        }
        return numero.toString();
    }
}