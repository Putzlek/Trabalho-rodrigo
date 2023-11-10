import javax.swing.JOptionPane;

public class Atividade_rodrigo4 {
		
public static void main (String[] args) {
	
		
			int v[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			float par= 0;
			float impar = 0;
			float porcpar,porcimpar;
			String[][] mensagemString = new String[2][10];
			
			for(int i=0;i<10;i++) {
				mensagemString[0][i] = "Vetor na posição#"+i + " = " + v[i];
				
				if(v[i] % 2 ==0) {
					par++;
				}
				else {
					impar++;
				}
		}
			porcpar = par/10 *100;
			porcimpar = impar/10 *100;
			JOptionPane.showInternalMessageDialog(null, mensagemString);
			JOptionPane.showMessageDialog(null, "Total de numeros pares = " + par + "\nTotal de numeros impares = " + impar);
			JOptionPane.showMessageDialog(null, "percentual par = %" + porcpar + "\n" + "percentual impar = %" + porcimpar);
	}
}