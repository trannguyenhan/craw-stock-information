package crawlerdatawebsite;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

/**
 *
 * @author admin
 */
public class CrawlerDataHOSE extends CrawlerDataWebsite {

	public CrawlerDataHOSE(String url) {
		super(url);
	}

	@Override
	public void getDocumentFromURL() throws IOException {
		doc = Jsoup.connect(url).get();

		Element eleTable = doc.getElementById("table2sort");
		int i = 1;

		try {
			while (eleTable.getElementsByTag("tr").get(i) != null) {
				Element eleTR = eleTable.getElementsByTag("tr").get(i);

				String strStockCode = eleTR.getElementsByClass("Item_DateItem_lsg").text();
				String strFinalPrice = eleTR.getElementsByClass("Item_Price1").get(0).text();
				String strChange = eleTR.getElementsByClass("Item_ChangePrice_lsg").text();
				String strReferencePrice = eleTR.getElementsByClass("Item_Price1").get(2).text();
				String strOpenPrice = eleTR.getElementsByClass("Item_Price1").get(3).text();
				String strMaxPrice = eleTR.getElementsByClass("Item_Price1").get(4).text();
				String strMinPrice = eleTR.getElementsByClass("Item_Price1").get(5).text();
				String strKL_auction = eleTR.getElementsByClass("Item_Price1").get(6).text();
				String strGT_auction = eleTR.getElementsByClass("Item_Price1").get(7).text();
				String strKL_Deal = eleTR.getElementsByClass("Item_Price1").get(8).text();
				String strGT_Deal = eleTR.getElementsByClass("Item_Price1").get(9).text();

				System.out.println(strStockCode + "+" + strKL_Deal);
				DayTradingStockCode tempchiso = new DayTradingStockCode(strStockCode, strFinalPrice, strChange,
						strReferencePrice, strOpenPrice, strMaxPrice, strMinPrice, strGT_auction, strKL_auction,
						strKL_Deal, strGT_Deal);
				dayTradingStockCode.add(tempchiso);
				i++;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
