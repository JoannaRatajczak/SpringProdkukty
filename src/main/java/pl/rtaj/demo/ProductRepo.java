package pl.rtaj.demo;

import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

@Repository
public class ProductRepo {

    Set<Produkt> prodList = new HashSet<>();

    public ProductRepo() {
        prodList.add(new Produkt(Category.INNE, "Filodendron", 24.99));
        prodList.add(new Produkt(Category.DOMOWE, "Gumowa Kaczuszka", 10.50));
        prodList.add(new Produkt(Category.SPOZYWCZE, "Czekolada", 4.99));
    }

    public Set<Produkt> getAll() {
        return prodList;
    }

    public void addProd(Produkt produkt) {
    }


}
