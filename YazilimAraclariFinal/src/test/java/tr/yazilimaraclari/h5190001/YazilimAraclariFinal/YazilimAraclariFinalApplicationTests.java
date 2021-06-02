package tr.yazilimaraclari.h5190001.YazilimAraclariFinal;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class YazilimAraclariFinalApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public final void getProductTest() {
		List<Product> list = ProductStore.getProducts();
		Boolean isEmpty = list.isEmpty();
		assertEquals(false, isEmpty);	
	}
	
	@Test
	public final void addProductTest() {
		Product products = new Product("selam", "7");
		List<Product> list = ProductStore.addProduct(products);
		Boolean isAdded = list.contains(products);
		assertEquals(true, isAdded);
	}

}
