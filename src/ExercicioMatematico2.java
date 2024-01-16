import javax.swing.JOptionPane;

public class ExercicioMatematico2 {

	public static void main(String[] args) {
		
		String a  = JOptionPane.showInputDialog("Digite o raio da circuferência");
		
		Double  num = Double.parseDouble(a);
		
		Double pi = 3.14159;
		
		Double raio = Math.pow(num,2);
		
		Double area = pi*raio;
		
		System.out.printf(" A área da circunferência é de %.4f%n  ", area);
		
		JOptionPane.showMessageDialog(null, "A área da circunferência é de  "+ area);
		
		
		
		

	}

}
