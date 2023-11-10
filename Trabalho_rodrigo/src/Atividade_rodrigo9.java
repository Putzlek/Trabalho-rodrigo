import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Atividade_rodrigo9 {

	
	public static void main (String[] args) {
		Random rand = new Random();
		int v[][] = new int[4][4];
		int maior=0;
		int menor=9;
		int linha = 0,coluna = 0;
		int linha2 = 0, coluna2 = 0;
		String imprimeString = "";
		for(int i=0;i<4;i++) {
			
			for(int x=0;x<4;x++) {
				v[i][x] = rand.nextInt(10);
				if(v[i][x]>maior) {
					maior = v[i][x];
					linha = i+1 ;
					coluna = x+1 ;
				}
				if(v[i][x]<menor){
					menor = v[i][x];
					linha2 = i+1;
					coluna2 = x+1;
				}
			imprimeString = imprimeString + "/" + v[i][x]+"/ " ;
			}
			imprimeString+="\n";	
		}
		JOptionPane.showMessageDialog(null," " + imprimeString+ "\n O maior valor é: " + maior + " Sua linha é: " + linha + " Sua coluna é: " + coluna + "\nO menor valor é: " + menor + " Sua linha é: " + linha2 + " Sua coluna é: " + coluna2);
	}
}
