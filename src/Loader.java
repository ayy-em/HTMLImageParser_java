import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Loader {
    
    public static void main(String[] args) throws IOException {
    
        String path = "res/page.html";
        Document doc = Jsoup.parse(new File(path),"UTF-8");
        Elements elements = doc.select("img");
        System.out.println("\n  Images used on this webpage:\n");
        System.out.println("-----------------------------------------------------------------");
        int m = 0;
        for (Element element : elements) {
            m++;
            String imageSource = element.toString().substring(element.toString().indexOf("https:"));
            System.out.println("№ " + m + " :\t" + imageSource.substring(0,imageSource.indexOf("\"")));
        }
        System.out.println("-----------------------------------------------------------------");
    }
}
