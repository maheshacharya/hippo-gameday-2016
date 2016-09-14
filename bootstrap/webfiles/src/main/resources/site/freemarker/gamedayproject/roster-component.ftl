<#include "../include/imports.ftl">
<#-- @ftlvariable name="item" type="com.dev9.hippo.beans.RosterDocument" -->

<table class="table table-bordered table-hover">
  <thead class="table-head">
  <tr>
    <th>Number</th>
    <th>Player Name</th>
    <th>Position</th>
  </tr>
  </thead>
  <tbody>
  <#if results??>
      <#list results as item>
      <tr>
        <td>${item.number}</td>
        <td><a href="<@hst.link hippobean=item/>">${item.name}  </a></td>
        <td>${item.position}</td>
      </tr>

      </#list>
  </#if>
  </tbody>
</table>