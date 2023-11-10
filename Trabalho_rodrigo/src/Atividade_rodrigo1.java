import javax.swing.JOptionPane;

public class Atividade_rodrigo1 {

	public static void main (String[] args) {
		
			int v[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			int v2[] = {0, 2, 6, 12, 20, 30, 42, 56, 72, 90};

			String[][] mensagemString = new String[2][10];
			
			for(int i=0;i<10;i++) {
				mensagemString[0][i] = "vetor a: " + v[i];
			}
			JOptionPane.showInternalMessageDialog(null, mensagemString[0]);
			
			
			for(int z=0;z<10;z++) {
				mensagemString[1][z] = "vetor b: " + v2[z];
			}
			JOptionPane.showInternalMessageDialog(null, mensagemString[1]);
	}
}