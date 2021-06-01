package tr.yazilimaraclari.h5190001.YazilimAraclariFinal;

import java.util.*;

import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/product")
public class ProductRestAPI {
	
	@GetMapping("/list")
	public List<Product> list() {
		return ProductStore.getProducts();
	}
	
	@PostMapping("/add")
	public Product add(@RequestBody Product product) {
		ProductStore.addProduct(product);
		return product;
	}
	
	@PostMapping("/delete")
	public List<Product> delete(@RequestBody Product product) {
		ProductStore.removeProduct(product.getProductNo());
		return ProductStore.getProducts();
	}
}
