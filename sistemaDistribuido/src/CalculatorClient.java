import java.rmi.Naming;

import javax.swing.JOptionPane;

public class CalculatorClient {
	public static void main(String[] args) {
		String opcao[] = {"+", "-", "*", "/"};
		try {
			Calculator c = (Calculator) Naming
					.lookup("//localhost:1020/CalculatorService");
			
			int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
			
			int operacao = JOptionPane.showOptionDialog(null, "teste", "teste", 0, 
					JOptionPane.INFORMATION_MESSAGE, null, opcao, opcao[0]);
			
			int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
			
			switch(operacao) {
				case 0:
					System.out.println(c.add(n1, n2));
					break;
				case 1:
					System.out.println(c.sub(n1, n2));
					break;
				case 2:
					System.out.println(c.mul(n1, n2));
					break;
				case 3:
					System.out.println(c.div(n1, n2));
					break;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
