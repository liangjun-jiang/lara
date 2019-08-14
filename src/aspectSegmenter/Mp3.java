package aspectSegmenter;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Vector;

/**
[id]:0
[productId]:0
[standardName]:
[productName]:Rio PMP 300 MP3 Player
[title]:Next Millenium Consumer Electronics
[author]:bernhardgroehl@otelo-online.de
[createDate]:Mon Jun 14 00:00:00 CST 1999
[summary]:
[fullText]:Diamond's RIO is the current, silicon-state nightmare for monopolistic entertainment industries. When the first audio recording-devices entered the consumer market decades ago, the idea of a controlled  &quot;charge-per-copy&quot; business model in the music industry was  doomed. Although traditional copyrights could never be totally enforced,  the record and music-producing industry neglected these threads existing in  the shades of multi-billion profits.<p>Mp3 and the Internet raided the  existing markets with their &quot;natural&quot; power like a cruise-missile  against a frying-pan.  Like other good examples for  &quot;Killer-Apps&quot;, the RIO is designed to Web-Specs (mp3). This makes  its use and performance comparable with other CD-quality playing devices  while putting the power of the internet into the palm of your hand. If you  want to make a statement of &quot;being digital&quot;, the RIO is a must!  
[rating]:5.0
[recommend]:0
[paid]:0.0
[helpfulNum]:0
[totalNum]:0
[commentNum]:0
[webHome]:http://www.amazon.com
[webUrl]:http://www.amazon.com/review/product/B00000JBAT/ref=cm_cr_dp_all_summary/002-2313684-7157658?%5Fencoding=UTF8&showViewpoints=1&sortBy=bySubmissionDateAscending
[htmlPath]:F:\amazon_mp3\1/1
[textPath]:
**/

public class Mp3 implements Comparable<Mp3>, Serializable{
	
	private static final long serialVersionUID = -5695057513648909065L;
	public String m_id;
	public double m_rating;
	public String m_name;
	
	public List<Review> m_reviews;
	public double m_rScore;
	public int m_index;
	DecimalFormat m_formater;
	
	public Mp3(String ID, String name, double rating, int price, String URL){
		m_ID = ID;
		m_name = name;
		m_rating = rating;
		m_price = price;
		m_URL = URL;
		
		m_reviews = null;
		
		m_formater = new DecimalFormat("#.#");
	}
	
	public Mp3(String ID){
		m_ID = ID;
		m_name = null;
		m_URL = null;
		m_imageURL = null;
		m_price = 0;
		m_price_range = null;
		
		m_reviews = new Vector<Review>();
		m_formater = new DecimalFormat("#.#");
	}
	
	public int getReviewSize(){
		return m_reviews==null?0:m_reviews.size();
	}
	
	@Override
	public int compareTo(Mp3 h) {
		if (this.m_rScore>h.m_rScore)
			return -1;
		else if (this.m_rScore<h.m_rScore)
			return 1;
		else 
			return 0;
	}
	
	public String toString(){
		return "";
//		return m_ID + "\n" + m_name + "\n" + m_rating + "\n" + (m_price_range==null||m_price_range.isEmpty()?m_price:m_price_range) + "\n" + m_URL + "\n";
	}
	
	public String toPrintString(){
		StringBuffer buffer = new StringBuffer(512);
//		buffer.append("<Hotel Name>"+m_name+"\n");
//		buffer.append("<Hotel Address>"+m_address+"\n");
//		buffer.append("<Overall Rating>"+m_rating+"\n");
//		buffer.append("<Avg. Price>"+m_price_range+"\n");
//		buffer.append("<URL>"+m_URL+"\n");
//		buffer.append("<Image URL>"+m_imageURL+"\n");		
		return buffer.toString();
	}		
		
	public void addReview(Review r){
		if (m_reviews==null)
			m_reviews = new Vector<Review>();
		m_reviews.add(r);
	}

}
