<!doctype html>
<#include "../include/imports.ftl">
<html lang="en">
<head>
  <meta charset="utf-8"/>
  <link rel="stylesheet" href="${channelInfo.webFont}" type="text/css"/>
  <link rel="stylesheet" href="<@hst.webfile  path="/css/bootstrap.css"/>" type="text/css"/>
    <link rel="stylesheet" href="<@hst.webfile  path="/css/animations.min.css"/>" type="text/css"/>
    <link rel="stylesheet" href="<@hst.webfile  path="/css/font-awesome.css"/>" type="text/css"/>
    <link rel="stylesheet" href="<@hst.webfile  path="/css/style.css"/>" type="text/css"/>
<@hst.defineObjects/>
<#if hstRequest.requestContext.cmsRequest>
  <link rel="stylesheet" href="<@hst.webfile  path="/css/cms-request.css"/>" type="text/css"/>
</#if>

<@hst.headContributions categoryExcludes="htmlBodyEnd, scripts" xhtml=true/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
    <script src="<@hst.webfile  path="/js/animations.min.js"/>"></script>
    <script src="<@hst.webfile  path="/js/appear.min.js"/>"></script>
</head>
<body>
<div class="container">
  <div class="row">
  <@hst.include ref="top"/>
  </div>
  <div class="row">

  <@hst.include ref="menu"/>

  </div>
  <div class="row">
  <@hst.include ref="main"/>
  </div>
  <div class="row">
  <@hst.include ref="footer"/>
  </div>
</div>
<@hst.headContributions categoryIncludes="htmlBodyEnd, scripts" xhtml=true/>
</body>
</html>