package lesson_12;

import java.util.Comparator;

public class CoinsCompare implements Comparator<Coin> {
    @Override
    public int compare(Coin o1, Coin o2) {
        int priceComparison = Double.compare(o1.getPrice(), o2.getPrice());
        if (priceComparison != 0) {
            return priceComparison;
        }
        int nominalComparison = Double.compare(o1.getNominal(), o2.getNominal());
        if (nominalComparison != 0) {
            return nominalComparison;
        }
        int countryComparison = o1.getCountry().compareTo(o2.getCountry());
        if (countryComparison != 0) {
            return countryComparison;
        }
        return Double.compare(o1.getDiameter(), o2.getDiameter());
    }
}
