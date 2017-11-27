
/**
 * 
 * @author student
 *
 */
public class PortfolioHolding {
	
	private String ticker;
	private double pricePerShare;
	private double shares;
	private double initialPricePerShare;
	
	public PortfolioHolding(String stock, double initialSharePrice, double sharesBought) {
		ticker = stock;
		pricePerShare = initialSharePrice;
		initialPricePerShare = initialSharePrice;
		shares = sharesBought;
	}
	
	public double getInitialCost() {
		return initialPricePerShare * shares;
	}
	
	public double getInitialPricePerShare() {
		return initialPricePerShare;
	}

	public double getPricePerShare() {
		return pricePerShare;
	}

	public double getShares() {
		return shares;
	}

	public String getTicker() {
		return ticker;
	}
	
	public double getProfit() {
		return (getPricePerShare() - getInitialPricePerShare()) * getShares();
	}

	/**
	 * 
	 * @return gross revenue on the sale
	 */
	public double sell() {
		double proceeds = pricePerShare * shares;
		shares = 0;
		return proceeds;
	}

	public void setPricePerShare(double pricePerShare) {
		this.pricePerShare = pricePerShare;
	}
	
	public String toString() {
		return "Stock " + ticker + " shares: " + shares + " per Share: " + pricePerShare;
	}

}
