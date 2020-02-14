package pageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressPageObjects extends BasePage{

	@FindBy(xpath="//a[text()='S']")
	private WebElement SizeS;
	
	public WebElement getSizeS()
	{
		return SizeS;
	}
	
	@FindBy(xpath="//a[text()='M']")
	private WebElement SizeM;
	
	public WebElement getSizeM()
	{
		return SizeS;
	}
	
	@FindBy(xpath="//a[text()='L']")
	private WebElement SizeL;
	
	public WebElement getSizeL()
	{
		return SizeS;
	}
	
	@FindBy(xpath="//input[@id='newsletter-input']")
	private WebElement Newsletter;
	
	public WebElement getNewsLetter()
	{
		return Newsletter;
	}
	
	@FindBy(xpath="//button[@type='submit' and @name='submitNewsletter']")
	private WebElement Submitbtn;
	
	public WebElement getSubmit()
	{
		return Submitbtn;
	}
	
	@FindBy(xpath="//p[@class='alert alert-success']")
	private WebElement Alert;
	
	public WebElement getAlert()
	{
		return Alert;
	}
	
	@FindBy(xpath="(//a[@title='View'])[1]")
	private WebElement MoreButton;
	
	public WebElement getMoreButton()
	{
		return MoreButton;
	}
	
	@FindBy(xpath="//button[@class='btn btn-default btn-twitter']")
	private WebElement TweetShare;
	
	public WebElement getTweet()
	{
		return MoreButton;
	}
	
	@FindBy(xpath="//div[@id='short_description_content']")
	private WebElement ProductDescription;
	
	public WebElement getProductDes() 
	{
		return ProductDescription;
	}
	
	@FindBy(xpath="//span[@class='heading-counter']")
	private WebElement TotalProducts;
	
	public WebElement  getTotalProd()
	{
		return TotalProducts;
	}
	
	@FindBy(xpath="//a[@class='product_img_link']")
	private List<WebElement> TotalImage;
	
	public List<WebElement> getTotalImage()
	{
		return TotalImage;
	}
	
	public DressPageObjects()
	{
		PageFactory.initElements(driver,this);
	}
	
}
