<#include "../include/imports.ftl">

<#-- @ftlvariable name="info" type="com.dev9.hippo.components.LabelComponentInfo" -->
<#-- @ftlvariable name="document" type="com.dev9.hippo.beans.HtmlDocument" -->
<@hst.setBundle basename="${info.bundleName}"/>
<#if document??>
${document.html}
</#if>
<#if info.useCustomStyle>
<#-- Label with custom styling -->
    <#assign bold =""/>
    <#if info.bold>
        <#assign bold ="bold"/>
    </#if>
<div class="${info.cssClassName}" style="font-weight:${bold};color:${info.fontColor};font-size: ${info.fontSize}px;${info.cssStyle}">
    <@fmt.message key="${info.labelKey}"/>
</div>
<#else>
<#-- Default Label Display-->
<h2 class="component-label"><@fmt.message key="${info.labelKey}"/></h2>
</#if>



