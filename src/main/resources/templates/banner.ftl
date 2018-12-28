
<div class="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom box-shadow">
    <h5 class="my-0 mr-md-auto font-weight-normal">CAD数据标注平台</h5>
    <nav class="my-2 my-md-0 mr-md-3">
        <a class="p-2 text-dark" href="#">数据集</a>
        <a class="p-2 text-dark" href="#">标注任务</a>
        <a class="p-2 text-dark" href="#">使用说明</a>
    </nav>
    <#if Session.user?exists>
        <div class="btn-group">
            <button type="button" class="btn btn-info dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                ${Session.user.username}
            </button>
            <div class="dropdown-menu">
                <a class="dropdown-item" href="#">个人中心</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#" onclick="userLogout()">退出</a>
            </div>
        </div>
    <#else >
        <a class="btn btn-outline-primary" href="#" data-toggle="modal" data-target="#userLoginModal">登录</a>
    </#if>
</div>

<div class="modal fade" id="userLoginModal" tabindex="-1" role="dialog" aria-labelledby="userLoginModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="userLoginModalLabel">用户登录</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form>
                    <div class="form-group">
                        <label for="username">用户名</label>
                        <input type="email" class="form-control" id="username" name="username" >
                    </div>
                    <div class="form-group">
                        <label for="password">密码</label>
                        <input type="password" class="form-control" id="password"  name="password">
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary" onclick="userLogin()">登录</button>
            </div>
            <script>
                function userLogin() {
                    let formData = new FormData();
                    formData.append("username",$("#username").val());
                    formData.append("password",$("#password").val());
                    fetch('/user/login', {
                        method: 'post',
                        body: formData
                    }).then(response => response.json())
                        .then(data => {
                            if(data){
                                alert("登录成功")
                                location.reload()
                            }else{
                                alert("登录失败")
                            }
                        });
                }
                function userLogout(){
                    let formData = new FormData();
                    fetch('/user/logout', {
                        method: 'post',
                        body: formData
                    }).then(response => response.json())
                            .then(data => {
                                if(data){
                                    alert("退出成功")
                                 }else{
                                    alert("登录失败")
                                }
                            });
                }
            </script>
        </div>
    </div>
</div>