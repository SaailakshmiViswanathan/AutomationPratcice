package testScript;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.BasePage;
import pageObject.DressPageObjects;
import pageObject.HomePageObjects;

public class DressPageTest {

	BasePage bp;
	HomePageObjects hp;
	DressPageObjects dp;
	
	public DressPageTest()
	{
		bp = new BasePage();
		hp = new HomePageObjects();
		dp = new DressPageObjects();
	}
	int random = new Random().nextInt(5000);
	String email = "cartest" + random + "gmail.com";
	
	@Test
	public void verifySize()
	{
		Assert.assertTrue(bp.elementFound(dp.getSizeS()), "S Size not found");
		Assert.assertTrue(bp.elementFound(dp.getSizeM()), "M Size not found");
		Assert.assertTrue(bp.elementFound(dp.getSizeL()), "L Size not found");
	}
	
	@Test
	public void verifyProduct()
	{
		hp.getDressesTab().click();
		bp.mouseHover(hp.getImage());
		dp.getMoreButton().click();
		Assert.assertTrue(bp.elementFound(dp.getTweet()),"Fail");
		Assert.assertTrue(bp.elementFound(dp.getProductDes()),"Fail");
	}
	
	@Test
	public void verifyNews()
	{
		bp.setText(dp.getNewsLetter(), email);
		dp.getSubmit().click();
		Assert.assertTrue(bp.elementFound(dp.getSubmit()),"Email not entered");
	}
	
	@Test
	public void verifyCount()
	{
		hp.getDressesTab().click();
		int total=dp.getTotalImage().size();
		String a = Integer.toString(total);
		String b = dp.getTotalProd().getText();
		Assert.assertTrue(b.contains(a),"Count doesn't match");
	}
	
}
