package cl.litscl.formatearnumeroconmiles;

import java.text.DecimalFormat;

public class Start {

	public static void main(String[] args) {
		double numero = 1927502;
		
		DecimalFormat formateador = new DecimalFormat();
		String numeroFormateado = formateador.format(numero);
		
		System.out.println(numeroFormateado);
	}

}
