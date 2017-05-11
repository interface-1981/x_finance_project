<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<script type="text/javascript" src="js/flot/jquery.flot.js"></script>
<script type="text/javascript">

function viewGraph(){

	 $.post(
		'./yieldcurvegraph',
		$('#yieldcurve-form').serializeArray(),
		function(json){

			//alert(json);
			var plot = $.plot($("#placeholder"),[json]);
		},
		'json'
	 );
}


$( document ).ready(function() {
	viewGraph();
});
</script>
<s:form id="yieldcurve-form" cssClass="form-horizontal" action="/yieldcurve/regist">
  <div class="form-group">
    <div class="col-sm-12">
      <div class="col-sm-12">
        <div class="col-sm-2">
          <label class="control-label">AsOfDate:</label>
          <div class="input-group date" data-date="%{asOfDate}"  data-date-format="yyyy/mm/dd">
            <s:textfield name="asOfDate" cssClass="form-control date-form" value="%{toString(asOfDate)}"/>
            <span class="input-group-addon"><span class="add-on glyphicon glyphicon-th"></span></span>
          </div>
        </div>
        <div class="col-sm-2">
          <label class="control-label">Market:</label>
          <s:textfield name="marketID" cssClass="form-control" />
        </div>

        <div class="col-sm-2">
          <label class="control-label">Interporation:</label>
          <s:select name="interpolateMethod" list="interpolateMethodList"   cssClass="form-control" onchange="viewGraph()"/>
        </div>
      </div>
    </div>
    <div class="col-sm-12">
      <div class="col-sm-12">
        <div class="col-sm-12"  style="border-bottom : solid 1px #bbbbbb; margin-bottom: 15px;">
          <label class="control-label" ><h5 style="color: Red;">Graph</h5></label>
        </div>
        <div class="col-sm-12">
          <div id="placeholder" style="width:1200px;height:300px;"></div>
        </div>
      </div>
    </div>
    <div class="col-sm-12">
      <div class="col-sm-12">
        <div class="col-sm-12"  style="border-top : solid 1px #bbbbbb; padding-top: 15px; margin-top: 15px;">
          <s:submit value="Save" cssClass="btn btn-primary"/>
          <input type="button" value="MarketRateInput" class="btn btn-primary " data-toggle="modal" data-target="#rateInputModal"/>
        </div>
      </div>
    </div>
  </div>
    <div class="modal fade" id="rateInputModal" >
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal"><span>×</span></button>
            <h4 class="modal-title">Market Rate</h4>
          </div>
          <div class="modal-body">
            <s:iterator value="inputGridPointList" status="term" >
              <div class="form-group">
              <div class="col-sm-12">
                <div class="col-sm-3"></div>
                <div class="col-sm-1">
                  <label class="control-label"><s:property value="term" />:</label>
                  <s:hidden name="inputGridPointList[%{#term.index}].term" />
                </div>
                <div class="col-sm-5">
                  <s:textfield name="inputGridPointList[%{#term.index}].rate" cssClass="form-control"/>
                </div>
                <div class="col-sm-3"></div>
              </div>
              </div>
            </s:iterator>
          </div>
          <div class="modal-footer">
            <input type="button" value="ViewGraph" class="btn btn-primary" onclick="viewGraph()" data-dismiss="modal"/>
          </div>
        </div>
      </div>
    </div>
</s:form>
