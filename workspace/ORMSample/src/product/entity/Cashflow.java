package product.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

import product.entity.Leg.LegPK;

@Entity
public class Cashflow implements Serializable {

	public  enum CashflowTypes {
		Principal,
		FloatInterest,
		FixedInterest
	}

	private CashflowPK cashflowPK;
	private String CashflowType;
	private Date PayDate;
	private int PayAmount;
	private int PrincipalAmount;
	private Leg leg;

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

