package alkewallet;

public class Main {

	public static void main(String[] args) {
	    Cuenta cuenta = new Cuenta();

	    cuenta.ingresar(1000);
	    
	    ConversorMoneda conversor = new ConversorPesosADolares();
	    double saldoUSD = conversor.convertir(cuenta.getSaldo());

	    System.out.println("Saldo en pesos: " + cuenta.getSaldo());
	    System.out.println("Saldo en dólares: " + saldoUSD);
	}
	  
}
