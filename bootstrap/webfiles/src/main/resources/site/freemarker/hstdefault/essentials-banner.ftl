<#include "../include/imports.ftl">

<#-- @ftlvariable name="document" type="com.dev9.hippo.beans.Banner" -->
<#if document??>
  <div>
    <a href="<@hst.link hippobean=document.link />"><img src="<@hst.link hippobean=document.image />" alt="${document.title?html}"/></a>
  </div>
<#elseif editMode>
  <img src="<@hst.link path='/images/essentials/catalog-component-icons/banner.png'/>"> Click to edit Banner
</#if>
