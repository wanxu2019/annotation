<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>CAD标注平台</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="description" content="overview &amp; stats"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0"/>
    <!-- bootstrap & fontawesome -->
    <link href="//netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">

    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css"

          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <!-- page specific plugin styles -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-fileinput/4.4.9/css/fileinput.min.css" rel="stylesheet">

    <link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-fileinput/4.4.9/themes/explorer/theme.css" rel="stylesheet">
    <script
            src="https://code.jquery.com/jquery-3.3.1.min.js"
            integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
            crossorigin="anonymous"></script>
    <script src="https://cdn.bootcss.com/popper.js/1.12.9/umd/popper.min.js"
            integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
            crossorigin="anonymous"></script>
    <script src="https://cdn.bootcss.com/bootstrap/4.0.0/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
            crossorigin="anonymous"></script>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-fileinput/4.4.9/css/fileinput.min.css" media="all"
          rel="stylesheet" type="text/css"/>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-fileinput/4.4.9/js/plugins/piexif.min.js"
            type="text/javascript"></script>
    <!-- sortable.min.js is only needed if you wish to sort / rearrange files in initial preview.
        This must be loaded before fileinput.min.js -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-fileinput/4.4.9/js/plugins/sortable.min.js"
            type="text/javascript"></script>
    <!-- purify.min.js is only needed if you wish to purify HTML content in your preview for
        HTML files. This must be loaded before fileinput.min.js -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-fileinput/4.4.9/js/plugins/purify.min.js"
            type="text/javascript"></script>
    <!-- popper.min.js below is needed if you use bootstrap 4.x. You can also use the bootstrap js
       3.3.x versions without popper.min.js. -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"></script>
    <!-- bootstrap.min.js below is needed if you wish to zoom and preview file content in a detail modal
        dialog. bootstrap 4.x is supported. You can also use the bootstrap js 3.3.x versions. -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"
            type="text/javascript"></script>
    <!-- the main fileinput plugin file -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-fileinput/4.4.9/js/fileinput.min.js"></script>
    <!-- optionally if you need a theme like font awesome theme you can include it as mentioned below -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-fileinput/4.4.9/themes/explorer/theme.js"></script>
    <!-- optionally if you need translation for your language then include  locale file as mentioned below -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-fileinput/4.4.9/js/locales/zh.min.js"></script>


</head>
<body>
    <#include "/banner.ftl">
