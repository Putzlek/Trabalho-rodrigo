import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Atividade_rodrigo2 {

	public static void main (String[] args) {
	
		
		int v[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int v2[] = {0, 2, 6, 12, 20, 30, 42, 56, 72, 90};
		int v3[] = {1,4,9,16,25,36,49,64,81,100};
		
		String[][] mensagemString = new String[3][10]; 
		
		for(int i=0;i<v.length;i++) {
			mensagemString[0][i] = "vetor a: " + v[i];
		}
		JOptionPane.showInternalMessageDialog(null, mensagemString[0]);
		
	
		for(int z=0;z<10;z++) {
			mensagemString[1][z] = "vetor b: " + v2[z];
		}
		JOptionPane.showInternalMessageDialog(null, mensagemString[1]);
		
		
		for(int x=0;x<10;x++) {
			mensagemString[2][x] = "vetor c: " + v3[x];
		}
		JOptionPane.showInternalMessageDialog(null, mensagemString[2]);
	}
}