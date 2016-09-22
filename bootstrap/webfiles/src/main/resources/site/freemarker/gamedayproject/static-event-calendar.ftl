<#include "../include/imports.ftl">
<@hst.setBundle basename="common.labels"/>

<link href='https://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>
<script src="<@hst.webfile path="/js/jquery-2.1.0.min.js"/>" type="text/javascript"></script>
<script src="<@hst.webfile path="/js/macharya-calendar-min.js"/>" type="text/javascript"></script>

<style>
  body {
    font-family: 'Roboto', sans-serif;
  }
</style>


<div>
  <div style="text-align:center">
    <b>
      <h1><@fmt.message key="events.calendar"/></h1>
    </b>
  </div>
  <center>
    <div class="event-calendar" style="min-width:800px;min-height:500px;"></div>
  </center>
</div>


<script>
  var context = "<@hst.link path="/"/>";
  var restendpoint = "http://localhost:8080/site/rest/Calendar/events?start=8-01-2016&end=10-01-2016";
  var props_1462805813267 = {
    "width": 1200, //width of the calendar display
    "height": 800, //height of the calendar display
    "max_years": 20, //max. number of years shown in the year selector
    "future_years": 4, //number of future years shown in the year selector.
    "background_color": "rgba(255,255,255,0.96)", //background color of the calendar display.
    "color": "#000", //font color of elements within calendar
    "date_field_class": "event-calendar", //Class name of input field that is will invoke the calendar display.
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


    new Calendar(props_1462805813267);



</script>


