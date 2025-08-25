package abstract_factory.nikeFactory;

import abstract_factory.baseFactory.TshirtFactory;

public class NikeTshirt implements TshirtFactory {

    @Override
    public void createTshirt() {
        System.out.println("Nike Tshirt created");
    }
}
