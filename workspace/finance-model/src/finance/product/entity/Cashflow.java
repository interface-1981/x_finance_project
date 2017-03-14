package finance.product.entity;

import java.io.Serializable;
import java.util.Date;
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

import finance.product.entity.Leg.LegPK;

@Entity
public class Cashflow implements Serializable {

	private CashflowPK cashflowPK;
	private String CashflowType;
	private Date PayDate;
	private int PayAmount;
	private int PrincipalAmount;
	private int amortAmount;
	private Leg leg;
	private List<Reset> resets;

	public Cashflow() {

	}

	@Id
	public CashflowPK getCashflowPK() {
		return cashflowPK;
	}

	public void setCashflowPK(CashflowPK cashflowPK) {
		this.cashflowPK = cashflowPK;
	}

	public String getCashflowType() {
		return CashflowType;
	}

	public void setCashflowType(String cashflowType) {
		CashflowType = cashflowType;
	}

	public Date getPayDate() {
		return PayDate;
	}

	public void setPayDate(Date payDate) {
		PayDate = payDate;
	}

	public int getPayAmount() {
		return PayAmount;
	}

	public void setPayAmount(int payAmount) {
		PayAmount = payAmount;
	}

	public int getPrincipalAmount() {
		return PrincipalAmount;
	}

	public void setPrincipalAmount(int principalAmount) {
		PrincipalAmount = principalAmount;
	}

	public int getAmortAmount() {
		return amortAmount;
	}

	public void setAmortAmount(int amortAmount) {
		this.amortAmount = amortAmount;
	}

	@ManyToOne
    @JoinColumns( {
        @JoinColumn(name = "tradeid", referencedColumnName = "tradeid", insertable = false, updatable = false),
        @JoinColumn(name = "versionnumber", referencedColumnName = "versionnumber", insertable = false, updatable = false),
        @JoinColumn(name = "legnumber", referencedColumnName = "legnumber", insertable = false, updatable = false)

    })
	public Leg getLeg() {
		return leg;
	}

	public void setLeg(Leg leg) {
		this.leg = leg;
	}

	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="cashflow")
	public List<Reset> getResets() {
		return resets;
	}
	public void setResets(List<Reset> resets) {
		this.resets = resets;
	}
	@Embeddable
	public static class CashflowPK implements Serializable{

		private LegPK legPK;
		private int CashflowNumber;


		public CashflowPK() {

		}


		public CashflowPK(LegPK legPK, int cashflowNumber) {
			super();
			this.legPK = legPK;
			CashflowNumber = cashflowNumber;
		}


		public LegPK getLegPK() {
			return legPK;
		}


		public void setLegPK(LegPK legPK) {
			this.legPK = legPK;
		}


		public int getCashflowNumber() {
			return CashflowNumber;
		}


		public void setCashflowNumber(int cashflowNumber) {
			CashflowNumber = cashflowNumber;
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + CashflowNumber;
			result = prime * result + ((legPK == null) ? 0 : legPK.hashCode());
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
			CashflowPK other = (CashflowPK) obj;
			if (CashflowNumber != other.CashflowNumber)
				return false;
			if (legPK == null) {
				if (other.legPK != null)
					return false;
			} else if (!legPK.equals(other.legPK))
				return false;
			return true;
		}


		@Override
		public String toString() {
			return "CashflowPK [legPK=" + legPK + ", CashflowNumber=" + CashflowNumber + "]";
		}


	}


	@Override
	public String toString() {
		return "Cashflow [legPK=" + cashflowPK + ", CashflowType=" + CashflowType + ", PayDate=" + PayDate + ", PayAmount="
				+ PayAmount + ", PrincipalAmount=" + PrincipalAmount + "]";
	}



}
