package Seminar4.HomeWork4.Models;

/**
 * Модель перевозчика
 */
public class Carrier {

    private int id;
    private int[] zones;
    private long cardNumber;


    public Carrier(int id, long cardNumber) {
        this.id = id;
        this.cardNumber = cardNumber;
    }

    public int getId() {
        return id;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public int[] getZones() {
        return zones;
    }

    public void setZones(int[] zones) throws Exception {
        if (zones.length > 2){
            throw new Exception("Message");
        }
        this.zones = zones;
    }
}
