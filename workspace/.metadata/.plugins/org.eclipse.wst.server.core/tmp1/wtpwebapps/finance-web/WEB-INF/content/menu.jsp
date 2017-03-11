<%@taglib uri="/struts-tags" prefix="s"%>
  <div class="col-sm-12">
      <nav class="navbar navbar-default">
        <div class="container-fluid">
          <!--
          <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Project name</a>
          </div>
          -->
          <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
              <li style="border-left : solid 1px #bbbbbb;"><a href="<s:url value="/trade/summery"/>" >Search</a></li>
              <li style="border-left : solid 1px #bbbbbb;" class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Trade<span class="caret"></span></a>
                <ul class="dropdown-menu" role="menu">
                  <li><a href="<s:url value="/fx"/>" >FX</a></li>
                  <li><a href="<s:url value="/cash"/>" >Cash</a></li>
                  <!--
                  <li class="divider"></li>
                  <li class="dropdown-header">Nav header</li>
                  <li><a href="#">Separated link</a></li>
                  <li><a href="#">One more separated link</a></li>
                  -->
                </ul>
              </li>
                <li style="border-left : solid 1px #bbbbbb;" class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Issue<span class="caret"></span></a>
                <ul class="dropdown-menu" role="menu">
                  <li><a href="#" >Bond</a></li>
                  <li><a href="#" >Stock</a></li>
                  <li><a href="#" >Futures</a></li>
                </ul>
              </li>
              <li style="border-left : solid 1px #bbbbbb;" class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Code<span class="caret"></span></a>
                <ul class="dropdown-menu" role="menu">
                  <li><a href="#" >Currency</a></li>
                  <li><a href="#" >Market</a></li>
                  <li><a href="#" >Rate Index</a></li>
                  <li><a href="#" >Account</a></li>
                </ul>
              </li>
            </ul>
            <!--
            <ul class="nav navbar-nav navbar-right">
              <li class="active"><a href="./">Default <span class="sr-only">(current)</span></a></li>
              <li><a href="../navbar-static-top/">Static top</a></li>
              <li><a href="../navbar-fixed-top/">Fixed top</a></li>
            </ul>
            -->
          </div>
        </div>
      </nav>
  </div>