<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>CAD标注平台</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="description" content="overview &amp; stats"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0"/>
    <!-- bootstrap & fontawesome -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <!-- page specific plugin styles -->
    <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.bootcss.com/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.bootcss.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-fileinput/4.4.9/css/fileinput.min.css" media="all" rel="stylesheet" type="text/css" />
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-fileinput/4.4.9/js/plugins/piexif.min.js" type="text/javascript"></script>
    <!-- sortable.min.js is only needed if you wish to sort / rearrange files in initial preview.
        This must be loaded before fileinput.min.js -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-fileinput/4.4.9/js/plugins/sortable.min.js" type="text/javascript"></script>
    <!-- purify.min.js is only needed if you wish to purify HTML content in your preview for
        HTML files. This must be loaded before fileinput.min.js -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-fileinput/4.4.9/js/plugins/purify.min.js" type="text/javascript"></script>
    <!-- popper.min.js below is needed if you use bootstrap 4.x. You can also use the bootstrap js
       3.3.x versions without popper.min.js. -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"></script>
    <!-- bootstrap.min.js below is needed if you wish to zoom and preview file content in a detail modal
        dialog. bootstrap 4.x is supported. You can also use the bootstrap js 3.3.x versions. -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" type="text/javascript"></script>
    <!-- the main fileinput plugin file -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-fileinput/4.4.9/js/fileinput.min.js"></script>
    <!-- optionally if you need a theme like font awesome theme you can include it as mentioned below -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-fileinput/4.4.9/themes/fa/theme.js"></script>
    <!-- optionally if you need translation for your language then include  locale file as mentioned below -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-fileinput/4.4.9/js/locales/zh.min.js"></script>
</head>
<body>
    <#include "/banner.ftl">
<div class="container">
    <div class="row">
        <div class="bd-example" >
            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#newDataSetModel">新建数据集</button>
            <button type="button" class="btn btn-danger">删除数据集</button>
        </div>
        <hr>
        <table class="table">
            <thead>
            <tr>
                <th scope="col">数据集编号</th>
                <th scope="col">数据集名称</th>
                <th scope="col">数据集描述</th>
                <th scope="col">数据集类型</th>
                <th scope="col">创建时间</th>
                <th scope="col">更新时间</th>
                <th scope="col">数据集大小</th>
                <th scope="col">创建人</th>
            </tr>
            </thead>
        <#list dataSetList as dataSet>
            <tr>
                <td scope="row">${dataSet.dataSetID}</td>
                <td><a href="/dataSet/${dataSet.dataSetID}">${dataSet.dataSetName}</a></td>
                <td>${dataSet.dataSetDesc}</td>
                <td>${dataSet.dataSetType.getName()}</td>
                <td>${dataSet.createTime?string('yyyy-MM-dd hh:mm:ss')}</td>
                <td>${dataSet.editTime?string('yyyy-MM-dd hh:mm:ss')}</td>
                <td>${dataSet.dataSetLength}</td>
                <td>${dataSet.dataSetUsername}</td>
            </tr>
        </#list>
        </table>
    </div>
    <!-- Modal -->
    <div class="modal fade" id="newDataSetModel" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">新建数据集</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <form id="dataSetForm">
                        <div class="form-group">
                            <label for="dataSetNameInput">数据集名称</label>
                            <input  type="text" class="form-control" id="dataSetNameInput" name="dataSetName">
                        </div>
                        <div class="form-group">
                            <label for="dataSetDescInput">数据集描述</label>
                            <input type="text" class="form-control" id="dataSetDescInput" name="dataSetDesc">
                        </div>
                        <div class="form-group">
                            <label for="dataSetDescInput">数据集类型</label>
                            <select class="form-control" name="dataSetType">
                                 <#list dataSetTypeList as dataSetType>
                                     <option value="${dataSetType.name()}">${dataSetType.getName()}</option>
                                 </#list>
                            </select>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">取消</button>
                    <button type="button" class="btn btn-primary" onclick="addNewDataSet()">提交</button>
                </div>
            </div>
        </div>
    </div>
    <#include "/copyright_footer.html">
    <script>
        function addNewDataSet() {
            let form = document.getElementById("dataSetForm");

            let formData = new FormData(form);
            fetch('/api/0.1/dataSet', {
                method: 'post',
                body: formData
            }).then(response => response.json())
                    .then(data => {
                        if(data){
                            alert("新建成功")
                            location.reload()
                        }else{
                            alert("新建失败")
                        }
                    }).catch((error) => {
                alert(error)
            });
        }
    </script>
</div>

</body>
</html>