public class Car {

    String brand;
    String model;
    String color;
    int year;
    int km;
    double price;

    void setAraba(String brand, String model, String color, int year, int km, double price){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.km = km;
        this.price = price;
    }

    String getBrand(){
        return brand;
    }
    String getModel(){
        return model;
    }
    String getColor(){
        return color;
    }
    int getYear(){
        return year;
    }
    int getKm(){
        return km;
    }
    double getPrice(){
        return price;
    }

}
