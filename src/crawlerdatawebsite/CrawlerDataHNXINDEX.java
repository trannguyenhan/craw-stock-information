package crawlerdatawebsite;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

/**
 *
 * @author admin
 */
public class CrawlerDataHNXINDEX extends CrawlerDataWebsite {

	public CrawlerDataHNXINDEX(String url) {
		super(url);
	}

	@Override
	public void getDocumentFromURL() throws IOException {
		doc = Jsoup.connect(url).get();

		Element eleTable = doc.getElementById("GirdTable");
		int i = 2;

		try {
			while (eleTable.getElementsByTag("tr").get(i) != null) {
				Element eleTR = eleTable.getElementsByTag("tr").get(i);

				String strDate = eleTR.getElementsByClass("Item_DateItem").text();
				String strFinalPrice = eleTR.getElementsByClass("Item_Price1").get(0).text();
				String strChange = eleTR.getElementsByClass("Item_ChangePrice").text();
				String strKLAuction = eleTR.getElementsByClass("Item_Price1").get(1).text();
				String strGTAuction = eleTR.getElementsByClass("Item_Price1").get(2).text();
				String strKLDeal = eleTR.getElementsByClass("Item_Price1").get(3).text();
				String strGTDeal = eleTR.getElementsByClass("LastItem_Price").text();
				// String strOpenPrice = eleTR.getElementsByClass("Item_Price1").get(4).text();
				// HNX-INDEX haven't OpenPrice
				String strOpenPrice = "NULL";
				String strMaxPrice = eleTR.getElementsByClass("Item_Price1").get(4).text();
				String strMinPrice = eleTR.getElementsByClass("Item_Price1").get(5).text();

				DayTrading tempchiso = new DayTrading(strDate, strFinalPrice, strChange, strKLAuction, strGTAuction,
						strKLDeal, strGTDeal, strOpenPrice, strMaxPrice, strMinPrice);
				dschiso.add(tempchiso);
				i++;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
