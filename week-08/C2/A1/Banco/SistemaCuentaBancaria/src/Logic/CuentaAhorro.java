package Logic;

public class CuentaAhorro extends Cuenta {
    @Override
    public void retirar(double monto) {
        if (getSaldo() >= monto) {
            setSaldo(getSaldo() - monto);
            System.out.println("Retiro de $" + monto + " exitoso. Saldo actual: $" + getSaldo());
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }
}
