<link rel="stylesheet" href="/css2/index2.css" type="text/css"></link>
<script type="text/javascript" src="/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript">
    $(function(){
       $("#cx").click(function(){
           location.href="list?mohu="+$("[name='mohu']").val();
       });
        $("#ad").click(function(){
            location.href="toadd";
        });
    });
    function page(i){
        location.href="list?currentPage="+i;
    }
    function dell(yid){
        $.post(
                "del",
                {"yid":yid},
                function(obj){
                    if(obj){
                        alert("删除成功");
                        location.href="list";
                    }else{
                        alert("删除失败");
                    }
                },"json"
        );
        function toupd(){
            location.href="toupdata";
        }
    }
</script>
<a><input type="text" name="mohu"><input type="button" value="查询" id="cx">
  <input type="button" value="添加" id="ad">
</a>
<table>
      <tr>
          <td>序号</td>
          <td>用户名</td>
          <td>手机号</td>
          <td>角色</td>
          <td>状态</td>
          <td>创建时间</td>
          <td>操作</td>
      </tr>
    <#list yhlist as t>
      <tr>
           <td>${t.yid}</td>
           <td>${t.bumen.pid}</td>
            <td>${t.yphone}</td>
            <td>${t.jiaose.jid}</td>
            <td>${t.zhuangtai}</td>
            <td>${t.ytime}</td>
            <td><input type="button" value="编辑" id="toupd(${t.yid})">
                <input type="button" value="删除" onclick="dell(${t.yid})">
            </td>
      </tr>
    </#list>
    <tr>
        <td colspan="11">${page}</td>
    </tr>
</table>