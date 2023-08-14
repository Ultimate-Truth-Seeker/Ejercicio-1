public class locality {// localidad de la venta de entradas
    private int seats;// asientos disponibles
    private int price;// precio de la entrada
    public locality(int price) {// constructor de objeto
        this.seats = 20;// define el total de entradas
        this.price = price;// define el precio de la localidad
    }
    public int getSeats() {// getter de asientos
        return seats;
    }
    public void setSeats(int seats) {// setter de asientos
        this.seats = seats;
    }
    public int getPrice() {//getter de precio
        return price;
    }
}
