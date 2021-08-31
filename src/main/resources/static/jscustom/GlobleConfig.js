/*
* 功能：
* 作者：黄大大
* 时间：2021-08-08 15-21-53
* */
require.config({
    //数组，配置js的别名和路径
    paths:{
        jquery: ['https://cdn.bootcdn.net/ajax/libs/jquery/3.4.1/jquery.min','https://cdn.staticfile.org/jquery/3.4.1/jquery.min'],
        bootstrap:['https://cdn.bootcdn.net/ajax/libs/twitter-bootstrap/4.3.1/js/bootstrap.bundle.min'],
        bootstrap3:['https://cdn.bootcss.com/twitter-bootstrap/3.4.1/js/bootstrap.min'],
        custom:['/jslib/GentelellaAdmin/custom.min'],
        bootstrap_table:['https://cdn.bootcss.com/bootstrap-table/1.15.4/bootstrap-table.min'],
        bootstrap_table_CN:['https://cdn.bootcss.com/bootstrap-table/1.15.4/locale/bootstrap-table-zh-CN.min'],
        layer:['https://cdn.bootcss.com/layer/2.3/layer'],//弹出层组件
        bootstrap_validator:['https://cdn.bootcss.com/bootstrap-validator/0.5.3/js/bootstrapValidator.min'],//表单验证插件
        bootstrap_validator_CN:['https://cdn.bootcss.com/bootstrap-validator/0.5.3/js/language/zh_CN.min'],
        jqueryform:['https://cdn.bootcss.com/jquery.form/4.2.2/jquery.form.min'],//控制表单数据和表单提交
        jqueryupload:['/jslib/JQuery/upload/jQuery.upload.min'],//上传文件
        ztree:['/jslib/zTree_v3/js/jquery.ztree.all']
    },

    //映射js组件的不同版本，用的较少，本项目中主要用这个属性、结合shim属性来管理css；
    map:{
        '*':{css:['https://cdn.bootcss.com/require-css/0.1.10/css.min.js']}
    },

    //用于解决非AMD标准模块的注入，这里面的deps为数组，表示其依赖的JS库/CSS
    shim:{
        bootstrap: {
            deps: ['jquery', 'css!https://cdn.bootcdn.net/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css', 'css!https://cdn.bootcdn.net/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css']
        },
        custom: {
            deps: ['jquery','bootstrap','css!/jslib/GentelellaAdmin/custom.min.css']
        },
        bootstrap_table: {
            deps:['jquery','bootstrap','css!https://cdn.bootcss.com/bootstrap-table/1.15.4/bootstrap-table.min.css']
        },
        bootstrap_table_CN: {
            deps:['jquery','bootstrap','bootstrap_table']
        },
        layer:{
            deps:['css!https://cdn.bootcss.com/layer/2.3/skin/layer.css']
        },
        bootstrap_validator:{
            deps:['jquery','bootstrap3','css!https://cdn.bootcss.com/bootstrap-validator/0.5.3/css/bootstrapValidator.min.css']
        },
        bootstrap_validator_CN:{
            deps:['jquery','bootstrap3','bootstrap_validator']
        },
        jqueryform:{
            deps:['jquery']
        },
        bootstrap3:{
            deps:['jquery','css!https://cdn.bootcss.com/twitter-bootstrap/3.4.1/css/bootstrap.min.css','css!https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css']
        },
        jqueryupload:{
            deps:['jquery','css!/jslib/JQuery/upload/upload.css']
        },
        ztree:{
            deps:['jquery','css!/jslib/zTree_v3/css/zTreeStyle/zTreeStyle.css']
        }
    }
})