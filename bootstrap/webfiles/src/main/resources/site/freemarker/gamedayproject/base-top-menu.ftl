<#include "../include/imports.ftl">

<#-- @ftlvariable name="menu" type="org.hippoecm.hst.core.sitemenu.HstSiteMenu" -->
<#-- @ftlvariable name="editMode" type="java.lang.Boolean"-->

<div class="main-menu">
<#if menu??>
    <#if menu.siteMenuItems??>
      <ul class="nav nav-pills">
          <#list menu.siteMenuItems as item>
              <#if  item.selected || item.expanded>
                <li class="active"><a href="<@hst.link link=item.hstLink/>">${item.name?html}</a></li>
              <#else>
                <li><a href="<@hst.link link=item.hstLink/>">${item.name?html}</a></li>
              </#if>
          </#list>
        <li style="float:right">
            <#assign mountName = hstRequest.requestContext.resolvedMount.mount.name/>
            <#assign mount=hstRequestContext.resolvedMount.mount.alias/>

            <#if mount=="site">
              <img class="location" location="us" src="<@hst.link path="/binaries/content/gallery/gamedayproject/icons/us.png" />" style="width:32px;margin-top:6px"/>

            <#else>
              <img class="location" location="${mountName}" src="<@hst.link path="/binaries/content/gallery/gamedayproject/icons/${mountName}.png" />" style="width:32px;margin-top:6px"/>

            </#if>

        </li>
      </ul>
    </#if>
</div>
    <@hst.cmseditmenu menu=menu/>
<#else>
    <#if editMode>
    <h5>[Menu Component]</h5>
    <sub>Click to edit Menu</sub>
    </#if>
</#if>