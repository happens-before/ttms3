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
  <%@page import="xupt.edu.ttms.model.Studio"%>
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
        <li class="layui-nav-item ">
          <a href="studio?method=searchByPage">演出厅管理</a>
        </li>
        <li class="layui-nav-item ">
          <a href="employee?method=searchByPage">员工信息</a>
        </li>  
        <li class="layui-nav-item">
          <a href="user?method=searchByPage">权限登陆信息</a>
        </li> 
      </ul>
    </div>
  </div>
  <!-- 更新员工信息 -->
  <div class="col-md-10" style="margin-left: 150px;margin-top: 30px;">
      <form class="form-horizontal" role="form" action="studio?method=update" method="post">
          <input type="hidden" name="studio_id" value="${studio.studio_id}">
             <div class="form-group">
                    <label for="studio_name" class="col-sm-2 control-label">演出厅名称</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" id="studio_name" name="studio_name" 
                            placeholder="请输入演出厅名称" pattern=".{2,30}" 
                            required="required" oninvalid="setCustomValidity('请输入演出厅名称')" 
                            oninput="setCustomValidity('')" value="${studio.studio_name}">
                    </div>
                </div>
                <div class="form-group">
                    <label for="studio_row_count" class="col-sm-2 control-label">行数</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" id="studio_row_count" name="studio_row_count"
                            placeholder="请输入演出厅行数" pattern="^[0-9]"
                            required="required" oninvalid="setCustomValidity('行数不能超过9')"
                            oninput="setCustomValidity('')" value="${studio.studio_row_count}">
                    </div>
                </div>
                <div class="form-group">
                    <label for="studio_col_count" class="col-sm-2 control-label">列数</label>
                    <div class="col-sm-6">
                        <input type="tel" class="form-control" id="studio_col_count" name="studio_col_count"
                            placeholder="请输入演出厅列数" pattern="^[0-9]" 
                            required="required" oninvalid="setCustomValidity('列数不能超过9!')"
                            oninput="setCustomValidity('')" value="${studio.studio_col_count}">
                    </div>
                </div>
                <div class="form-group">
                    <label for="studio_introduction" class="col-sm-2 control-label">介绍</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" id="studio_introduction" name="studio_introduction"
                            placeholder="请介绍演出厅" pattern=".{2,30}" 
                            required="required" oninvalid="setCustomValidity('请介绍演出厅!')"
                            oninput="setCustomValidity('')" value="${studio.studio_introduction}">
                    </div>
                </div>
          <div class="form-group">
              <div class="col-sm-2 control-label" style="color:red;font-weight: bold;">${result}</div>
              <div class="col-sm-6">
                  <!-- <input type="hidden" name="method" value="update"> -->
                  <button type="submit" class="btn btn-primary">修  改</button>   
                  
              </div>
          </div>
      </form>

      </div>
    </div>
  <script src="layui/layui.js"></script>
</body>
</html>