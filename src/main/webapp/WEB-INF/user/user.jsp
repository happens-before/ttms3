<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="../include/user/UserNavigator.jsp"%>
<title>权限信息管理</title>
<div style="padding: 25px;">
    <table class="table table-bordered" id="tab" style="width: 1460px; margin-left: 200px;">
        <tbody id="tbody">
        <tr class="active">
            <th>编号</th>
            <th>密码</th>
            <th>类型</th>
            <th>修改</th>
            <th>删除</th>
        </tr>
        <c:forEach items="${cs}" var="c">
            <tr class="success">
                <td>${c.emp_no}</td>
                <td>${c.emp_pass}</td>
                <td>${c.type}</td>
                <td>
                    <a href="user_edit?id=${c.id}">修改</a>
                </td>
                <td >
                    <a deleteLink="true" href="user_delete?id=${c.id}">删除</a>
                </td>
            </tr>
        </c:forEach>/
        </tbody>
    </table>
</div>
</div>
</div>
