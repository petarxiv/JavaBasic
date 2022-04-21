package class24;

public class BrowserTester {
    public static void main(String[] args) {
       /*
        GoogleChrome chrome=new GoogleChrome();
        chrome.openBrowser();
        chrome.loadPage("www.google.com");
        chrome.testThePage();
        chrome.closePage();

        Firefox fireFox=new Firefox();
        fireFox.openBrowser();
        fireFox.loadPage("www.google.com");
        fireFox.testThePage();
        fireFox.closePage();

        Safari safari=new Safari();
        safari.openBrowser();
        safari.loadPage("www.google.com");
        safari.testThePage();
        safari.closePage();

        IE ie=new IE();
        ie.openBrowser();
        ie.loadPage("www.google.com");
        ie.testThePage();
        ie.closePage();
        */

        Browser [] browsers={new GoogleChrome(), new Firefox(),new Safari(), new IE()};

        for(Browser b:browsers){
            b.openBrowser();
            b.loadPage("www.google.com");
            b.testThePage();
            b.closePage();
        }

    }
}
