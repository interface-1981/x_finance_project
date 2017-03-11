package product.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import product.entity.Trade.TradePK;

@Entity
public class Leg implements Serializable{


	private LegPK legPK;
	private String Currency;
	private String PayOrRec;
	private String FixOrFloat;
	private double Rate;
	private int PrincipalAmount;
	private String interestFrequency;
	private String AmortFrequency;
	private Trade trade;
	private List<Cashflow> cashflows;

	@Id
	public LegPK getLegPK() {

		return legPK;
	}

	public void setLegPK(LegPK legPK) {
		this.legPK = legPK;
	}

	public String getCurrency() {
		return Currency;
	}

	public void setCurrency(String currency) {
		Currency = currency;
	}

	public String getPayOrRec() {
		return PayOrRec;
	}

	public void setPayOrRec(String payOrRec) {
		PayOrRec = payOrRec;
	}

	public String getFixOrFloat() {
		return FixOrFloat;
	}

	public void setFixOrFloat(String fixOrFloat) {
		FixOrFloat = fixOrFloat;
	}

	public double getRate() {
		return Rate;
	}

	public void setRate(double rate) {
		Rate = rate;
	}

	public int getPrincipalAmount() {
		return PrincipalAmount;
	}

	public void setPrincipalAmount(int principalAmount) {
		PrincipalAmount = principalAmount;
	}



	public String getInterestFrequency() {
		return interestFrequency;
	}

	public void setInterestFrequency(String interestFrequency) {
		this.interestFrequency = interestFrequency;
	}

	public String getAmortFrequency() {
		return AmortFrequency;
	}

	public void setAmortFrequency(String amortFrequency) {
		AmortFrequency = amortFrequency;
	}

	@ManyToOne
    @JoinColumns( {
        @JoinColumn(name = "tradeid", referencedColumnName = "tradeid", insertable = false, updatable = false),
        @JoinColumn(name = "versionnumber", referencedColumnName = "versionnumber", insertable = false, updatable = false)

    })
	public Trade getTrade() {
		return trade;
	}

	public void setTrade(Trade trade) {
		this.trade = trade;
	}

	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="leg")
	public List<Cashflow> getCashflows() {
		return cashflows;
	}
	public void setCashflows(List<Cashflow> cashflows) {
		this.cashflows = cashflows;
	}
	@Embeddable
	public static class LegPK implements Serializable{

		private Trade.TradePK tradePK;
		private int LegNumber;


		public LegPK(TradePK tradePK, int legNumber) {
			super();
			this.tradePK = tradePK;
			LegNumber = legNumber;
		}


		public LegPK() {

		}


		public Trade.TradePK getTradePK() {
			return tradePK;
		}


		public void setTradePK(Trade.TradePK tradePK) {
			this.tradePK = tradePK;
		}


		public int getLegNumber() {
			return LegNumber;
		}


		public void setLegNumber(int legNumber) {
			LegNumber = legNumber;
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + LegNumber;
			result = prime * result + ((tradePK == null) ? 0 : tradePK.hashCode());
			return result;
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			LegPK other = (LegPK) obj;
			if (LegNumber != other.LegNumber)
				return false;
			if (tradePK == null) {
				if (other.tradePK != null)
					return false;
			} else if (!tradePK.equals(other.tradePK))
				return false;
			return true;
		}


		@Override
		public String toString() {
			return "LegPK [tradePK=" + tradePK + ", LegNumber=" + LegNumber + "]";
		}

	}

	@Override
	public String toString() {
		return "Leg [legPK=" + legPK + ", Currency=" + Currency + ", PayOrRec=" + PayOrRec + ", FixOrFloat="
				+ FixOrFloat + ", Rate=" + Rate + ", PrincipalAmount=" + PrincipalAmount + ", integererestFrequency="
				+ interestFrequency + ", AmortFrequency=" + AmortFrequency + "]";
	}


}
