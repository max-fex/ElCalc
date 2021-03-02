public class ElCalculation {
	public static void main(String args[]){
		int diff;
		double payment;
		Dialog d = new Dialog ();
		d.input_output();
		diff = d.i - d.k;
		if (diff <= 100) 
			payment = diff*0.456;
		else if (diff<=600)
			payment = 100*0.456+(diff-100)*0.789;
		else payment = 100*0.456+(500)*0.789+(diff-600)*1.479;
		d.output(diff, payment);
		}
	}