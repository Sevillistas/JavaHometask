package second;

import org.springframework.stereotype.Service;

@Service
public class WareHouseService {

    private int amount = 0;
    private int capacity;

    public synchronized void get() {
        while (this.amount >= this.capacity) {
            try {
                wait();
            } catch (InterruptedException ignored) {
            }
        }
        this.amount++;
        System.out.println("Кол-во товаров " + this.amount);
        this.notify();
    }

    public synchronized void put() {
        while (this.amount < 1) {
            try {
                wait();
            } catch (InterruptedException ignored) {
            }
        }
        this.amount--;
        System.out.println("Кол-во товаров " + this.amount);
        this.notify();
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
