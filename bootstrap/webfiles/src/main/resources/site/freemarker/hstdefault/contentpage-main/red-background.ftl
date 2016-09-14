<#include "../../include/imports.ftl">

<#-- @ftlvariable name="document" type="com.dev9.hippo.beans.ContentDocument" -->
<div style="background-color:rgba(99,20,30,0.8);padding:2px;">
<#if document??>
    <article class="has-edit-button">
        <@hst.cmseditlink hippobean=document/>
        <h3>${document.title?html}
            <#if document.publicationDate??>
                <small><@fmt.formatDate value=document.publicationDate.time type="date" dateStyle="medium"/></small>
            </#if>
        </h3>
        <#if document.introduction??>
            <p class="lead">${document.introduction?html}</p>
        </#if>
        <@hst.html hippohtml=document.content/>
    </article>
<#-- @ftlvariable name="editMode" type="java.lang.Boolean"-->
</div>
<#elseif editMode>
    <img src="<@hst.link path="/images/essentials/catalog-component-icons/simple-content.png" />"> Click to edit Simple Content
</#if>