package abstract_factory.adidasFactory;

import abstract_factory.baseFactory.ShoesFactory;

public class AdidasShoes implements ShoesFactory {

    @Override
    public void createShoes() {
        System.out.println("Adidas Shoes created");
    }
}
