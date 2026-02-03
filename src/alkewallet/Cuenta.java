package alkewallet;

public class Cuenta {

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void ingresar(double monto) {
        saldo = saldo + monto;
    }
    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo = saldo - monto;
         }
      }
   }

