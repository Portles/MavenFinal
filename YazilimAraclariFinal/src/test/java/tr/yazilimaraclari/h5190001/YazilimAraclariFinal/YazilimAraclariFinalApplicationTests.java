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
	
	@Test
	public final void removeProductTest() {
		String poz = "1";
		List<Product> list = ProductStore.getProducts();
		List<Product> afterList = ProductStore.removeProduct(poz);
		Boolean isDeleted = false;
		if(list == afterList) {
			isDeleted = true;
		}
		
		assertEquals(true, isDeleted);
	}
	
	@Test
	public final void removeNoProductTest() {
		String poz = "8345830";
		
		List<Product> list = ProductStore.getProducts();
		List<Product> afterList = ProductStore.removeProduct(poz);
		
		Boolean isDeleted = true;
		
		if(list == afterList) {
			isDeleted = false;
		}
		
		assertEquals(false, isDeleted);
	}
	
	@Test
	public final void getNameTest() {
		List<Product> list = ProductStore.getProducts();
		String name = "Kalem";
		Boolean isGet = false;
		if(list.get(0).getName() == name) {
			isGet = true;
		}
		
		assertEquals(true, isGet);	
	}
	
	@Test
	public void applicationContextTest() {
	    YazilimAraclariFinalApplication.main(new String[] {});
	}

}
