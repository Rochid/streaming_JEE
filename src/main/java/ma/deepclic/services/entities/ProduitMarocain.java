package ma.deepclic.services.entities;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")

 
	public class ProduitMarocain {
	    private String name;
	    private Long price;
	    private int quantité;  
	   

	    public void phone() {
	        System.out.println("name: " + "smartphone" );
	        System.out.println("price: " + 1200 + " MAD");
	        System.out.println("quantité : " + 800 );
	    }

	    public void pc () {
	    	   System.out.println("name: " + "hp" );
		        System.out.println("price: " + 4500 + " MAD");
		        System.out.println("quantité : " + 200 );
		        
	    	
	    }
	
	
	}


