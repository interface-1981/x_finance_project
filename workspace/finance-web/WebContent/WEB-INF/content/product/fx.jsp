<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<s:form cssClass="form-horizontal" action="/fx/regist">
  <div class="form-group">
    <div class="col-sm-10">
      <div  class="col-sm-12" >
        <div class="col-sm-12" style="border-bottom : solid 1px #bbbbbb; margin-bottom: 15px;">
            <label class="control-label">TradeID:</label>
            <label class="control-label">
              <s:property value="%{zeroToBlank(tradeID)}"/>
              <s:hidden property="tradeID" name="tradeID"/>
            </label>
        </div>
      </div>
      <div class="col-sm-6" >
        <div class="col-sm-4">
          <label class="control-label">Counterparty:</label>
        </div>
        <div class="col-sm-8">
          <s:textfield name="counterpartyID" cssClass="form-control" />
        </div>
        <div class="col-sm-4">
          <label class="control-label">EffectiveDate:</label>
        </div>
        <div class="col-sm-8">
          <div class="input-group date" data-date="%{effectiveDate}"  data-date-format="yyyy/mm/dd">
            <s:textfield name="effectiveDate" cssClass="form-control date-form" value="%{toString(effectiveDate)}"/>
            <span class="input-group-addon"><span class="add-on glyphicon glyphicon-th"></span></span>
          </div>
        </div>
      </div>
      <div class="col-sm-6" >
      </div>
    </div>
    <div class="col-sm-10" >
      <div class="col-sm-6">
        <div class="col-sm-12"  style="border-bottom : solid 1px #bbbbbb; margin-bottom: 15px;">
          <label class="control-label" ><h5 style="color: Red;">Buy-Side</h5></label>
        </div>
        <div class="col-sm-4">
          <label class="control-label">Currency:</label>
        </div>
        <div class="col-sm-8">
          <s:select name="buyCurrency" list="currencyList"   cssClass="form-control"/>
        </div>
        <div class="col-sm-4">
          <label class="control-label">Amount:</label>
        </div>
        <div class="col-sm-8">
          <s:textfield name="buyAmount"  cssClass="form-control"/>
        </div>
      </div>
      <div class="col-sm-6">
        <div class="col-sm-12"  style="border-bottom : solid 1px #bbbbbb; margin-bottom: 15px;">
          <label class="control-label" ><h5 style="color: Red;">Sell-Side</h5></label>
        </div>
        <div class="col-sm-4">
          <label class="control-label">Currency:</label>
        </div>
        <div class="col-sm-8">
          <s:select name="sellCurrency" list="currencyList" cssClass="form-control"/>
        </div>
        <div class="col-sm-4">
          <label class="control-label">Amount:</label>
        </div>
        <div class="col-sm-8">
          <s:textfield name="sellAmount"  cssClass="form-control"/>
        </div>
      </div>
    </div>
    <div class="col-sm-10">
      <div class="col-sm-12">
        <div class="col-sm-12"  style="border-top : solid 1px #bbbbbb; padding-top: 15px; margin-top: 15px;">
          <s:submit value="Save" cssClass="btn btn-primary"/>
        </div>
      </div>
    </div>
  </div>
</s:form>
