$(document).ready(function () {
    $(".button-help").hover(function () {
        var content = $(this).find(".help-content");
        $(content).fadeIn();
    }, function () {
        var content = $(this).find(".help-content");
        $(content).fadeOut();
    });
});