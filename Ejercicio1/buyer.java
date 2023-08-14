
// importe de librería random
import java.util.Random;
/**
 * Clase que define al comprador
 * @author Ultimate-Truth-Seeker
 * @version 13/08/2023
 */
public class buyer {
    private Random r = new Random();// objeto random para intento de compra
    private String name;// nombre de comprador
    private String email;// email de comprador
    private int amount;// cantidad de entradas a comprar
    private int balance;// presupuesto para gastar
    /**
     * constructor de la clase buyer
     */
    public buyer(){
        // constructor de objeto
    }

    // getter y setter de nombre
    /** 
     * retorna nombre
     * @return String
     */
    public String getName() {
        return name;
    }
    
    /** 
     * establece nombre
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    // getter y setter de email
    /** 
     * retorna email
     * @return String
     */
    public String getEmail() {
        return email;
    }
    /**
     * establece email
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    // getter y setter de amount
    /**
     * retorna cantidad
     * @return amount
     */
    public int getAmount() {
        return amount;
    }
    /**
     * establece amount
     * @param amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    // getter y setter de balance
    /**
     * retorna presupuesto
     * @return balance
     */
    public int getBalance() {
        return balance;
    }
    /**
     * establece presupuesto
     * @param balance
     */
    public void setBalance(int balance) {
        this.balance = balance;
    }

    /** Función de intento de compra, realiza el algoritmo de intento y actualiza las entradas disponibles al comprar.
    * @param l1 localidad 1
    * @param l2 localidad 5
    * @param l3 localidad 10
    **/
    public void attempt(locality l1, locality l2, locality l3) {
        // Números aleatorios a y b que servirán para validar el ticket
        int a = r.nextInt(1, 15001);
        int b = r.nextInt(1, 15001);
        int ticket = r.nextInt(1, 15001); // número aleatorio del ticket
        if ((ticket <= a && ticket >= b) || (ticket >= a && ticket <= b)){// verificar que el ticket este entre a y b
            int c = r.nextInt(1, 4);// Elegir una localidad al azar
            switch (c){// Intentar comprar según elección de localidad
                case 1:
                if (l1.getSeats() >= this.amount && amount*l1.getPrice() <= balance){// Verificar que hay asientos disponibles y que el presupuesto alcanza
                    l1.setSeats(l1.getSeats() - amount);// Disminuye el total de asientos disponibles
                    System.out.println("Se han comprado " + this.amount + " asientos en la localidad 1 por $" + amount*l1.getPrice());
                    this.balance -= amount*l1.getPrice();// Se deduce del prespuesto el total gastado
                } else {
                    System.out.println("Intento fallido. No se pudo comprar en la localidad 1");
                }
                break;
                // Mismo procedimiento con las otras dos localidades
                case 2:
                if (l2.getSeats() >= this.amount && amount*l2.getPrice() <= balance){
                    l2.setSeats(l2.getSeats() - amount);
                    System.out.println("Se han comprado " + this.amount + " asientos en la localidad 5 por $" + amount*l2.getPrice());
                    this.balance -= amount*l2.getPrice();
                } else {
                    System.out.println("Intento fallido. No se pudo comprar en la localidad 5");
                }
                break;
                case 3:
                if (l3.getSeats() >= this.amount && amount*l3.getPrice() <= balance){
                    l3.setSeats(l3.getSeats() - amount);
                    System.out.println("Se han comprado " + this.amount + " asientos en la localidad 10 por $" + amount*l3.getPrice());
                    this.balance -= amount*l3.getPrice();
                } else {
                    System.out.println("Intento fallido. No se pudo comprar en la localidad 10");
                }
                break;
                
            }
        } else {
            System.out.println("Intento fallido. El ticket no pudo comprar boletos.");
        }
        
    }

}