<div class="container">
    <div class="row">
        <div class="col-md-4 order-md-2 mb-4">
            <h4 class="d-flex justify-content-between align-items-center mb-3">
                <span class="text-muted">数据集属性</span>
                <span class="badge badge-secondary badge-pill">3</span>
            </h4>
            <ul class="list-group mb-3">
                <li class="list-group-item d-flex justify-content-between lh-condensed">
                    <div>
                        <h6 class="my-0">创建者</h6>
                    </div>
                    <span class="text-muted">${dataSet.dataSetName}</span>
                </li>
                <li class="list-group-item d-flex justify-content-between lh-condensed">
                    <div>
                        <h6 class="my-0">创建时间</h6>
                    </div>
                    <span class="text-muted">${dataSet.createTime?string('yyyy-MM-dd hh:mm:ss')}</span>
                </li>
                <li class="list-group-item d-flex justify-content-between lh-condensed">
                    <div>
                        <h6 class="my-0">更新时间</h6>
                    </div>
                    <span class="text-muted">${dataSet.editTime?string('yyyy-MM-dd hh:mm:ss')}</span>
                </li>
                <li class="list-group-item d-flex justify-content-between lh-condensed">
                    <div>
                        <h6 class="my-0">数据集类型</h6>
                    </div>
                    <span class="text-muted">${dataSet.dataSetType.getName()}</span>
                </li>
                <li class="list-group-item d-flex justify-content-between bg-light">
                    <div >
                        <h6 class="my-0">数据集大小</h6>
                    </div>
                    <span >${cnt}</span>
                </li>
                <li class="list-group-item d-flex justify-content-between bg-light">
                    <div>
                        <h6 class="my-0">未标注数据</h6>
                    </div>
                    <span >${noAnnoCnt}</span>
                </li>
                <li class="list-group-item d-flex justify-content-between bg-light">
                    <div class="text-success">
                        <h6 class="my-0">已标注数据</h6>
                    </div>
                    <span class="text-success">${hasAnnoCnt}</span>
                </li>
                <li class="list-group-item d-flex justify-content-between bg-light">
                    <p>描述:</p>
                    <p>${dataSet.dataSetDesc} </p>
                </li>
            </ul>

            <form class="card p-2" >
                    <div class="btn-group btn-group-sm "  role="group" aria-label="...">
                        <button type="button" class="btn btn-success" data-toggle="modal" data-target="#uploadData">上传数据</button>
                        <button type="button" class="btn btn-warning" data-toggle="modal" data-target="#taskModal">发布任务</button>
                        <button type="button" class="btn btn-info" data-toggle="modal" data-target="#dataSetModal">修改信息</button>
                        <button type="button" class="btn btn-primary">打包下载</button>
                    </div>
            </form>
        </div>
        <div class="col-md-8 order-md-1">
            <h4 class="mb-3">${dataSet.dataSetName}</h4>
            <table class="table">
                <thead>
                <tr>
                    <th scope="col">数据编号</th>
                    <th scope="col">创建时间</th>
                    <th scope="col">更新时间</th>
                    <th scope="col">上传者</th>
                </tr>
                </thead>
                        <#list dataSet.dataList as data>
                            <tr>
                                <td scope="row"><a href="/dataSet/${dataSet.dataSetID}/data/${data.dataID}">${data.dataID}</a></td>
                                <td>${data.createTime?string('yyyy-MM-dd hh:mm:ss')}</td>
                                <td>${data.editTime?string('yyyy-MM-dd hh:mm:ss')}</td>
                                <td>${data.username}</td>
                            </tr>
                        </#list>
            </table>
        </div>
    </div>
    <!-- Modal -->
    <div class="modal fade" id="uploadData" tabindex="-1" role="dialog" aria-labelledby="uploadDataLabel"
         aria-hidden="true">
        <div class="modal-dialog modal-lg" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="uploadDataLabel">上传数据</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <input id="uploadfile" name="file" type="file" multiple >
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">取消</button>
                </div>
            </div>
        </div>
    </div>

    <div class="modal fade" id="dataSetModal" tabindex="-1" role="dialog" aria-labelledby="dataSetModalLabel" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="dataSetModalLabel">修改数据集信息</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <form id="dataSetForm">
                        <div class="form-group" style="display: none">
                            <label for="dataSetIDInput">数据集ID</label>
                            <input  type="text" class="form-control" id="dataSetIDInput" name="dataSetID" value="${dataSet.dataSetID}">
                        </div>
                        <div class="form-group">
                            <label for="dataSetNameInput">数据集名称</label>
                            <input  type="text" class="form-control" id="dataSetNameInput" name="dataSetName" value="${dataSet.dataSetName}">
                        </div>
                        <div class="form-group">
                            <label for="dataSetDescInput">数据集描述</label>
                            <input type="text" class="form-control" id="dataSetDescInput" name="dataSetDesc" value="${dataSet.dataSetDesc}">
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">取消</button>
                    <button type="button" class="btn btn-primary" onclick="editDataSet()">提交</button>
                </div>
            </div>
        </div>
    </div>


    <#--modal下-->
    <div class="modal fade" id="taskModal" tabindex="-1" role="dialog" aria-labelledby="taskModalLabel" aria-hidden="true">
        <div class="modal-dialog modal-lg" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="taskModalLabel">发布任务</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <div class="bd-example">
                        <form id="taskForm">
                            <div class="form-group">
                                <label for="taskNameInput">任务名称</label>
                                <input type="text" class="form-control" id="taskNameInput" name="taskName">
                            </div>
                            <div class="form-row">
                                <div class="col-md-3">
                                    <div class="input-group mb-1">
                                        <div class="input-group-prepend">
                                            <div class="input-group-text">任务量</div>
                                        </div>
                                        <input type="number" class="form-control" id="taskNumberInput" value="${noAnnoCnt}" name="taskNumber">
                                    </div>
                                </div>
                                <div class="col-md-3">
                                    <div class="input-group mb-1">
                                        <div class="input-group-prepend">
                                            <div class="input-group-text">已标注</div>
                                        </div>

                                        <input type="number" class="form-control" value="${hasAnnoCnt}" disabled>
                                    </div>
                                </div>
                                <div class="col-md-2">
                                    <div class="input-group mb-1">
                                        <div class="input-group-prepend">
                                            <div class="input-group-text">全部</div>
                                        </div>
                                        <input type="number" class="form-control" value="${cnt}" disabled>
                                    </div>
                                </div>
                                <div class="col-md-2">
                                    <button type="button" class="btn btn-primary " onclick="allTask()">选择全部</button>
                                </div>
                                <div class="col-md-1">
                                    <button type="button" class="btn btn-primary " onclick="aveTask()">平均</button>
                                </div>
                            </div>
                            <div class="form-group">
                                <table class="table">
                                    <thead>
                                    <tr>
                                        <th scope="col"></th>
                                        <th scope="col">用户名</th>
                                        <th scope="col">任务量</th>
                                    </tr>
                                    </thead>
                                    <#list userList as user>
                                        <tr>
                                            <td><input class="task-user-checkBox" type="checkbox" name="${user.username}" value=""></td>
                                            <td>${user.username}</td>
                                            <td><input type="number" class="task-user-number-input" name="username" disabled></td>
                                        </tr>
                                    </#list>
                                </table>
                            </div>
                        </form>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">取消</button>
                    <button type="button" class="btn btn-primary" onclick="newTask()">提交</button>
                </div>
            </div>
        </div>
    </div>

    <#include "/copyright_footer.html">
    <script>
        $("#uploadfile").fileinput({
            language:"zh",
            hideThumbnailContent: true, // hide image, pdf, text or other content in the thumbnail preview
            uploadExtraData:{
                dataSetID:${dataSet.dataSetID}
            },
            theme: "explorer",
            uploadUrl: "/api/0.1/dataSet/data",
            maxFileCount: 100000,
            overwriteInitial: false,
        }).on("fileuploaded", function (event, data, previewId, index){
        });
        function editDataSet() {
            let form = document.getElementById("dataSetForm");
            let formData = new FormData(form);
            fetch('/api/0.1/dataSet', {
                method: 'PUT',
                body: formData
            }).then(response => response.json())
                    .then(data => {
                        if(data){
                            location.reload()
                        }else{
                            alert("修改失败")
                        }
                    }).catch((error) => {
                alert(error)
            });
        }
        function newTask() {
            let form = document.getElementById("taskForm");
            let formData = new FormData(form);
            fetch('/api/0.1/task', {
                method: 'post',
                body: formData
            }).then(response => response.json())
                    .then(data => {
                        if(data){
                            location.reload()
                        }else{
                            alert("修改失败")
                        }
                    }).catch((error) => {
                alert(error)
            });
        }
        $(".task-user-checkBox").on("click",function (e) {
            let name = $(this).attr("name");
            let $input =  $("input.task-user-number-input[name="+name+"]");
            if(this.checked){
                $input.removeAttr("disabled");
            }else{
                $input.attr("disabled","");
            }

        })
        
        function aveTask() {
            let noAnnoCnt = ${noAnnoCnt}
            let inputs =$("input.task-user-number-input:not([disabled])");
            let len = inputs.length;
            let ave = parseInt(noAnnoCnt/len);
            inputs.val(ave);
        }
        
        function allTask() {
            $("#taskNumberInput").val(${noAnnoCnt});
        }
    </script>
</div>

</body>
</html>