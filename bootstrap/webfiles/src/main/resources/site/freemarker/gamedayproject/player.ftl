<#include "../include/imports.ftl">
<#-- @ftlvariable name="document" type="com.dev9.hippo.beans.RosterDocument" -->
<#if document??>

<ul class="player-ul">
  <li class="player-image">
    <@hst.link hippobean=document.image.featured var="image"/>
    <img src="${image}"/>
  </li>
  <li class="player-name">
    <span>${document.number}</span><span>${document.name}</span>

  </li>
  <li class="player-position">

    ${document.position}

  </li>
  <li>
    <ul class="two-column-ul">
      <li>
          <@hst.html hippohtml=document.description/>
      </li>
    </ul>
  </li>


</ul>
</#if>

