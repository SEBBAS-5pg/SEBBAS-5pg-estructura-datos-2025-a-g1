package View;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CineReservas{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int opcion;
        int fila, asiento;


        boolean[][] sala = new boolean[5][10];

        for(int i = 0; i < 5;i++){
            for ( int j = 0; j >5; j++){
                sala[i][j]=false;
            }
        }
        do{
            System.out.println("\n" +
                    "--- © cine \"La consola cineasta\"---\n" +
                    "1. Mostrar Sala\n" +
                    "2. Reservar Asiento\n" +
                    "3. Liberar asiento\n"+
                    "4. Ver Ocupación\n" +
                    "5. Salir\n" +
                    "ELIJA UNA OPCIÓN");
            try{
                opcion = scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Entrada no valida, ingrese un numero del 1 al 5.");
                scanner.next();
                opcion = 0;
            }

            switch (opcion){
                case 1:
                    System.out.println("\n--- ESTADO ACTUAL DE LA SALA ---");

                    for (int j = 0; j < 10; j++) {
                        System.out.printf("%-3d", j+1);
                    }
                    System.out.println();
                    System.out.println("----------------------------------");

                    for (int i = 0; i < 5; i++) {
                        System.out.printf("F%d | ", i + 1);
                        for (int j = 0; j < 10; j++) {
                            System.out.printf("%-3c", sala[i][j]? 'X' : 'D');
                        }
                        System.out.println();
                    }
                    System.out.println("Leyenda:\n D = Disponible \n X = Ocupado");
                    break;
                case 2:
                    System.out.println(
                            "\n--- RESERVAR ASIENTO ---\n" +
                            "Ingrese el numero de fila (1-5): ");
                            fila = scanner.nextInt();
                    System.out.println("\n Ingrese el numero de asiento (1-10):  ");
                    asiento = scanner.nextInt();

                    fila--;
                    asiento--;

                    if(fila >= 0 && fila <5 && asiento >= 0 && asiento < 10){
                        if (!sala[fila][asiento]){
                            sala[fila][asiento] = true;
                            System.out.println("Asiento Fila "+(fila + 1)+ ", Asiento ¡Reservado!");
                        } else{
                            System.out.println("EL asiento Fila "+ (fila + 1) + ", Asiento "+(asiento+1)+ " ya se encuentra ocupado trate con otro.");
                        }
                    }else{
                        System.out.println("Fila o asiento fuera de rango. Intente de nuevo");
                    }
                    break;
                case 3:
                    System.out.println(
                            "\n--- CANCELAR RESERVA ---\n"+
                            "Ingrese el numero de fila (1-5): ");
                    fila = scanner.nextInt();
                    System.out.println("\n Ingrese el numero de asiento (1-10):  ");
                    asiento = scanner.nextInt();
                    fila--;
                    asiento--;
                    if(fila>=0 && fila <5 && asiento >= 0 && asiento < 10){
                        if(sala[fila][asiento]){
                            sala[fila][asiento]= false;
                            System.out.println("Reserva de Fila " + (fila + 1) + ", Asiento " + (asiento + 1)+ "¡cancelada!");
                        }else{
                            System.out.println("Fila o asiento fuera de rango. Intente de nuevo");
                        }
                    }else{
                        System.out.println("Fila o asiento fuera de rango. Intente de nuevo.");
                    }
                    break;
                case 4:
                    System.out.println("\n--- ESTADO DE OCUPACIÓN ---");
                    int totalAsientos = 5 * 10;
                    int asientosOcupados = 0;
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 10; j++) {
                            if(sala[i][j]){
                                asientosOcupados++;
                            }
                        }
                    }
                    int asientosDisponibles = totalAsientos - asientosOcupados;
                    double porcentajeOcupados = (double) asientosOcupados / totalAsientos *100;
                    double porcentajeDisponibles = (double) asientosDisponibles / totalAsientos * 100;
                    System.out.println("\n Total de asientos: "+ totalAsientos +
                            "\n Asientos ocupados: " + asientosOcupados + "  %" + porcentajeOcupados +
                            "\n Asientos disponibles: " + asientosDisponibles + "  %" + porcentajeDisponibles);
                    break;
                case 5:
                    System.out.println("Feliz dia © :)");
                default:
                    System.out.println("Opcion no valida. elija un numero del 1 al 5.");
            }
        }while(opcion != 5);
        scanner.close();
    }
}