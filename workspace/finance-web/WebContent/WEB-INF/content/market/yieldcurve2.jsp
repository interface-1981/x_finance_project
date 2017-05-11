<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<script type="text/javascript" src="js/flot/jquery.js"></script>
<script type="text/javascript" src="js/flot/jquery.flot.js"></script>

<script type="text/javascript">

function viewGraph(){

	var modal = '#' + $('.modal-open-btn').attr('data-target');
    $(modal).fadeOut('slow');
    $('.modal-overlay').fadeOut('slow',function(){
        // オーバーレイを削除
        $('.modal-overlay').remove();
    });
	var data
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

$(function(){
    // 「.modal-open」をクリック
    $('.modal-open-btn').click(function(){

        // オーバーレイ用の要素を追加
        $('body').append('<div class="modal-overlay"></div>');
        // オーバーレイをフェードイン
        $('.modal-overlay').fadeIn('slow');

        // モーダルコンテンツのIDを取得
        var modal = '#' + $(this).attr('data-target');

         // モーダルコンテンツフェードイン
        $(modal).fadeIn('slow');

        // 「.modal-overlay」あるいは「.modal-close」をクリック
        $('.modal-overlay, .modal-close').off().click(function(){
            // モーダルコンテンツとオーバーレイをフェードアウト
            $(modal).fadeOut('slow');
            $('.modal-overlay').fadeOut('slow',function(){
                // オーバーレイを削除
                $('.modal-overlay').remove();
            });
        });

        // モーダルコンテンツの表示位置を設定
        modalResize();

        // モーダルコンテンツの表示位置を設定する関数
        function modalResize(){
            // ウィンドウの横幅、高さを取得
            var w = $(window).width();
            var h = $(window).height();

            // モーダルコンテンツの表示位置を取得
            var x = (w - $(modal).outerWidth(true)) / 2;
            var y = (h - $(modal).outerHeight(true)) / 2;

            // モーダルコンテンツの表示位置を設定
            $(modal).css({'left': x + 'px','top': y + 'px'});
        }

    });
});
$( document ).ready(function() {
	viewGraph();
});
</script>
<style>
.modal-content {
    position:fixed;
    display:none;
    z-index:2;
    max-height:90%;
    width:50%;
    border:2px solid #aaa;
    background:#fcfcfc;
    overflow:auto;
}

.modal-content p {
    margin:0;
    padding:0;
}

.modal-overlay {
    z-index:1;
    display:none;
    position:fixed;
    top:0;
    left:0;
    width:100%;
    height:100%;
    background-color:rgba(0,0,0,0.75);
}

.modal-open {
    color:#00f;
    text-decoration:underline;
}

.modal-open:hover {
    cursor:pointer;
    color:#f00;
}

.modal-close {
    color:#00f;
    text-decoration:underline;
}

.modal-close:hover {
    cursor:pointer;
    color:#f00;
}
</style>
<s:form id="yieldcurve-form" cssClass="form-horizontal" action="/yieldcurve/regist">
  <div class="form-group">
    <div id="con1" class="col-sm-12 modal-content">
            <div class="col-sm-12" align="right">
              <p><a class="modal-close">close</a></p>
            </div>
        <s:iterator value="inputGridPointList" status="term" >
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
        </s:iterator>
      <div class="col-sm-12" align="center">
        <input type="button" value="ViewGraph" class="btn btn-primary " onclick="viewGraph()"/>
      </div>
    </div>
    <div class="col-sm-12">
      <div class="col-sm-12">
        <div class="col-sm-3">
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
          <input type="button" value="ViewGraph" class="btn btn-primary modal-open-btn" data-target="con1"/>
        </div>
      </div>
    </div>
  </div>
</s:form>
