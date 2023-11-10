import javax.swing.JOptionPane;
import java.util.Arrays;

public class atividade_rodrigo7 {
    public static void main(String[] args) {
        int tamanho = 10;
        int[] valores = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            String input = JOptionPane.showInputDialog("Informe o valor " + (i + 1) + ":");
            valores[i] = Integer.parseInt(input);
        }

        bubbleSort(valores);

        JOptionPane.showMessageDialog(null, "Valores em ordem crescente:\n" + Arrays.toString(valores));
    }

    public static void bubbleSort(int[] ordem) {
        int n = ordem.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ordem[j] > ordem[j + 1]) {
                    int temp = ordem[j];
                    ordem[j] = ordem[j + 1];
                    ordem[j + 1] = temp;
                }
            }
        }
    }
}