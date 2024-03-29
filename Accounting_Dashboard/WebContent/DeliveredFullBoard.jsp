<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="display" uri="http://displaytag.sf.net"%>

<title>Students Details</title>
<style type="text/css">

/* for hiding the page banner */
.pagebanner 
{
        display: none;
}
/* for customizing page links */
.pagelinks 
{
        color: maroon;
        margin: 20px 0px 20px 50px;
}
/* for shifting all the Export options*/
.exportlinks 
{
        margin: 20px 0px 20px 30px;
}
/* For changing the spaces between export link */
.export 
{
        margin-left: 30px;
}
/* For Table css */
table 
{
        border: 1px solid #666;
        width: 60%;
        margin: 20px 0 20px 0px;
}
/* For odd and even row decoration */
tr.odd 
{
        background-color: #fff
}
tr.tableRowEven,tr.even 
{
        background-color: #CCCCCC
}
/* Css for table elements */
th,td 
{
        padding: 2px 4px 2px 4px;
        text-align: left;
        vertical-align: top;
}
thead tr 
{
        background-color: #999999;
}
/* For changing the background colour while sorting */
th.sorted 
{
        background-color: #CCCCCC;
}
th.sorted a,th.sortable a 
{
        background-position: right;
        display: block;
        width: 100%;
}
th a:hover 
{
        text-decoration: underline;
        color: black;
}
th a,th a:visited 
{
        color: black;
}
</style>

<html>
<body>

<div align="center">
<h4>Total Delivered mismatch till date</h4>
<display:table  export="true" id="deliveredLineitems" name="deliveredLineitems" pagesize="50" cellpadding="5px;"
cellspacing="5px;" style="margin-left:50px;margin-top:20px;" requestURI="">
<display:column property="vendorTrackingId" title="Tracking ID"/>
<display:column property="merchantRefId" title="Merchant Reference ID"/>
<display:column property="fklStatus" title="status in FKL"/>
<display:column property="aplStatus" title="status in APL"/>
</display:table>
</div>
</body>
</html>