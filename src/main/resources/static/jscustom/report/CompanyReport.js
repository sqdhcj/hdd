/*
* 功能：公司报表网页对应的JS文件
* */
require(
    ['/jscustom/GlobleConfig.js'],
    function () {
        requirejs(
            ['jquery','bootstrap','custom'],
            function ($){
                //该处自定义脚本

                //页面显示报表
                $.ajax({
                    url:'/CompanyReport/html',
                    type:'post',
                    async:true,//true为异步，false为同步
                    success:function (data) {
                        $("#myreport").html(data);
                    }
                });

                //导出Excel
                $("#btn_ExportExcel").click(function () {
                    window.location="/CompanyReport/excel";
                });
            }
        )
    }
);