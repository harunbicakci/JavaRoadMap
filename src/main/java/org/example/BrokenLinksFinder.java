package org.example;

import java.net.HttpURLConnection;
import java.net.URL;

public class BrokenLinksFinder {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

        // This is VALID METHOD

        // Get all anchor tags
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links: " + links.size());

        for(WebElement link : links){

            String url = link.getAttribute("href");
            if(url == null || url.isEmpty()){
                System.out.println("URL is eighter not configurated for anchor tag or is empty");
                continue;
            }
            try{
                URL linkUrl = new URL(url);
                HttpURLConnection httpConn = (HttpURLConnection) linkUrl.openConnection();
                httpConn.setConnectTimeout(3000);
                httpConn.connect();
                int responseCode = httpConn.getResponseCode();
                if( responseCode >= 400){
                    System.out.println(url + " is a broken link. Response Code: " + responseCode);
                }else{
                    System.out.println(url + " is a valid link. Response Code: " + responseCode);
                }
            } catch(Exception e){
                System.out.println("Exception occured for URL: " + url + " - " + e.getMessage());
            } finally {
                driver.quit();
            }
        }
    }
}
