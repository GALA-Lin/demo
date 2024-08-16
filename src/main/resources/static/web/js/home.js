function showContent(contentId) {
    // 隐藏所有的内容区域
    var allContents = document.querySelectorAll('.main-content > div');
    for (var i = 0; i < allContents.length; i++) {
        allContents[i].style.display = 'none';
    }

    // 根据传入的contentId显示相应的内容
    var targetContent = document.getElementById(contentId);
    if (targetContent) {
        targetContent.style.display = 'block';
    }
}
