package pl.rtaj.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Set;

@Controller
public class ProductController {

    @ResponseBody
    @GetMapping("/test")
    public String test() {
        return "test";
    }

    private ProductRepo productRepo;

    public ProductController(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @ResponseBody
    @GetMapping("/kategoria")
    public String prodList(@RequestParam(value = "cat" )String cat) {

        Set<Produkt> prodList = productRepo.getAll();
        return convertToString(prodList, cat);
    }

    private String convertToString(Set<Produkt> prodList, String cat) {
        String result = "";

        for (Produkt produkt : prodList) {
            if (produkt.getCategory().equals(cat)){
                return result+produkt.toString()+"\n";
            }
        }
        return result;

        /*@GetMapping("/kategoria/add")
        @ResponseBody
        public void addUsers(@RequestParam(value = "cat" )Enum cat,
                @RequestParam(value = "name")String name,
        @RequestParam(value = "price")double price) {

            Set<Produkt> prodList = new TreeSet<>();
            prodList.add(new Produkt(cat, name, price));
        }*/
    }



}
