import javax.swing.JOptionPane;

public class Atividade_rodrigo3 {
	
	public static void main (String[] args) {
		
			int v[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			int soma = 0;
			String[][] mensagemString = new String[2][10];
			
			for(int i=0;i<10;i++) {
			 soma += v[i];
			 mensagemString [0][i] = "Vetor na posição#"+i + " = " + v[i];
			}
			JOptionPane.showInternalMessageDialog(null, mensagemString);
			JOptionPane.showInternalMessageDialog(null,"total da soma dos valores do vetor = " + soma);
	}
}