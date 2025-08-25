package abstract_factory.adidasFactory;

import abstract_factory.baseFactory.TshirtFactory;

public class AdidasTshirt implements TshirtFactory {

    @Override
    public void createTshirt() {
        System.out.println("Adidas Tshirt created");
    }
}
