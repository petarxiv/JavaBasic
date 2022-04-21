package class24;

public class Browser {
    void openBrowser(){
        System.out.println("Opening the browser");
    }
    void loadPage(String URL){
        System.out.println("loading the website"+URL);
    }
    void testThePage(){
        System.out.println("Testing the page");
    }
    void closePage(){
        System.out.println("Closing the browser");
    }
}
class GoogleChrome extends Browser{
    void openBrowser(){
        System.out.println("Opening the GoogleChrome browser");
    }
    void loadPage(String URL){
        System.out.println("loading the website"+URL+" in GoogleChrome");
    }
    void testThePage(){
        System.out.println("Testing the page in GoogleChrome");
    }
    void closePage(){
        System.out.println("Closing the GoogleChrome browser");
    }
     //shortcut to find and replace is command + R
}
class Firefox extends Browser{
    void openBrowser(){
        System.out.println("Opening the FireFox browser");
    }
    void loadPage(String URL){
        System.out.println("loading the website"+URL+" in FireFox");
    }
    void testThePage(){
        System.out.println("Testing the page in FireFox");
    }
    void closePage(){
        System.out.println("Closing the FireFox browser");
    }

}

class Safari extends Browser{
    void openBrowser(){
        System.out.println("Opening the Safari browser");
    }
    void loadPage(String URL){
        System.out.println("loading the website"+URL+" in Safari");
    }
    void testThePage(){
        System.out.println("Testing the page in Safari");
    }
    void closePage(){
        System.out.println("Closing the Safari browser");
    }

}
class IE extends Browser{
    void openBrowser(){
        System.out.println("Opening the IE browser");
    }
    void loadPage(String URL){
        System.out.println("loading the website"+URL+" in IE");
    }
    void testThePage(){
        System.out.println("Testing the page in IE");
    }
    void closePage(){
        System.out.println("Closing the IE browser");
    }

}