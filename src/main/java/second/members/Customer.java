package second.members;

import second.ActionFactory;
import second.enums.WarehouseActions;

import java.time.ZonedDateTime;

public class Customer implements Runnable {

    private ActionFactory actionFactory;

    public void setFactory(ActionFactory factory) {
        this.actionFactory = factory;
    }

    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            actionFactory.doAction(WarehouseActions.GET);
            System.out.println("Отгрузка товара " + ZonedDateTime.now().toString() + "\n");
        }
    }
}
