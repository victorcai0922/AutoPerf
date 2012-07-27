$(function(){
    // trim 输入框
    $("form input[type=text]").blur(function(){
      $(this).val($.trim($(this).val()));
    });
});

// jQuery.validator增加IP验证
jQuery.validator.addMethod("ip", function(value, element) {
    return this.optional(element) || (/^(\d+)\.(\d+)\.(\d+)\.(\d+)$/.test(value) && (RegExp.$1 <256 && RegExp.$2<256 && RegExp.$3<256 && RegExp.$4<256));
}, "请输入合法的IP信息！");
