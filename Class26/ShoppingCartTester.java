package Class26;


//import Class25.WebDriver;

public class ShoppingCartTester {
    public static void main(String[] args) {
        ShoppingCart shoppingCart=new ShoppingCart();
       // shoppingCart.OriginalPrice=100;
      //  shoppingCart.discount=.20;
        System.out.println(shoppingCart.getDiscount());
        shoppingCart.calculatePrice();

       // WebDriver webDriver=new ChromeDriver();
      //  webDriver.get("www.google.com");
    }
}
