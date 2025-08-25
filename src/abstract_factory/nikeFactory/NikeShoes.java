package abstract_factory.nikeFactory;

import abstract_factory.baseFactory.ShoesFactory;

public class NikeShoes implements ShoesFactory {

    @Override
    public void createShoes() {
        System.out.println("Nike Shoes created");
    }
}
