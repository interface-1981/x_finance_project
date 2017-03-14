package finance.product.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

import finance.product.entity.Cashflow.CashflowPK;

@Entity
public class Reset implements Serializable {

	private ResetPK resetPK;
	private Date RateFixDate;
	private Date StartDate;
	private Date EndDate;
	private Double ContractRate;
	private Double Spread;
	private int notionalPrincipal;

	private Cashflow cashflow;

	public Reset() {

	}


	@Id
	public ResetPK getResetPK() {
		return resetPK;
	}

	public void setResetPK(ResetPK resetPK) {
		this.resetPK = resetPK;
	}

	public Date getRateFixDate() {
		return RateFixDate;
	}

	public void setRateFixDate(Date rateFixDate) {
		RateFixDate = rateFixDate;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}

	public Double getContractRate() {
		return ContractRate;
	}

	public void setContractRate(Double contractRate) {
		ContractRate = contractRate;
	}

	public Double getSpread() {
		return Spread;
	}

	public void setSpread(Double spread) {
		Spread = spread;
	}

	public int getNotionalPrincipal() {
		return notionalPrincipal;
	}


	public void setNotionalPrincipal(int notionalPrincipal) {
		this.notionalPrincipal = notionalPrincipal;
	}


	@ManyToOne
    @JoinColumns( {
        @JoinColumn(name = "tradeid", referencedColumnName = "tradeid", insertable = false, updatable = false),
        @JoinColumn(name = "versionnumber", referencedColumnName = "versionnumber", insertable = false, updatable = false),
        @JoinColumn(name = "legnumber", referencedColumnName = "legnumber", insertable = false, updatable = false),
        @JoinColumn(name = "cashflownumber", referencedColumnName = "cashflownumber", insertable = false, updatable = false)

    })
	public Cashflow getCashflow() {
		return cashflow;
	}

	public void setCashflow(Cashflow cashflow) {
		this.cashflow = cashflow;
	}

	@Embeddable
	public static class ResetPK implements Serializable{

		private CashflowPK cashflowPK;
		private int ResetNumber;

		public ResetPK() {
			super();
			// TODO 自動生成されたコンストラクター・スタブ
		}

		public ResetPK(CashflowPK cashflowPK, int resetNumber) {
			super();
			this.ResetNumber = resetNumber;
			this.cashflowPK = cashflowPK;
		}

		public CashflowPK getCrashflowPK() {
			return cashflowPK;
		}
		public void setCrashflowPK(CashflowPK cashflowPK) {
			this.cashflowPK = cashflowPK;
		}
		public int getResetNumber() {
			return ResetNumber;
		}
		public void setResetNumber(int resetNumber) {
			ResetNumber = resetNumber;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ResetNumber;
			result = prime * result + ((cashflowPK == null) ? 0 : cashflowPK.hashCode());
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
			ResetPK other = (ResetPK) obj;
			if (ResetNumber != other.ResetNumber)
				return false;
			if (cashflowPK == null) {
				if (other.cashflowPK != null)
					return false;
			} else if (!cashflowPK.equals(other.cashflowPK))
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "ResetPK [crashflowPK=" + cashflowPK + ", ResetNumber=" + ResetNumber + "]";
		}
	}
}

