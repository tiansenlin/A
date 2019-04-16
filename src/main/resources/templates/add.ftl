<link rel="stylesheet" href="/css2/index2.css" type="text/css"></link>
<script type="text/javascript" src="/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript">
    $(function(){
       $("#tj").click(function(){
           "add",
         $("form").serialize();
          function(obj){
              if(obj){
                  alert("添加成功");
                  location.href="list";
              }else{
                  alert("添加失败");
              }
          },"json"
       });
    });
    $.post(
        "jiaoseadd",

            function(obj){
               for(var i in obj){
                 $("[name='jiaose.jid']").append("<option value='"+obj[i].jid+"'>"+obj[i].jname+"</option>")
               }
            },"json"
    );
    $.post(
            "bumenadd",
            function(data){
                for(var a in data){
                    $("[name='bumen.pid']").append("<option value='"+data[a].pid+"'>"+data[a].bname+"</option>")
                }
            }
    );
</script>
<form action="add" method="get">
    <table>
          <tr>
              <td>用户名</td>
              <td>
                  <select name="bumen.pid">
                      <option>---请选择---</option>
                  </select>
              </td>
          </tr>
        <tr>
            <td>用户密码</td>
            <td><input type="text" name="ypassword"></td>
        </tr>
          <tr>
              <td>手机号</td>
              <td><input type="text" name="yphone"></td>
          </tr>
          <tr>
              <td>角色</td>
              <td><select name="jiaose.jid">
                  <option>---请选择----</option>
              </select></td>
          </tr>
          <tr>
              <td>状态</td>
              <td><input type="text" name="zhuangtai"></td>
          </tr>
        <tr>
            <td>创建时间</td>
            <td><input type="text" name="ytime"></td>
        </tr>
        <tr>
            <td><input type="submit" value="提交" id="tj"></td>
        </tr>
    </table>
</form>