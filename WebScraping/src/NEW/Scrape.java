package NEW;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Scrape {
	public static void main(String[] args) {
		
	
	try{
	Document doc=Jsoup.connect("https://www.thehindu.com/archive/").userAgent("Mozilla/17.0").get();
	Elements temp=doc.select("div.archiveBorder");
	
	int i=0;
	for(Element abc:temp)
	{
		i++;
		System.out.println(i+" "+ abc.getElementsByClass("archiveBorder").first().text());
	}
    
	
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
	}
}
