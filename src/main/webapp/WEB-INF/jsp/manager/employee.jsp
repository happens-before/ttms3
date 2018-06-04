<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>票务管理系统</title>
  <script src="js/jquery-2.1.0.js"></script>
  <link rel="stylesheet" type="text/css" href="css/search.css">
  <link rel="stylesheet" href="layui/css/layui.css">  
  <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
  <script src="bootstrap/js/bootstrap.min.js"></script>
  <script src="js/user.js"></script>
  <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <%@ page import="java.util.List" %>
  <%@page import="xupt.edu.ttms.model.Employee"%>
</head>
<body>
<div class="layui-layout layui-layout-admin">
  <div class="layui-header">
    <div class="layui-logo">剧院票务管理系统</div>
    
    <ul class="layui-nav layui-layout-right">
      <li class="layui-nav-item">
        <a href="javascript:;">
          <img src="images/person.png" class="layui-nav-img">
                管理员
        </a>
        <dl class="layui-nav-child">
          <dd><a href="">基本资料</a></dd>
          <dd><a href="">安全设置</a></dd>
        </dl>
      </li>
      <li class="layui-nav-item"><a href="login.jsp">退出</a></li>
    </ul>
  </div>
  
  <div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
      <ul class="layui-nav layui-nav-tree"  lay-filter="test">
        <li class="layui-nav-item ">
          <a href="studio?method=searchByPage">演出厅管理</a>
        </li>
        <li class="layui-nav-item ">
          <a href="employee?method=searchByPage">员工信息</a>
        </li>  
        <li class="layui-nav-item ">
          <a href="user?method=findAll">权限登陆信息</a>
        </li> 
      </ul>
    </div>
  </div>
<div>
<form class="form-inline" action="employee?method=searchByPage" method ="post">
     <div class="form-group">
            <button type="button" class="btn btn-info" data-toggle="modal" data-target="#exampleModal" data-whatever="@getbootstrap" 
                style="margin-left: 230px;margin-top: 20px;" onclick="javascript:window.location='manager/addEmployee.jsp'">添加</button>
    </div> 
     <div class="form-group" id="search">
        <input type="search" class="form-control" placeholder="search..." name="emp_name" value="${search_emp_name}">
        <button type="submit" class="btn btn-info" >搜索</button>
      </div>
  </form> 
    <div style="padding: 25px;">
      <table class="table table-bordered" id="tab" style="width: 1460px; margin-left: 200px;">
<tbody id="tbody">
      <!-- On cells (`td` or `th`) -->
      <tr class="active">
        <th>用户ID</th>
        <th>用户编号</th>
        <th>用户姓名</th>
        <th>电话号码</th>
        <th>住址信息</th>
        <th>电子邮箱</th>
        <th>修改</th>
        <th>删除</th>
      </tr>
      <%
          int currentPage=1;  //当前页
          int allCount=0;     //总记录数
          int allPageCount=0; //总页数
          Employee Employee=null;
          //查看request中是否有currentPage信息，如没有，则说明首次访问该页
          if(request.getAttribute("allEmployee")!=null)
          {
              //获取Action返回的信息
              currentPage=((Integer)request.getAttribute("currentPage")).intValue();
              List<Employee> list=(List<Employee>)request.getAttribute("allEmployee");
              allCount=((Integer)request.getAttribute("allCount")).intValue();
              allPageCount=((Integer)request.getAttribute("allPageCount")).intValue();
              if(list!=null && list.size()>0)
              {
                  for(int i=0;i<list.size();i++)
                  {
          %>
      <tr class="success">
          <td><%=list.get(i).getEmp_id()%></td>
          <td><%=list.get(i).getEmp_no()%></td>
          <td><%=list.get(i).getEmp_name()%></td>
          <td><%=list.get(i).getEmp_tel_num()%></td>
          <td><%=list.get(i).getEmp_addr()%></td>
          <td><%=list.get(i).getEmp_email()%></td>           
          <td> 
          <a href="employee?method=searchById&emp_id=<%=list.get(i).getEmp_id()%>">修改</a> 
          </td>
          <td >
          <a href="employee?method=delete&emp_id=<%=list.get(i).getEmp_id()%>&emp_name=${search_emp_name}&currentPage=${currentPage}">删除</a>
          </td>
     </tr>
        <%
        }}}
        %>
      </tbody>
    </table>
   
    <!-- 分页 -->
        <div class="text-center">
          <ul class="pagination">
            <li><a href="employee?method=searchByPage&currentPage=1&emp_name=${search_emp_name}">首页</a></li>
            <li><a href="employee?method=searchByPage&currentPage=<%=(currentPage-1)<1?1:(currentPage-1)%>&emp_name=${search_emp_name}">上一页</a></li>
            <li><a href="employee?method=searchByPage&currentPage=<%=(currentPage+1)>allPageCount?allPageCount:(currentPage+1)%>&emp_name=${search_emp_name}">下一页</a></li>
            <li><a href="employee?method=searchByPage&currentPage=<%=allPageCount%>&emp_name=${search_emp_name}">末页</a></li>
          </ul>
        </div>
    </div>
  </div>
</div>
  <script src="layui/layui.js"></script>
</body>
</html>