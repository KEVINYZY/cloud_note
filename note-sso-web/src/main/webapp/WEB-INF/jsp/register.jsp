<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- saved from url=(0044)https://app.yinxiang.com/Registration.action -->
<html><!--<![endif]--><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8"><meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="en:locale" content="zh_CN_evernoteChina">
    

    <meta name="viewport" content="initial-scale=1">
      <link rel="Shortcut Icon" href="https://app.yinxiang.com/favicon.ico" type="image/x-icon">

    <title>创建印象笔记帐户</title>

    <!-- Google Analytics -->
<script src="/js/utag.js" type="text/javascript" async=""></script><script async="" src="/js/analytics.js"></script><script type="text/javascript">
(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
})(window,document,'script','//www.google-analytics.com/analytics.js','ga');

window.ga('create', 'UA-285778-5',
    'auto', {});
window.ga('require', 'displayfeatures');


/* <![CDATA[ */
  
  window.ga('set', 'location', 'https://app.yinxiang.com/Registration.action');
  
/* ]]> */
</script>
<!-- End Google Analytics -->
<script type="text/javascript">
  window.ga('send', 'pageview', '/Registration.action');
</script>
<!--[if lt IE 9]>
    <script src="/redesign/global/js/html5shiv.js"></script>
  <![endif]-->
  <link rel="stylesheet" href="/css/1439532964.css"><link rel="stylesheet" href="/css/1829045703.css"><script type="text/javascript" async="" charset="utf-8" id="utag_evernote.evernote-web_2" src="/js/utag.2.js"></script></head><body class="wrapper"><script type="text/javascript">
    
    (function(a,b,c,d){
     a='//tags.tiqcdn.com/utag/evernote/evernote-web/prod/utag.js';
     b=document;c='script';d=b.createElement(c);d.src=a;
     d.type='text/java'+c;d.async=true;
     a=b.getElementsByTagName(c)[0];a.parentNode.insertBefore(d,a)
    })();
  </script>
<script type="text/javascript" src="/js/jquery-1.5.1.min.js"></script>
<script type="text/javascript" src="/js/jquery.cookie.js"></script>
<script type="text/javascript" src="/js/jquery.alerts.js"></script>
<script type="text/javascript" src="/js/png.js"></script>
<script type="text/javascript" src="/js/cas.login.js"></script>
<script type="text/javascript" src="/js/capsLock.js"></script>  
<div class="bar-header">
      <div class="logo-bar"></div>
    </div>  
  <div id="container-boundingbox" class="wrapper">
      <div id="container" class="wrapper">
        <div class="main">
          <div class="MinimalFormFrame"><div class="heading">
      <div class="branding"></div>
      <h1>创建帐户</h1>
      </div>
  <div class="minimal-wrapper">
    <div class="minimal-body">
      <div class="MinimalRegistrationForm"><form method="POST" name="registration"  id="registration" class="minimal-form"><div class="PasswordStrength"></div><ol>
      <li class="Row">
        <div class="input-wrapper" id="email-wrapper">
          <input type="text" class="TextInput TextInput_large" id="email" name="username" maxlength="255" placeholder="你的用户名" value="">
            </div>
      </li>
      <li class="Row">
        <div class="input-wrapper" id="email-wrapper">
          <input type="text" class="TextInput TextInput_large" id="email" name="email" maxlength="255" placeholder="你的邮箱地址" value="">
            </div>
      </li>
      <li class="Row">
        <div class="input-wrapper" id="password-wrapper">
          <input type="password" class="TextInput TextInput_large" id="passwordInput" name="password" maxlength="64" placeholder="设置密码">
            </div>
            <span class="regInput" id="passwordErr"></span>
      </li>
      <li class="tos-container">
          <label class="t-pico tos">点击创建帐户，表示同意<a href="https://www.yinxiang.com/tos" target="_window">服务条款</a>和<a href="https://www.yinxiang.com/privacy" target="_window">隐私条款</a></label>
        </li>
      <li>
        <input name="register" id="register" type="submit" class="Btn Btn_emph Btn_super" value="创建帐户" ></li>
      </ol>
      <script type="text/javascript">
      	  var REGISTER = {
      			  param:{
      				  surl:""
      			  },
      			  inputcheck:function(){
      				  var flag = true;
      				  if($("#email").val() == ""){
      					  alert("用户名不可以为空");
      					  flag = false;
      				  }
      				  if($("#passwordInput").val() == ""){
					      alert("密码不可以为空");
      					  flag = false;
      				  }
      				  return flag;
      			  },
      			  beforeSubmit:function(){
      				  $.ajax({
      					url:REGISTER.param.surl+
      					"/user/check/"+
      					$("#email").val()+"/1?r="+Math.random(),
      					success:function(data){
      						if(data.data){
      							REGISTER.doSubmit();
      						}else{
      							alert(data.msg);
      						}
      					}
      				  })
      			  },
      			  doSubmit:function(){
      				  $.post("/user/register",
      						  $("#registration").serialize(),function(data){
							if(data.status == 200){
								jAlert("用户注册成功请登录！页面如果没有跳转请点击下面的登录","提示",function(){
									REGISTER.login();
								});
							}else{
								jAlert("注册失败","提示");
							}					  
      				  })
      			  },
      			  login:function(){
      				  location.href ="/page/login"
      				  return false;
      			  },
      			  reg:function(){
      				  if(this.inputcheck()){
      					  this.beforeSubmit();
      				  }
      			  }
      	  }
      	  
      	var register = document.getElementById("register");
      	register.onclick = function(event){
      		var event = event || window.event;
      		event.preventDefault();
      		window.event.returnValue = false;
      		REGISTER.reg();
      	};
      	  </script>
     </div></form></div></div>
  </div>
  <div id="context-switch">
      <div class="t-pico">
          已经拥有帐户？</div>
      <div class="switch">
        <a id="switch-link" href="/page/login">登录</a>
        <input type="hidden" name="code" value="mktg_hp"><input type="hidden" name="businessAutoApproveDomainOverride" value="false"><input type="hidden" name="embed" value="false"><div style="display: none;"><input type="hidden" name="_sourcePage" value="r1c18nHLhtbiMUD9T65RG_YvRLZ-1eYO3fqfqRu0fynRL_1nukNa4gH1t86pc1SP"><input type="hidden" name="__fp" value="pm0l_EJ3lms="></div></form></div>
    </div>
</div>

        <div class="footer wrapper">
  <a href="https://www.yinxiang.com/tos/" class="footer-entry" target="_blank">服务条款</a><a href="https://www.yinxiang.com/privacy/" class="footer-entry" target="_blank">隐私政策</a><span class="footer-entry last">
    版权所有2017Evernote Corporation。保留所有权利。</span>
</div>
</div>
    </div>
