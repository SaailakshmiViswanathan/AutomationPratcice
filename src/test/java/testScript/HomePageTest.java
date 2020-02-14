package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.BasePage;
import pageObject.HomePageObjects;

public class HomePageTest {
	
	BasePage bp;
	HomePageObjects hp;
	
	public HomePageTest()
	{
	bp = new BasePage();
	hp = new HomePageObjects();
	}

	@Test
	public void verifyWomenTab123()
	{
		Assert.assertTrue(bp.elementFound(hp.getWomenTab()), "Element not found");
	}
	@Test
	public void verifyDressesTab()
	{
		Assert.assertTrue(bp.elementFound(hp.getDressesTab()),"ENF");
	}
	@Test
	public void verifyTshirtsTab()
	{
		Assert.assertTrue(bp.elementFound(hp.getTshirtsTab()),"ENF");
	}
	@Test
	public void verifyUrl()
	{
		hp.getDressesTab().click();
		Assert.assertTrue(bp.getTitlte().contains("Dresses"),"Title not found");
	}
	
	@Test
	public void verifyAddtoCart()
	{
		bp.mouseHover(hp.getImage());
		hp.getaddToCart().click();
		hp.getclosePopUp().click();
		Assert.assertTrue(bp.getTxtAttribute(hp.getCartQuantity()).contains("1"),"Not Added to Cart");
	}
	
}
	
	
	

