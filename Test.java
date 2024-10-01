public class Test {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://dev.flexifyme.com/");
	String str1=driver.getCurrentUrl();
	System.out.println(str1);
	driver.getTitle();
	System.out.println(driver.getTitle());
	
	driver.findElement(By.xpath("button[@class='btn bttn-primary")).click();
	

	}
	//button[@class='btn bttn-primary'][normalize-space()='Book Free Session']
}
