/* Smooth scrolling para anclas */
$('a.smooth').live('click', function(e) {
    var $link = $(this);
    var anchor  = $link.attr('href');
    $('html, body').stop().animate({
        scrollTop: $(anchor).offset().top
    }, 1000);
});