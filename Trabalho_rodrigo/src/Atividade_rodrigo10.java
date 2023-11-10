import javax.swing.JOptionPane;

public class Atividade_rodrigo10 {

	
	public static void main (String[] args) {
		
		int v[][] = new int[3][3];
		String valorA;
		double guarda;
		int par=0,impar=0;
		String imprimeString = "";
		for(int i=0;i<3;i++) {
			
				for(int x=0;x<3;x++) {
					valorA=JOptionPane.showInputDialog(null,"Digite os valores da matriz");
					guarda = Double.parseDouble(valorA);
					v[i][x] = (int) guarda;
					if(guarda % 2 ==0) {
						par++;
					}
					else {
						impar++;
					}
					imprimeString = imprimeString + "/" + v[i][x]+"/ " ;
			}
				imprimeString+="\n";
		}
		JOptionPane.showMessageDialog(null,imprimeString + "\nExitem " + par + " numero pares" + "\n" + "&" + "\n" + impar + " Numeros impares"); 
	}
}
