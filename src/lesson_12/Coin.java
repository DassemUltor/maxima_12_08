package lesson_12;

import java.util.Objects;

public class Coin {

    private double nominal;
    private String country;
    private double diameter;
    private double price;

    public Coin(double nominal, String country, double diameter, double price) {
        this.nominal = nominal;
        this.country = country;
        this.diameter = diameter;
        this.price = price;
    }

    public double getNominal() {
        return nominal;
    }

    public double getPrice() {
        return price;
    }

    public double getDiameter() {
        return diameter;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coin coin)) return false;
        return Double.compare(nominal, coin.nominal) == 0 && Double.compare(diameter, coin.diameter) == 0
                && Double.compare(price, coin.price) == 0 && Objects.equals(country, coin.country);
    }

    @Override
    public int hashCode() {
        return 31 * (Objects.hash(nominal, country, diameter, price));
    }

    @Override
    public String toString() {
        return "Coin{" +
                "nominal=" + nominal +
                ", country='" + country + '\'' +
                ", diameter=" + diameter +
                ", price=" + price +
                '}';
    }
}
