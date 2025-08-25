package abstract_factory;

import abstract_factory.adidasFactory.AdidasFactory;
import abstract_factory.baseFactory.ClothesFactory;
import abstract_factory.baseFactory.ShoesFactory;
import abstract_factory.baseFactory.TshirtFactory;
import abstract_factory.nikeFactory.NikeFactory;

public class Shop {

    private ClothesFactory clothesFactory;

    public Shop(String brand){
        chooseBrand(brand);
        ShoesFactory shoes = clothesFactory.getShoes();
        TshirtFactory tshirt = clothesFactory.getTshirt();
        shoes.createShoes();
        tshirt.createTshirt();
    }

    private void chooseBrand(String brand){
        if(brand.equalsIgnoreCase("Nike")){
            clothesFactory = new NikeFactory();
        } else if(brand.equalsIgnoreCase("Adidas")){
            clothesFactory = new AdidasFactory();
        } else {
            System.out.println("Brand not available");
        }
    }
}
