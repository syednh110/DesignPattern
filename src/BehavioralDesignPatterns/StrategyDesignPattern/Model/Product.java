package BehavioralDesignPatterns.StrategyDesignPattern.Model;

public class Product {

    private String name;
    private String code;
    private Double price;

    public Product(String name, String code, Double price) {
        this.name = name;
        this.code = code;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public Double getPrice() {
        return price;
    }
}
