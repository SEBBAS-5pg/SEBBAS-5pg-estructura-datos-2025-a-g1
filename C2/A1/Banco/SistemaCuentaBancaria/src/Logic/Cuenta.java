package Logic;

public abstract class Cuenta {
    private String Titular;
    private double Saldo;

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public abstract void retirar(double monto);

    public void depositar(double monto) {
        this.Saldo += monto;
        System.out.println("Depósito de $" + monto + " realizado. Nuevo saldo: $" + this.Saldo);
    }
}
