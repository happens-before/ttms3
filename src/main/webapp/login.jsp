<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="css/reset.css" type="text/css">
	<link rel="stylesheet" href="css/login.css" type="text/css">
<title>用户登录</title>
</head>
<body>
    <div class="container">
        <div id="main">
            <div id="logo"><img src="images/logo.png" alt="login"></div>
            
            <div id="info">
                    <form action="login?user?method=getImage" method="post">
                    
                    <input id="username" type="text" placeholder="请输入用户名" onblur="user()"name="name" required autofocus/>
                    <span id="user_img"></span>
                    <p id="user_tip"></p>
                    <input id="password" type="password" placeholder="请输入密码" onblur="pwd()" name="pass">
                    <span id="pwd_img"></span>
                    <p id="pwd_tip"></p>
                    <button id="submit" onclick="return checkAll()" >登   录</button>
                    <div id="infor" style="color:red">${desc}</div>
                    </form>
            </div>
        </div>
    </div>
    <script>
        var username=document.getElementById('username');
        var password=document.getElementById('password');
        var submit=document.getElementById('submit');
        username.focus();
        function user() {
            if(!/^[0-9a-zA-Z]{6,20}$/.test(username.value)){
                document.getElementById('user_img').innerHTML="<img src='images/error.png'>";
                document.getElementById('user_tip').innerHTML="*请输入6-20位的字母或数字的用户名！";
                username.focus();
                return false;
            }else{
                document.getElementById('user_img').innerHTML="<img src='images/right.png'>";
                document.getElementById('user_tip').innerHTML="";
                return true;
            }
        }
       function pwd() {
            if(!/^[0-9a-zA-Z]{6,20}$/.test(password.value)){
                document.getElementById('pwd_img').innerHTML="<img src='images/error.png'>";
                document.getElementById('pwd_tip').innerHTML="*请输入6-20位的字母或数字的密码！";
                password.focus();
                return false;
            }else{
                document.getElementById('pwd_img').innerHTML="<img src='images/right.png'>";
                document.getElementById('pwd_tip').innerHTML="";
                return true;
            }

        }
       function checkAll() {
           if(!user() || !pwd()){
             return false;
           }else{  
            return true;
           }
       }
    </script>
</body>
</html>