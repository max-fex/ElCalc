import javax.swing.JOptionPane; 
public class Dialog {
	int i, k;
	String n1, n2;
	public void input_output(){
		n1 = JOptionPane.showInputDialog("������� ��������� ��������������� �� ������� �����:");
		n2 = JOptionPane.showInputDialog("������� ��������� ��������������� �� ���������� �����:");
		i = Integer.parseInt(n1);
		k = Integer.parseInt(n2);		
	}
	public void output(int a, double b){
		JOptionPane.showMessageDialog(null, "������ �������������� �������� " + a + " ��� * ���.\n" + String.format("����� ������ %.2f ���.", b));
	}
}