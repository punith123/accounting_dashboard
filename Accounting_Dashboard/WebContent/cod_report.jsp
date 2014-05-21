<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FSD Payment Settlement report</title>
<script  type="text/javascript" src="datetimepicker.js" ></script>

</head>
<body>
<div align="center">
<h2>ALL India COD Report</h2>
<form action="report">
<h5>Select the from and to data range</h5>
<input type="hidden" name="reportName" value="cod_report">
from :&nbsp;&nbsp;&nbsp;<input id="fromDate" type="text" size="25"><a href="javascript:NewCal('fromDate','ddmmyyyy')"><img src="cal.gif" width="16" height="16" border="0" alt="Pick a date"></a>
:&nbsp;&nbsp;&nbsp;To :&nbsp;&nbsp;&nbsp;<input id="toDate" type="text" size="25"><a href="javascript:NewCal('toDate','ddmmyyyy')"><img src="cal.gif" width="16" height="16" border="0" alt="Pick a date"></a>
<input type="submit">
</form>
</div>
</body>
</html>