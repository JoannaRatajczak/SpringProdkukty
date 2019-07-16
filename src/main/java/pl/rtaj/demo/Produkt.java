package pl.rtaj.demo;

import java.util.Objects;

public class Produkt {
    Enum Category;
    String prodName;
    double prodPrice;
    double prodPriceSum;

    @Override
    public String toString() {
        return "pl.rtaj.demo.Produkt: " +
                "kategoria: " + Category +
                "nazwa: " + prodName +
                "cena: " + prodPrice;
    }

    public Produkt(Enum category, String prodName, double prodPrice) {
        Category = category;
        this.prodName = prodName;
        this.prodPrice = prodPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produkt produkt = (Produkt) o;
        return Double.compare(produkt.prodPrice, prodPrice) == 0 &&
                Category.equals(produkt.Category) &&
                prodName.equals(produkt.prodName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Category, prodName, prodPrice);
    }

    public Enum getCategory() {
        return Category;
    }

    public void setCategory(Enum category) {
        Category = category;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(double prodPrice) {
        this.prodPrice = prodPrice;
    }

    public double getProdPriceSum() {
        return prodPriceSum;
    }

    public void setProdPriceSum(double prodPriceSum) {
        this.prodPriceSum = prodPriceSum;
    }
}
