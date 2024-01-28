package ma.deepclic.services.entities;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @GetMapping("/ma")
    public String productsMa() {
        return "Paroduct Ma!";
    }
    
    @GetMapping("/fr")
    public String productsFr() {
        return "Product Fr!";
    }
}
