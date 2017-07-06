<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- saved from url=(0037)https://app.yinxiang.com/Login.action -->
<html>
<!--<![endif]-->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="en:locale" content="zh_CN_evernoteChina">


<meta name="viewport" content="initial-scale=1">
<link rel="Shortcut Icon" href="https://app.yinxiang.com/favicon.ico"
	type="image/x-icon">

<title>欢迎回来</title>

<!-- Google Analytics -->
<script src="/js/utag.js" type="text/javascript" async=""></script>
<script async="" src="/js/analytics.js"></script>
<script type="text/javascript" src="/js/jquery-1.5.1.min.js"></script>
<script type="text/javascript" src="/js/jquery.cookie.js"></script>
<script type="text/javascript" src="/js/jquery.alerts.js"></script>
<script type="text/javascript" src="/js/png.js"></script>
<script type="text/javascript" src="/js/cas.login.js"></script>
<script type="text/javascript" src="/js/capsLock.js"></script>
<script type="text/javascript">
	
<!-- End Google Analytics -->
<script type="text/javascript">
	window.ga('send', 'pageview', '/Login.action');
</script>
<!--[if lt IE 9]>
    <script src="/redesign/global/js/html5shiv.js"></script>
  <![endif]-->
<link rel="stylesheet" href="/css/1439532964.css">
<link rel="stylesheet" href="/css/1085116544.css">
<script type="text/javascript" async="" charset="utf-8"
	id="utag_evernote.evernote-web_2" src="/js/utag.2.js"></script>
</head>
<body class="wrapper">
	<script type="text/javascript">
		(function(a, b, c, d) {
			a = '//tags.tiqcdn.com/utag/evernote/evernote-web/prod/utag.js';
			b = document;
			c = 'script';
			d = b.createElement(c);
			d.src = a;
			d.type = 'text/java' + c;
			d.async = true;
			a = b.getElementsByTagName(c)[0];
			a.parentNode.insertBefore(d, a)
		})();
	</script>
	<div class="bar-header">
		<div class="logo-bar"></div>
	</div>
	<div id="container-boundingbox" class="wrapper">
		<div id="container" class="wrapper">
			<div class="main">
				<div class="MinimalFormFrame">
					<div class="heading">
						<div class="branding"></div>
						<h1>登录</h1>
					</div>
					<div class="minimal-wrapper">
						<div class="minimal-body">
							<div class="MinimalLoginForm">
								<div class="signin">
									<form method="post" name="login_form" id="login_form" action="/user/login"
										class="minimal-form">
										<div class="success-notification-light"></div>
										<ol>
											<li class="Row">
												<div id="email-wrapper">
													<input maxlength="255" name="username" id="username"
														placeholder="用户名或电子邮箱" type="text"
														class="TextInput TextInput_large">
												</div>
											</li>
											<li class="Row CanBePulledDown PulledIntoViewWithoutDelay"
												id="passwordRow" tabindex="-1">
												<div id="password-wrapper">
													<input type="password" class="TextInput TextInput_large"
														id="password" name="password" placeholder="密码"
														maxlength="64">
												</div>
													<span id="span"></span>
											</li>
													<script type="text/javascript">
														var username = document.getElementById("username");
														var password = document.getElementById("password");
														var span = document.getElementById("span");
														var redirectUrl ="${redirect}"
												         username.onblur = function(){
														     if(username.value == ''){
															    span.innerHTML ="<font color='red'>请输入用户名</font>";
														     }
														 	 if(username.value != ''){
														 		 span.innerHTML=""
														 	 }
													     }
														
												         password.onblur = function(){
														     if(password.value == ''){
															    span.innerHTML ="<font color='red'>请输入密码</font>";
														     }
														 	 if(password.value != ''){
														 		 span.innerHTML=""
														 	 }
													     }
													</script>

											<li class="Row CanBePulledDown" id="responseMessageRow"
												tabindex="-1">
												<div id="responseMessage" class="PullableText"></div>
											</li>
											<li
												class="checkbox-container SwitchInput Row CanBePulledDown PulledIntoView"
												id="rememberMeRow" tabindex="-1"><input
												name="rememberMe" id="rememberMe" type="checkbox"
												class="checkbox" value="true"><label
												for="rememberMe">30 天内记住我</label></li>
											<li class="Row CanBePulledDown PulledIntoView" id="submitRow"
												tabindex="-1"><input type="hidden" name="login"
												id="eventToTrigger"> <input name="login"
												id="loginButton" type="submit"
												class="Btn Btn_emph Btn_super" value="登录"></li>
										</ol>
										<input type="hidden" id="hpts" name="hpts"
											value="1498579599998"> <input type="hidden"
											id="hptsh" name="hptsh" value="OFGaT5tqXTA16JkPTD61pmrvlz0=">
										<div
											class="forgotPasswordContainer CanBePulledDown PulledIntoView"
											id="forgotPasswordDiv" tabindex="-1">
											<a href="http://www.baidu.com"
												target="_top" class="forgot-password"> 忘记密码？</a>
										</div>
										<div class="switch-service">
											<a href="https://www.evernote.com/Login.action">
												<div class="arrow">
													<img src="/images/link-arrow.jpg">
												</div>
												<div class="switch-service-message">切换到Evernote
													International</div>
											</a>
										</div>
										<input type="hidden" name="analyticsLoginOrigin"
											value="login_action"><input type="hidden"
											name="clipperFlow" value="false"><input type="hidden"
											name="showSwitchService" value="true"><input
											type="hidden" name="usernameImmutable" value="false">
										<div style="display: none;">
											<input type="hidden" name="_sourcePage"
												value="u4aE_awcMpXiMUD9T65RG_YvRLZ-1eYO3fqfqRu0fynRL_1nukNa4gH1t86pc1SP"><input
												type="hidden" name="__fp"
												value="0RO4MmivtaE3yWPvuidLz-TPR6I9Jhx8">
										</div>
									</form>
								</div>
							</div>
						</div>
					</div>
					<div id="context-switch">
						<div class="t-pico">没有帐号？</div>
						<div class="switch">
							<form method="post"
								action="https://app.yinxiang.com/Registration.action"
								id="switch-form">
								<a id="switch-link" href="http://localhost:8082/page/register">创建帐户</a> <input type="hidden"
									name="analyticsLoginOrigin" value="login_action"><input
									type="hidden" name="clipperFlow" value="false"><input
									type="hidden" name="showSwitchService" value="true"><input
									type="hidden" name="usernameImmutable" value="false">
								<div style="display: none;">
									<input type="hidden" name="_sourcePage"
										value="jeCVpg0HdeniMUD9T65RG_YvRLZ-1eYO3fqfqRu0fynRL_1nukNa4gH1t86pc1SP"><input
										type="hidden" name="__fp" value="g1Tcj0simsU=">
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
			<div class="footer wrapper">
				<a href="https://www.yinxiang.com/tos/" class="footer-entry"
					target="_blank">服务条款</a><a href="https://www.yinxiang.com/privacy/"
					class="footer-entry" target="_blank">隐私政策</a><span
					class="footer-entry last"> 版权所有2017Evernote
					Corporation。保留所有权利。</span>
			</div>
		</div>
	</div>
	<!--<![endif]-->
</body>
</html>
