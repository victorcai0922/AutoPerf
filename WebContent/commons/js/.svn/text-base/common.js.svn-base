function gotoPage(formName, pageNum){
	var pageInputName = "currentPage";
	var pageInput = null;
	var form = document.getElementsByName(formName)[0];

	if(document.getElementsByName(pageInputName).length != 0){
		pageInput = document.getElementsByName(pageInputName)[0];
		pageInput.value = pageNum;
	}else{
		pageInput = document.createElement("input");
		pageInput.type = "hidden";
	    pageInput.name = "currentPage";
	    pageInput.value = pageNum;

	    form.appendChild(pageInput);
	}

	form.submit();
}

function checkGoto(formName,obj, totalPage){
	var goto = $("#"+obj).val();
	if(!/^[1-9]+[0-9]*]*$/.test(goto)){
		alert("跳转页必须是正整数");
		return fales;
	}
	if(goto>totalPage){
		alert("跳转页面只能小于或等于总共页数");
		return fales;
	}
	gotoPage(formName, goto);
}

function dateDiff(interval, date1, date2)
    {
        var objInterval = {'D' : 1000 * 60 * 60 * 24, 'H' : 1000 * 60 * 60,
                           'M' : 1000 * 60, 'S' : 1000, 'T' : 1};
        interval = interval.toUpperCase();
        var dt1 = Date.parse(date1.replace(/-/g, '/'));
        var dt2 = Date.parse(date2.replace(/-/g, '/'));
        try
        {
            return Math.round((dt2 - dt1) / eval('(objInterval.' + interval + ')'));
        }
        catch (e)
        {
            return e.message;
        }
    }