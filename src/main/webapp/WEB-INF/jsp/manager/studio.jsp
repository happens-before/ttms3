<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@page import="xupt.edu.ttms.model.Studio"%>
<html>
<head>
    <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="false" errorPage="error.jsp"%>
    <%@ page import="java.util.List" %>
    <%@page import="xupt.edu.ttms.model.Studio"%>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>票务管理系统</title>
    <script src="js/jquery-2.1.0.js"></script>
    <link rel="stylesheet" type="text/css" href="css/search.css">
    <link rel="stylesheet" href="layui/css/layui.css">  
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <script src="js/index.js"></script>
    <title>在此处插入标题</title>
</head>
<body>
    <div class="layui-layout layui-layout-admin">
    <div class="layui-header">
    <div class="layui-logo">剧院票务管理系统</div>
    <!-- 头部区域（可配合layui已有的水平导航） -->
    
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
        <li class="layui-nav-item layui-nav-itemed sty">
          <a href="studio?method=searchByPage">演出厅管理</a>
        </li>
        <li class="layui-nav-item">
          <a href="employee?method=searchByPage">用户管理</a>         
        </li>  
        <li class="layui-nav-item ">
          <a href="user?method=findAll">权限登陆信息</a>
        </li>      
      </ul>
    </div>
  </div>
  
  <div>
    <!-- 内容主体区域 -->

<form class="form-inline" action="studio?method=searchByPage" method="post">
    <div class="form-group">
            <button type="button" class="btn btn-info" data-toggle="modal" data-target="#exampleModal" data-whatever="@getbootstrap" 
                style="margin-left: 230px;margin-top: 20px;" onclick="javascript:window.location='manager/addStudio.jsp'">添加</button>
    </div>

     <div class="form-group" id="search">
        <input type="search" class="form-control" placeholder="search..." name="studio_name" value="${search_studio_name}">
        <button type="submit" class="btn btn-info">搜索</button>
      </div>
</form>
     
      

    <div style="padding: 15px;">

      <table class="table table-bordered" id="tab" style="width: 1460px; margin-left: 200px;">
      
<tbody id="tbody">
    

      <!-- On cells (`td` or `th`) -->
      <tr class="active">
        <td >演出厅ID</td>
        <td >演出厅名称</td>
        <td >行数</td>
        <td >列数</td>
        <td >简介</td>
        <td>修改</td>
        <td>删除</td>        
        <td>座位</td>
      </tr>
       <%
          int currentPage=1;  //当前页
          int allCount=0;     //总记录数
          int allPageCount=0; //总页数
          Studio studio=null;
          //查看request中是否有currentPage信息，如没有，则说明首次访问该页
          if(request.getAttribute("allStudio")!=null)
          {
              //获取Action返回的信息
              currentPage=((Integer)request.getAttribute("currentPage")).intValue();
              List<Studio> list=(List<Studio>)request.getAttribute("allStudio");
              allCount=((Integer)request.getAttribute("allCount")).intValue();
              allPageCount=((Integer)request.getAttribute("allPageCount")).intValue();
              if(list!=null && list.size()>0)
              {
                  for(int i=0;i<list.size();i++)
                  {
          %>
            <tr class="success">
                <td><%=list.get(i).getStudio_id()%></td>
                <td><%=list.get(i).getStudio_name()%></td>
                <td><%=list.get(i).getStudio_row_count()%></td>
                <td><%=list.get(i).getStudio_col_count()%></td>
                <td><%=list.get(i).getStudio_introduction()%></td>
                 <td >           
               <a href="studio?method=searchById&studio_id=<%=list.get(i).getStudio_id()%>">修改</a> 
                </td>
                <td >
                <a href="studio?method=delete&studio_id=<%=list.get(i).getStudio_id()%>&studio_name=${search_studio_name}&currentPage=${currentPage}">删除</a>
                </td>
                <td >
                    <button class="layui-btn layui-btn-radius" onclick="Toseat(this)"><i class="layui-icon"></i></button>
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
            <li><a href="studio?method=searchByPage&currentPage=1&studio_name=${search_studio_name}">首页</a></li>
            <li><a href="studio?method=searchByPage&currentPage=<%=(currentPage-1)<1?1:(currentPage-1)%>&studio_name=${search_studio_name}">上一页</a></li>
            <li><a href="studio?method=searchByPage&currentPage=<%=(currentPage+1)>allPageCount?allPageCount:(currentPage+1)%>&studio_name=${search_studio_name}">下一页</a></li>
            <li><a href="studio?method=searchByPage&currentPage=<%=allPageCount%>&studio_name=${search_studio_name}">末页</a></li>
          </ul>
        </div>
    </div>
  </div>
  
  <div class="layui-footer">
    <!-- 底部固定区域 -->
    © layui.com - 底部固定区域
  </div>
</div>
  <script src="layui/layui.js"></script>
    
</body>
</html>