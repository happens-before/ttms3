
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
          <a href="../employee?method=searchByPage">员工信息</a>
        </li> 
        <li class="layui-nav-item ">
          <a href="../user?method=findAll">权限登陆信息</a>
        </li>  
      </ul>
    </div>
  </div>
  <!-- 增加员工信息 -->
        <div class="col-md-10" style="margin-left: 150px;margin-top: 30px;">
            <form class="form-horizontal" role="form" action="../employee?method=add" method="post">
                <div class="form-group">
                    <label for="emp_no" class="col-sm-2 control-label">用户编号</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" id="emp_no" name="emp_no" 
                            placeholder="请输入大小写字母和数字,长度6-20位" pattern="[a-zA-Z0-9]{6,20}" 
                            required="required" oninvalid="setCustomValidity('请输入大小写字母和数字,长度6-20位!')" 
                            oninput="setCustomValidity('')" >
                    </div>
                </div>
                <div class="form-group">
                    <label for="emp_name" class="col-sm-2 control-label">用户姓名</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" id="emp_name" name="emp_name"
                            placeholder="请输入真实姓名,10字以内" pattern="[\u4e00-\u9fa5]{2,10}"
                            required="required" oninvalid="setCustomValidity('请输入真实姓名,10字以内!')"
                            oninput="setCustomValidity('')" >
                    </div>
                </div>
                <div class="form-group">
                    <label for="emp_tel_num" class="col-sm-2 control-label">电话号码</label>
                    <div class="col-sm-6">
                        <input type="tel" class="form-control" id="emp_tel_num" name="emp_tel_num"
                            placeholder="请输入手机号码" pattern="1[3-8][0-9]{9}" 
                            required="required" oninvalid="setCustomValidity('请输入正确手机号码!')"
                            oninput="setCustomValidity('')">
                    </div>
                </div>
                <div class="form-group">
                    <label for="emp_addr" class="col-sm-2 control-label">地址</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" id="emp_addr" name="emp_addr"
                            placeholder="请输入地址" pattern=".{2,30}" 
                            required="required" oninvalid="setCustomValidity('请输入地址!')"
                            oninput="setCustomValidity('')">
                    </div>
                </div>
                <div class="form-group">
                    <label for="emp_email" class="col-sm-2 control-label">邮箱</label>
                    <div class="col-sm-6">
                        <input type="email" class="form-control" id="emp_email" name="emp_email" 
                            placeholder="请输入Email" required="required"  
                            pattern="([a-zA-Z0-9_-])+@[a-zA-Z0-9_-]+((\.[a-z]{2,3}){1,2})"
                            oninvalid="setCustomValidity('请输入正确格式Email!')"
                            oninput="setCustomValidity('')">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-2 control-label" style="color:red;font-weight: bold;">${result}</div>
                    <div class="col-sm-6">
                        <!-- <input type="hidden" name="method" value="add"> -->
                        <button type="submit" class="btn btn-primary">提  交</button>                     
                    </div>
                </div>
            </form>

      </div>
    </div>
 
  <script src="layui/layui.js"></script>
</body>
