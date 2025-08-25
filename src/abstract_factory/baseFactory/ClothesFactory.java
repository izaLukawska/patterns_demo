package abstract_factory.baseFactory;

public interface ClothesFactory {

    TshirtFactory getTshirt();

    ShoesFactory getShoes();
}
