import javax.swing.JOptionPane;

public class Atividade_rodrigo5 {
		
	public static void main (String[] args) {
			
		
			int notalunos [] = new int[10];
			double notas [] = new double[10];
			double notas2 [] = new double [10];
			String prova1,prova2;
			double valor1 = 0;
			double valor2 = 0;
			double media = 0;
			for(int i=0;i<10;i++) {
				prova1 = JOptionPane.showInputDialog(null,"Valor da nota da primeira prova dos 10 alunos (escreva em ordem)");
				valor1 = Double.parseDouble(prova1);
				notas[i] = valor1;
			}
			
			for(int i=0;i<10;i++) {
				prova2 = JOptionPane.showInputDialog(null,"Valor da nota da segunda prova dos 10 alunos (escreva em ordem)");
				valor2 = Double.parseDouble(prova2);
				notas2[i] = valor2;
			}
			
			for(int i=0;i<10;i++) {
				media = (notas[i] + notas2[i]) / 2;
				if(media >= 7) {
					JOptionPane.showMessageDialog(null, "aprovado " + media);
				}
				else {
					JOptionPane.showMessageDialog(null, "reprovado " + media);
				}
			}
			
	}
}
