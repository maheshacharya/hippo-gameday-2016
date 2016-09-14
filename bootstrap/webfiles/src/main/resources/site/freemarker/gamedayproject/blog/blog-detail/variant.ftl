<#include "../../../include/imports.ftl">

<#-- @ftlvariable name="document" type="com.dev9.hippo.beans.Blogpost" -->
<#if document??>
    <div class="has-edit-button">
        <@hst.cmseditlink hippobean=document/>
        <h1>
            ${document.title?html}
            <#if document.publicationDate??>
                <small><@fmt.formatDate type="date" pattern="yyyy-MM-dd" value=document.publicationDate.time/></small>
            </#if>
        </h1>
        <#if document.introduction??>
            <p class="lead">${document.introduction?html}</p>
        </#if>
        <@hst.html hippohtml=document.content />
        <#if document.author??>
            <footer>
                <p>-- by <em>${document.author?html}</em></p>
            </footer>
        </#if>
    </div>
</#if>