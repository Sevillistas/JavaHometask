package second.members;

import second.ActionFactory;
import second.enums.WarehouseActions;

import java.time.ZonedDateTime;

public class Producer implements Runnable {

    private ActionFactory actionFactory;

    public void setFactory(ActionFactory factory) {
        this.actionFactory = factory;
    }

    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            actionFactory.doAction(WarehouseActions.PUT);
            System.out.println("Поставка товара " + ZonedDateTime.now().toString() + "\n");
        }
    }
}
