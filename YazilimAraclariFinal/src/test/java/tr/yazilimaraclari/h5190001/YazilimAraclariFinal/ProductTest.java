package tr.yazilimaraclari.h5190001.YazilimAraclariFinal;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class ProductTest {

	@Test
	public void test() {
		fail("Not yet implemented");
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
