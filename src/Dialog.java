import javax.swing.JOptionPane; 
public class Dialog {
	int i, k;
	String n1, n2;
	public void input_output(){
		n1 = JOptionPane.showInputDialog("¬ведите показани€ электросчЄтчика за текущий мес€ц:");
		n2 = JOptionPane.showInputDialog("¬ведите показани€ электросчЄтчика за предыдущий мес€ц:");
		i = Integer.parseInt(n1);
		k = Integer.parseInt(n2);		
	}
	public void output(int a, double b){
		JOptionPane.showMessageDialog(null, "–асход электроэнергии составил " + a + " к¬т * час.\n" + String.format("—умма оплаты %.2f грн.", b));
	}
}