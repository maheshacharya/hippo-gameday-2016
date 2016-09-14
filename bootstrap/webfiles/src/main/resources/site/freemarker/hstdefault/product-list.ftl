<#include "../include/imports.ftl">

<style>
  #slideshow {

    position: relative;
    box-shadow: 0 0 3px rgba(0,0,0,0.1);

  }

  .slide{
    background-color: rgba(0,0,0,0.05);
  }

  #slideshow > div {
    padding:10px;
  }

</style>

<script>

  $(document).ready(function(){
    $("#slideshow > div:gt(0)").hide();

    setInterval(function() {
      $('#slideshow > div:first')
              .hide()
              .next()
              .show()
              .end()
              .appendTo('#slideshow');
    },  10000);

  });

</script>

<#if pageable?? && pageable.items?has_content>



<div id="slideshow">

  <#list pageable.items as item>
    <div class="slide">
      <h3>${item.title}</h3>
      <img class="img-responsive" src="<@hst.link hippobean=item.image[0]/>">
      <h1>${item.price?string.currency}</h1>
      <@hst.html hippohtml=item.description/>
    </div>
  </#list>

</div>

</#if>