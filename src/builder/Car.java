package builder;

public class Car {

    private String brand;

    private String type;

    private String model;

    private String color;

    private Double engine;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngine(Double engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }

    public static class CarBuilder{

        private final Car car = new Car();

        public static CarBuilder builder(){
            return new CarBuilder();
        }

        public CarBuilder brand(String brand){
            car.setBrand(brand);
            return this;
        }

        public CarBuilder model(String model){
            car.setModel(model);
            return this;
        }

        public CarBuilder type(String type){
            car.setType(type);
            return this;
        }

        public CarBuilder color(String color){
            car.setColor(color);
            return this;
        }

        public CarBuilder engine (Double engine){
            car.setEngine(engine);
            return this;
        }

        public Car build(){
            return car;
        }
    }
}
