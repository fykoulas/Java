package Spyros;
/**
 * Με βάση τα 3-engines του Saber ψάχνουμε για εταιρίες με μειούμενο rate of shares outstanding (Engine No3).
 */

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Scrape {
    public static void main(String[] args) {
        // URL of the webpage to scrape
        String url = "https://www.macrotrends.net/stocks/charts/OXY/occidental-petroleum/shares-outstanding";

        try {
            // Fetch the HTML document
            Document doc = Jsoup.connect(url).get();

            // Select the table with shares outstanding data
            Element table = doc.selectFirst("table");
            if (table != null) {
                // Extract rows of the table
                Elements rows = table.select("tr");
                for (Element row : rows) {
                    // Extract columns of the row
                    Elements cols = row.select("td");
                    for (Element col : cols) {
                        System.out.print(col.text() + "\t");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Table not found on the webpage!");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while connecting to the webpage: " + e.getMessage());
        }
    }
}
