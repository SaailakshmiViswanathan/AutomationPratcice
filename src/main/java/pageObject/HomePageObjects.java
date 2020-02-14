package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends BasePage{
	
	@FindBy(xpath = "(//a[@title='Women'])[1]")
	private WebElement Women;
	
	public WebElement getWomenTab()
	{
		return Women;
	}
	
	@FindBy(xpath = "(//a[@title='Dresses'])[2]")
	private WebElement Dresses;
	
	public WebElement getDressesTab()
	{
		return Dresses;
	}
	
	@FindBy(xpath = "(//a[@title='T-shirts'])[2]")
	private WebElement TShirts;
	
	public WebElement getTshirtsTab()
	{
	 return TShirts;
	}
	
	@FindBy(xpath = "//span[@class='heading-counter']")
	private WebElement ResultCount;
	
	public WebElement getResultCount()
	{
		return ResultCount;
	}
	
	@FindBy(xpath ="(//div[@class='product-count'])[1]")
	private WebElement ProductCount;
	
	public WebElement getProductCount()
	{
		return ProductCount;
	}
	
	@FindBy(xpath="//img[@title='Faded Short Sleeve T-shirts']")
	private WebElement Image;
	
	public WebElement getImage()
	{
		return Image;
	}
	
	@FindBy(xpath="(//span[text()='Add to cart'])[1]")
	private WebElement AddtoCart;
	
	public WebElement getaddToCart()
	{
		return AddtoCart;
	}
	
	@FindBy(xpath="//span[@class='cross']")
	private WebElement ClosePopUp;
	
	public WebElement getclosePopUp()
	{
		return ClosePopUp;
	}
	
	@FindBy(xpath = "//a[@title='View my shopping cart']")
	private WebElement ViewCart;
	
	public WebElement getViewCart()
	{
		return ViewCart;
	}
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement CartQuantity;
	
	public WebElement getCartQuantity()
	{
		return CartQuantity;
	}
	
	public HomePageObjects()
	{
		PageFactory.initElements(driver,this);
	}
	
}
