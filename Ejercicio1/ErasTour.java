/**
 * Driver program para ErasTour java, que tiene un menú donde se puede comprar y ver disponibilidad de entradas.
 * @author Ultimate-Truth-Seeker
 * @version 14/08/2023, creado el 11/08/2023
 * 
 */

import java.util.Scanner;//Importa scanner para lectura de entrada
public class ErasTour {// driver program para el programa
    public static void main(String[] args) {
        boolean menu = true;//Condición del ciclo del menú
        Scanner s = new Scanner(System.in);// scanner para ingreso de entrada
        buyer by = new buyer();// objeto donde se almacenan los datos del comprador
        locality l1 = new locality(100);// localidades del espectáculo, se define de principio el precio de la localidad
        locality l2 = new locality(500);
        locality l3 = new locality(1000);
        do {//menu
            System.out.println("Bienvenido. Seleccione una opción: 1) Nuevo comprador 2) Nueva solicitud 3) Consultar disponibilidad 4) Disponibilidad local 5) Reporte de caja 6) Salir");
            int option = s.nextInt(); s.nextLine();// Ingreso de opción
            switch (option) {
                case 1:// Nueva instancia de comprador
                    System.out.println("Ingrese su nombre: ");//Ingresa nombre
                    by.setName(s.nextLine());
                    System.out.println("Ingrese su email: ");//Ingresa email
                    String email = s.nextLine();
                    by.setEmail(email);
                    System.out.println("Ingrese la cantidad de boletos a comprar: ");//Ingresa cantidad de boletos
                    int amount = s.nextInt();
                    by.setAmount(amount);
                    System.out.println("Ingrese su presupuesto: ");// Ingresa presupuesto
                    int balance = s.nextInt();
                    by.setBalance(balance);    
                    break;
                case 2:
                    // Función que realiza el intento de compra
                    by.attempt(l1, l2, l3);
                    
                    break;
                case 3:// Muestra total de entradas disponibles y vendidas en todas las localidades, asumiendo que al principio eran 20 por localidad
                    System.out.println("Total de entradas disponibles: ");
                    System.out.println("Localidad 1: " + l1.getSeats() + ", Vendidos: " + (20 - l1.getSeats()));
                    System.out.println("Localidad 5: " + l2.getSeats() + ", Vendidos: " + (20 - l2.getSeats()));
                    System.out.println("Localidad 10: " + l3.getSeats() + ", Vendidos: " + (20 - l3.getSeats()));
                    break;
                case 4:
                    System.out.println("Ingrese el número de la localidad: ");// Ingreso de localidad 1, 5 o 10
                    int lcl = s.nextInt();
                    switch (lcl){// Mostrar disponibles y vendidas por localidad especificada
                        case 1:
                        System.out.println("Localidad 1: " + l1.getSeats() + ", Vendidos: " + (20 - l1.getSeats()));
                        break;
                        case 5:
                        System.out.println("Localidad 5: " + l2.getSeats() + ", Vendidos: " + (20 - l2.getSeats()));
                        break;
                        case 10:
                        System.out.println("Localidad 10: " + l3.getSeats() + ", Vendidos: " + (20 - l3.getSeats()));
                        break;
                        default:
                        System.out.println("Ingrese una localidad válida");
                        break;
                    }
                    break;
                case 5:// Mostrar recaudación total en base a las entradas vendidas, asumiento que al principio eran 20 por localidad
                    System.out.println("Recaudación por localidad: ");
                    System.out.println("Localidad 1: $" + ((20 - l1.getSeats()) * l1.getPrice()));
                    System.out.println("Localidad 5: $" + ((20 - l2.getSeats()) * l2.getPrice()));
                    System.out.println("Localidad 10: $" + ((20 - l3.getSeats()) * l3.getPrice()));
                    System.out.println("Total: $" + (((20 - l1.getSeats()) * l1.getPrice()) + ((20 - l2.getSeats()) * l2.getPrice()) + ((20 - l3.getSeats()) * l3.getPrice())));
                    break;
                case 6:
                    menu = false;// Salida del menú
                    break;
                default:
                    System.out.println("Ingrese una opción correcta");
                    break;
            }
        } while (menu);
        s.close();// cierre del scanner
    }
}
