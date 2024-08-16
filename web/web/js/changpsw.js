function modifyPassword() {
    var username = document.getElementById('username').value;
    var currentPassword = document.getElementById('currentPassword').value;
    var newPassword = document.getElementById('newPassword').value;

    var data = {
        username: username,
        currentPassword: currentPassword,
        newPassword: newPassword
    };

    // 发送HTTP请求以更新用户密码
    var xhr = new XMLHttpRequest();
    xhr.open('POST', '/updatePassword', true);
    xhr.setRequestHeader('Content-Type', 'application/json');
    xhr.send(JSON.stringify(data));

    xhr.onload = function () {
        if (xhr.status === 200) {
            alert('密码修改成功！');
        } else {
            alert('密码修改失败。');
        }
    };
}