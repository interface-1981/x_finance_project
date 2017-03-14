package finance.product.dto;

import java.util.Date;

public class TradeSummery {

	private int TradeID;
	private String Product;
	private Date StartDate;
	private Date MaturityDate;
	private Date ExpiryDate;
	private String CounterpartyID;

	private String leg1Currency;
	private String leg1PayOrRec;
	private String leg1FixOrFloat;
	private double leg1Rate;
	private int leg1PrincipalAmount;
	private String leg1InterestFrequency;
	private String leg1AmortFrequency;

	private String leg2Currency;
	private String leg2PayOrRec;
	private String leg2FixOrFloat;
	private double leg2Rate;
	private int leg2PrincipalAmount;
	private String leg2InterestFrequency;
	private String leg2AmortFrequency;

	private String Status;
	private Date AuditTimeStamp;
	public int getTradeID() {
		return TradeID;
	}
	public void setTradeID(int tradeID) {
		TradeID = tradeID;
	}
	public String getProduct() {
		return Product;
	}
	public void setProduct(String product) {
		Product = product;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public Date getMaturityDate() {
		return MaturityDate;
	}
	public void setMaturityDate(Date maturityDate) {
		MaturityDate = maturityDate;
	}
	public Date getExpiryDate() {
		return ExpiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		ExpiryDate = expiryDate;
	}
	public String getCounterpartyID() {
		return CounterpartyID;
	}
	public void setCounterpartyID(String counterpartyID) {
		CounterpartyID = counterpartyID;
	}
	public String getLeg1Currency() {
		return leg1Currency;
	}
	public void setLeg1Currency(String leg1Currency) {
		this.leg1Currency = leg1Currency;
	}
	public String getLeg1PayOrRec() {
		return leg1PayOrRec;
	}
	public void setLeg1PayOrRec(String leg1PayOrRec) {
		this.leg1PayOrRec = leg1PayOrRec;
	}
	public String getLeg1FixOrFloat() {
		return leg1FixOrFloat;
	}
	public void setLeg1FixOrFloat(String leg1FixOrFloat) {
		this.leg1FixOrFloat = leg1FixOrFloat;
	}
	public double getLeg1Rate() {
		return leg1Rate;
	}
	public void setLeg1Rate(double leg1Rate) {
		this.leg1Rate = leg1Rate;
	}
	public int getLeg1PrincipalAmount() {
		return leg1PrincipalAmount;
	}
	public void setLeg1PrincipalAmount(int leg1PrincipalAmount) {
		this.leg1PrincipalAmount = leg1PrincipalAmount;
	}
	public String getLeg1InterestFrequency() {
		return leg1InterestFrequency;
	}
	public void setLeg1InterestFrequency(String leg1InterestFrequency) {
		this.leg1InterestFrequency = leg1InterestFrequency;
	}
	public String getLeg1AmortFrequency() {
		return leg1AmortFrequency;
	}
	public void setLeg1AmortFrequency(String leg1AmortFrequency) {
		this.leg1AmortFrequency = leg1AmortFrequency;
	}
	public String getLeg2Currency() {
		return leg2Currency;
	}
	public void setLeg2Currency(String leg2Currency) {
		this.leg2Currency = leg2Currency;
	}
	public String getLeg2PayOrRec() {
		return leg2PayOrRec;
	}
	public void setLeg2PayOrRec(String leg2PayOrRec) {
		this.leg2PayOrRec = leg2PayOrRec;
	}
	public String getLeg2FixOrFloat() {
		return leg2FixOrFloat;
	}
	public void setLeg2FixOrFloat(String leg2FixOrFloat) {
		this.leg2FixOrFloat = leg2FixOrFloat;
	}
	public double getLeg2Rate() {
		return leg2Rate;
	}
	public void setLeg2Rate(double leg2Rate) {
		this.leg2Rate = leg2Rate;
	}
	public int getLeg2PrincipalAmount() {
		return leg2PrincipalAmount;
	}
	public void setLeg2PrincipalAmount(int leg2PrincipalAmount) {
		this.leg2PrincipalAmount = leg2PrincipalAmount;
	}
	public String getLeg2InterestFrequency() {
		return leg2InterestFrequency;
	}
	public void setLeg2InterestFrequency(String leg2InterestFrequency) {
		this.leg2InterestFrequency = leg2InterestFrequency;
	}
	public String getLeg2AmortFrequency() {
		return leg2AmortFrequency;
	}
	public void setLeg2AmortFrequency(String leg2AmortFrequency) {
		this.leg2AmortFrequency = leg2AmortFrequency;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Date getAuditTimeStamp() {
		return AuditTimeStamp;
	}
	public void setAuditTimeStamp(Date auditTimeStamp) {
		AuditTimeStamp = auditTimeStamp;
	}


}
