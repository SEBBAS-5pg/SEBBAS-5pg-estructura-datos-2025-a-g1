package View;
import Logic.*;

public class Banco {
    public static void main(String[] args) {

        CuentaAhorro cuentaAhorro = new CuentaAhorro();
        cuentaAhorro.setTitular("Juan Pérez");
        cuentaAhorro.setSaldo(500.0);

        System.out.println("🟢 Cuenta de Ahorro:");
        System.out.println("Titular: " + cuentaAhorro.getTitular());
        System.out.println("Saldo inicial: $" + cuentaAhorro.getSaldo());

        cuentaAhorro.depositar(200);
        cuentaAhorro.retirar(100);
        cuentaAhorro.retirar(700);

        System.out.println("\n🔵 Cuenta Corriente:");

        CuentaCorriente cuentaCorriente = new CuentaCorriente();
        cuentaCorriente.setTitular("María Gómez");
        cuentaCorriente.setSaldo(300.0);
        cuentaCorriente.setSobregiro(200.0);

        System.out.println("Titular: " + cuentaCorriente.getTitular());
        System.out.println("Saldo inicial: $" + cuentaCorriente.getSaldo());
        System.out.println("Límite de sobregiro: $" + cuentaCorriente.getSobregiro());

        cuentaCorriente.depositar(150);
        cuentaCorriente.retirar(400);
        cuentaCorriente.retirar(300);
    }
}

