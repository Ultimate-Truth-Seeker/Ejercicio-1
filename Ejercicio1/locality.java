/**
 * Clase que define la localidad de venta
 * @author Ultimate-Truth-Seeker
 * @version 13/08/2023
 */
public class locality {// localidad de la venta de entradas
    private int seats;// asientos disponibles
    private int price;// precio de la entrada
    /**
     * Constructor de localidad, ingresa el precio de la entrada en la localidad
     * @param price
     */
    public locality(int price) {// constructor de objeto
        this.seats = 20;// define el total de entradas
        this.price = price;// define el precio de la localidad
    }
    /**
     * retorna asientos disponibles
     * @return
     */
    public int getSeats() {// getter de asientos
        return seats;
    }
    /**
     * asigna asientos disponibles
     * @param seats
     */
    public void setSeats(int seats) {// setter de asientos
        this.seats = seats;
    }
    /**
     * retorna precio
     * @return
     */
    public int getPrice() {//getter de precio
        return price;
    }
}
