import javax.swing.JOptionPane;

public class Atividade_rodrigo8 {

	
	public static void main (String[] args) {
		
		double v [][] = new double[2][5];
		String valorA;
		double guarda;
		String imprimeString = "";
		for(int i=0;i<2;i++) {
		
			for(int x=0;x<5;x++) {
				valorA=JOptionPane.showInputDialog(null,"Digite os valores da Matriz");
				guarda = Double.parseDouble(valorA);
				v[i][x] = guarda;
				imprimeString = imprimeString + "/" + v[i][x]+"/ ";
				
			}
			imprimeString+="\n";
			
		}	
		JOptionPane.showMessageDialog(null," " + imprimeString);
	}
}
