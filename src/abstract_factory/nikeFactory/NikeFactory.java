package abstract_factory.nikeFactory;

import abstract_factory.baseFactory.ClothesFactory;
import abstract_factory.baseFactory.ShoesFactory;
import abstract_factory.baseFactory.TshirtFactory;

public class NikeFactory implements ClothesFactory {

    @Override
    public TshirtFactory getTshirt() {
        return null;
    }

    @Override
    public ShoesFactory getShoes() {
        return null;
    }
}
