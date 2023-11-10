import javax.swing.JOptionPane;

public class Atividade_rodrigo6 {

	
	public static void main (String[] args) {
		
		int vetA[] = new int[6];
		int vetB[] = new int[6];
		double percorre[] = new double [6];
		String valorA;
		double guarda;
		String[][] mensagemString = new String[2][10];
		for(int i=0;i<6;i++) {
			valorA=JOptionPane.showInputDialog(null,"Digite os valores do vetor");
			guarda = Double.parseDouble(valorA);
			percorre[i] = guarda;
			 mensagemString [0][i] = "Vetor A na posição#"+i + " = " + percorre[i];
		}
		JOptionPane.showMessageDialog(null, mensagemString);
		for(int i=0;i<6;i++) {
			if(percorre[i] % 2 == 0) {
					vetB[i] = 1;
			}
			else {
					vetB[i] = 0;
			}
			mensagemString [0][i] = "Vetor B na posição#"+i + " = " + vetB[i];
		}
		JOptionPane.showMessageDialog(null, mensagemString);
	}
}
