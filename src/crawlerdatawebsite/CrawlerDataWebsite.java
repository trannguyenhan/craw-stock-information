package crawlerdatawebsite;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.nodes.Document;

/**
 *
 * @author admin
 */
public abstract class CrawlerDataWebsite {
	public Document doc;
	protected String url;
	public List<DayTrading> dschiso = new ArrayList<>();
	public List<DayTradingStockCode> dayTradingStockCode = new ArrayList<>();  

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public CrawlerDataWebsite() {
		// default url is VNINDEX
		setUrl("https://s.cafef.vn/Lich-su-giao-dich-VNINDEX-1.chn");
	}
	
	public CrawlerDataWebsite(String url) {
		setUrl(url);
	}

	public abstract void getDocumentFromURL() throws IOException;
}
