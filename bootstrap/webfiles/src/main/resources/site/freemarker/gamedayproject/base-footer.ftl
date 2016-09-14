<#include "../include/imports.ftl">

<@hst.setBundle basename="essentials.global"/>
<@hst.include ref="footer-container"/>

<div class="text-center">
  <sub><@fmt.message key="footer.text" var="footer"/>${footer?html}</sub>
</div>
