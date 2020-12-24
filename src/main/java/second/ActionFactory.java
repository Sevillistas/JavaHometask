package second;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import second.enums.WarehouseActions;

@Component
public class ActionFactory {

    private WareHouseService service;

    @Autowired
    public ActionFactory(WareHouseService service) {
        this.service = service;
        service.setCapacity(5);
    }

    public void doAction(WarehouseActions actionType) {
        switch (actionType) {
            case GET:
                service.get();
                break;
            case PUT:
                service.put();
                break;
        }
    }
}
