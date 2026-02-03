package alkewallet;

public class ConversorPesosADolares implements ConversorMoneda{
	
	private static final double TASA = 0.0011; // un ejemplo sencillo

    @Override
    public double convertir(double monto) {
        return monto * TASA;
    }

}
