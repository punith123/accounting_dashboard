<!DOCTYPE HTML>
<%@taglib uri="/struts-tags" prefix="s"%>
<style type="text/css">
.button {
	-moz-box-shadow:inset -10px 10px 50px -2px #ffffff;
	-webkit-box-shadow:inset -10px 10px 50px -2px #ffffff;
	box-shadow:inset -10px 10px 50px -2px #ffffff;
	background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #ededed), color-stop(1, #dfdfdf) );
	background:-moz-linear-gradient( center top, #ededed 5%, #dfdfdf 100% );
	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#ededed', endColorstr='#dfdfdf');
	background-color:#ededed;
	-webkit-border-top-left-radius:6px;
	-moz-border-radius-topleft:6px;
	border-top-left-radius:6px;
	-webkit-border-top-right-radius:6px;
	-moz-border-radius-topright:6px;
	border-top-right-radius:6px;
	-webkit-border-bottom-right-radius:6px;
	-moz-border-radius-bottomright:6px;
	border-bottom-right-radius:6px;
	-webkit-border-bottom-left-radius:6px;
	-moz-border-radius-bottomleft:6px;
	border-bottom-left-radius:6px;
	text-indent:0;
	border:1px solid #dcdcdc;
	display:inline-block;
	color:#777777;
	font-family:Comic Sans MS;
	font-size:15px;
	font-weight:bold;
	font-style:normal;
	height:50px;
	line-height:50px;
	width:200px;
	text-decoration:none;
	text-align:center;
	text-shadow:1px 1px 0px #ffffff;
}
.button:hover {
	background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #dfdfdf), color-stop(1, #ededed) );
	background:-moz-linear-gradient( center top, #dfdfdf 5%, #ededed 100% );
	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#dfdfdf', endColorstr='#ededed');
	background-color:#dfdfdf;
}.button:active {
	position:relative;
	top:1px;
}</style>
<div align="center">
	<br>
	<p></p>
	<p></p>
		<a  href="<s:url action="debtorDeliveredFUllBoard.action"/>">View total Delivered mismatch till date </a> &nbsp;&nbsp;<a  href="<s:url action="debtorRTOFUllBoard.action"/>">View total RTOed status mismatch till date </a> &nbsp;&nbsp;<a href="">View Payment advisor mismatch  </a>
	
	<table border="1" cellpadding="1" cellspacing="1" style="width: 500px;">
		<h3>
			<u>Debtor DashBoard </u>
		</h3>
		
		<caption>
			<u>Shipments Delivered and Approved via Gringotts&nbsp;</u>
				<br>
		<p></p>
		</caption>
	
		<tbody>
			<s:iterator value="db.deliveredMetrics" id="deliveredMetrics">
				<tr>
					<td>
						<p class="p1">
							<s:property value="#deliveredMetrics.Elementname" />
							&nbsp;
						</p>
					</td>
					<td><s:property value="#deliveredMetrics.value" />&nbsp;</td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
	<p class="p1">:&nbsp;</p>
	<p class="p1">&nbsp;</p>
	<table border="1" cellpadding="1" cellspacing="1" style="width: 500px;">
		<tbody>
			<u>Shipments RTO'ed and Cancelled via Gringotts&nbsp;</u>
				<br>
		<p></p>
			<s:iterator value="db.rtoedMetrics" id="rtoedMetrics">
				<tr>
					<td>
						<p class="p1">
							<s:property value="#rtoedMetrics.Elementname" />
							&nbsp;
						</p>
					</td>
					<td><s:property value="#rtoedMetrics.value" />&nbsp;</td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
		<hr>
	<p class="p1">&nbsp;</p>
	<s:iterator value="db.bulletMetrics" id="bulletMetrics">
		<p class="p1">
			<s:property value="#bulletMetrics.Elementname" />
			:
			<s:property value="#rtoedMetrics.value" />
		</p>
	</s:iterator>
	<hr>
	<input type="button" class="button" value="Download report" >
	<p class="p1">&nbsp;</p>
	<p class="p1">&nbsp;</p>
	<p class="p1">&nbsp;</p>
	<p class="p1">&nbsp;</p>
	<p class="p1">&nbsp;</p>
	<p class="p1">&nbsp;</p>
</div>