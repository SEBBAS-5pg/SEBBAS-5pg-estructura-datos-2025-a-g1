package Logic;

public class CuentaCorriente extends Cuenta{
    private double sobregiro;

    public void setSobregiro(double sobregiro) {
        this.sobregiro = sobregiro;
    }

    public double getSobregiro() {
        return sobregiro;
    }

    @Override
    public void retirar(double monto) {
        if (getSaldo() + sobregiro >= monto) {
            setSaldo(getSaldo() - monto);
            System.out.println("Retiro de $" + monto + " exitoso. Saldo actual: $" + getSaldo());
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }
}
