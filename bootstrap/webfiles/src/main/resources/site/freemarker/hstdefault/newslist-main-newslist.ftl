<#include "../include/imports.ftl">
<@hst.setBundle basename="common.labels"/>

<#-- @ftlvariable name="item" type="com.dev9.hippo.beans.NewsDocument" -->
<#-- @ftlvariable name="pageable" type="org.onehippo.cms7.essentials.components.paging.Pageable" -->
<script>


  $(document).ready(function () {
    truncateContent();

  });

  function truncateContent() {
    var minimized_elements = $('.minimize');
    var minimize_character_count = 100;
    minimized_elements.each(function () {
      var t = $(this).text();
      if (t.length < minimize_character_count) return;
      var factor = 3;
      if ($(this).attr("imgsrc") !== '') {
        factor = 1;
      }
      $(this).html(
              t.slice(0, (minimize_character_count * factor)) + '<span>... </span><a href="' + $(this).attr("data-href") + '" class="more"><@fmt.message key="read.more"/></a>'
      );
    });
  }

</script>

<#if pageable?? && pageable.items?has_content>
    <#list pageable.items as item>
        <@hst.link var="link" hippobean=item />
    <article class="has-edit-button" >
        <@hst.cmseditlink hippobean=item/>
        <h3><a href="${link}">${item.title?html}</a></h3>
        <#if item.date?? && item.date.time??>
            <p><@fmt.formatDate value=item.date.time type="both" dateStyle="medium" timeStyle="short"/></p>
        </#if>
        <p>${item.location?html}</p>
        <div class="minimize" data-href="${link}">
        <p>${item.introduction?html}</p>
        </div>
    </article>
    </#list>
    <#if cparam.showPagination>
    <#include "../include/pagination.ftl">
    </#if>
<#-- @ftlvariable name="editMode" type="java.lang.Boolean"-->
<#elseif editMode>
    <img src="<@hst.link path='/images/essentials/catalog-component-icons/news-list.png'/>"> Click to edit News List
</#if>


