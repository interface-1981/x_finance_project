package product.dto;

import java.util.Date;

import product.common.CommonConstants;

public class TradeSummeryFilter {

	private Date startDateFrom;
	private Date startDateTo;

	private Date expiryDateFrom;
	private Date expiryDateTo;

	private String product;

	private String status;

	public Date getStartDateFrom() {
		return startDateFrom;
	}

	public Date getCriteriaStartDateFrom() {
		if (startDateFrom == null) {
			return CommonConstants.MIN_DATE;
		}
		return startDateFrom;
	}

	public void setStartDateFrom(Date startDateFrom) {
		this.startDateFrom = startDateFrom;
	}

	public Date getStartDateTo() {
		return startDateTo;
	}

	public Date getCriteriaStartDateTo() {
		if (startDateTo == null) {
			return CommonConstants.MAX_DATE;
		}
		return startDateTo;
	}

	public void setStartDateTo(Date startDateTo) {
		this.startDateTo = startDateTo;
	}

	public Date getExpiryDateFrom() {
		return expiryDateFrom;
	}

	public Date getCriteriaExpiryDateFrom() {
		if (expiryDateFrom == null) {
			return CommonConstants.MIN_DATE;
		}
		return expiryDateFrom;
	}

	public void setExpiryDateFrom(Date expiryDateFrom) {
		this.expiryDateFrom = expiryDateFrom;
	}

	public Date getCriteriaExpiryDateTo() {
		if (expiryDateTo == null) {
			return CommonConstants.MAX_DATE;
		}
		return expiryDateTo;
	}

	public Date getExpiryDateTo() {
		return expiryDateTo;
	}

	public void setExpiryDateTo(Date expiryDateTo) {
		this.expiryDateTo = expiryDateTo;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}



}
