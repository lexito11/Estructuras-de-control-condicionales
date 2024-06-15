import javax.swing.JOptionPane;

public class EstructuEnCondici {

	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog("Ingrese el numero que desee");
		int numero =Integer.parseInt(num);
		if (numero > 0) {
			System.out.println("El numero: " + numero + " es un numero positivo");
		}else {
			System.out.println("El numero: " + numero + " es un numero negativo");
		}

	}

}
