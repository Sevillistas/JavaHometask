package second;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import second.members.Customer;
import second.members.Producer;

public class SecondTask {

    private final AnnotationConfigApplicationContext appContext =
            new AnnotationConfigApplicationContext(ApplicationContext.class);

    private ActionFactory actionFactory = appContext.getBean("actionFactory", ActionFactory.class);

    public void completeSecond() {
        //покупатель товара
        Customer customer = new Customer();
        //поставщик товара
        Producer producer = new Producer();
        setFactoryInstances(producer, customer);

        Thread customerThread = new Thread(customer);
        Thread prodThread = new Thread(producer);

        prodThread.start();
        customerThread.start();
        try {
            prodThread.join();
        } catch (InterruptedException ignored) {
        }
    }

    private void setFactoryInstances(Producer producer, Customer customer) {
        producer.setFactory(this.actionFactory);
        customer.setFactory(this.actionFactory);
    }
}
