package tr.yazilimaraclari.h5190001.YazilimAraclariFinal;

import java.util.*;

public final class ProductStore {
	private static final List<Product> PRODUCTS = new ArrayList<Product>();
	static {
		PRODUCTS.add(new Product("Kalem", "1"));
		PRODUCTS.add(new Product("Silgi", "2"));
		PRODUCTS.add(new Product("Kalem Tıraş", "3"));
		PRODUCTS.add(new Product("Uç", "4"));
		PRODUCTS.add(new Product("Kırmızı Kalem", "5"));
	}
	
	private ProductStore() {
		
	}
	
	public static List<Product> getProducts() {
		return PRODUCTS;
	}
	
	public static List<Product> addProduct(Product product) {
		PRODUCTS.add(product);
		return PRODUCTS;
	}
	
	public static List<Product> removeProduct(String poz) {
		for(Product o : PRODUCTS) {
			if(o.getProductNo().equals(poz)) {
				PRODUCTS.remove(o);
				return PRODUCTS;
			}
		}
		return PRODUCTS;
	}
}
