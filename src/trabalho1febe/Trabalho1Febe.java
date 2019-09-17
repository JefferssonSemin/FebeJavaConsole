package trabalho1febe;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeffersson semin
 */
public class Trabalho1Febe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Integer> listaNumero = new ArrayList();

        for (Integer i = 1; i < 20; i++) {
            String saida = "";
            Integer numero = Integer.parseInt(JOptionPane.showInputDialog(args));

            if (numero % 2 == 0) {
                saida += "O numero é par";
            } else {
                saida += "O numero é impar";
            }

            JOptionPane.showMessageDialog(null,
                    "Valor " + saida, "Testa numero ", JOptionPane.INFORMATION_MESSAGE);

            listaNumero.add(numero);

            if (numero >= 20) {
                break;
            }
        }

        Integer total = 0;
        for (Integer num : listaNumero) {
            total = +num;
        }
        
        for (Integer num : listaNumero) {
            total = +num;
        }
        
        calculaFatorial()

        Integer mediaAr = total / listaNumero.size();

        JOptionPane.showMessageDialog(null, "A média aritmetica é" + String.valueOf(mediaAr), "Mensagem final", JOptionPane.INFORMATION_MESSAGE);
    }

    public Integer calculaFatorial(Integer menorNum) {
        Integer i = 0;
        while (menorNum > 0) {
            i = i * menorNum;
            menorNum--;
        }
        return i;
    }
}
