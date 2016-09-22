<#include "../include/imports.ftl">
<@hst.setBundle basename="common.labels"/>
<#-- @ftlvariable name="info" type="com.dev9.hippo.components.CalendarComponentInfo" -->
<@hst.headContribution>
<link href='https://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>
</@hst.headContribution>
<@hst.headContribution>
<script src="<@hst.webfile path="/js/jquery-2.1.0.min.js"/>" type="text/javascript"></script>
</@hst.headContribution>
<@hst.headContribution>
<script src="<@hst.webfile path="/js/macharya-calendar-min.js"/>" type="text/javascript"></script>
</@hst.headContribution>


<#assign isPreview=hstRequest.requestContext.preview/>

<style>
  body {
    font-family: 'Roboto', sans-serif;
  }
</style>


<b>
  <h3>${info.title}</h3>
</b>
</div>

<div class="${info.calendarClassName}" style="min-width:800px;min-height:500px;"></div>


<script>
    <@hst.link path="/" var="ctx"/>

    var context = "${ctx}";
    <#if isPreview>
    var restbase = '<@core.url value="/rest/preview/"/>';
    <#else>
    var restbase = '<@hst.link path="/rest/"/>';
    </#if>
    var restendpoint = restbase + "/Calendar/events";
    var props_123 = {
      "width": ${info.width}, //width of the calendar display
      "height": ${info.height}, //height of the calendar display
      "max_years": ${info.maxYears}, //max. number of years shown in the year selector
      "future_years": ${info.futureYears}, //number of future years shown in the year selector.
      "background_color": "${info.backgroundColor}", //background color of the calendar display.
      "color": "${info.color}", //font color of elements within calendar
      "date_field_class": "${info.calendarClassName}", //Class name of input field that is will invoke the calendar display.
      "rest_endpoint": restendpoint, //Rest service endpoint.
      "padding": "0px",
      "dayofweek": [
        "Sunday",
        "Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday"
      ],
      "months": [
        "January",
        "February",
        "March",
        "April",
        "May",
        "June",
        "July",
        "August",
        "September",
        "October",
        "November",
        "December"
      ]

    };


    new Calendar(props_123);


</script>


