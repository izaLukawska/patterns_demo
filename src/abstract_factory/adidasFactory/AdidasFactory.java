package abstract_factory.adidasFactory;

import abstract_factory.baseFactory.ClothesFactory;
import abstract_factory.baseFactory.ShoesFactory;
import abstract_factory.baseFactory.TshirtFactory;

public class AdidasFactory implements ClothesFactory {

    @Override
    public TshirtFactory getTshirt() {
        return new AdidasTshirt();
    }

    @Override
    public ShoesFactory getShoes() {
        return new AdidasShoes();
    }
}
