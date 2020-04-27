<%-- 
    Document   : Login
    Created on : Mar 12, 2020, 3:25:34 PM
    Author     : Mr Loi Ho
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<meta name="description" content="">
	<meta name="author" content="">

	<title>Login Form</title>

	<!-- Bootstrap core CSS -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

	<!-- Custom styles for this template -->
	<link href="./css/login.css" rel="stylesheet">

	 <!--reference your copy Font Awesome here (from our CDN or by hosting yourself)--> 
 	<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.6.3/css/all.css"
	integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/"
	crossorigin="anonymous"> 
</head>

<body>
	<div class="login-wrap">
		<div class="login-html">
			<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Sign In</label>
			<input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">Sign Up</label>
			<div class="login-form">
				<form class="sign-in-htm" action="login" method="POST">
					<div class="group">
						<label for="user" class="label">Username: </label>
                        <input id="user" type="text" class="input" name="inpName">
					</div>
					<div class="group">
						<label for="pass" class="label">Password: </label>
						<input id="pass" type="password" class="input" data-type="password" name="inpPass">
					</div>
<!--					<div class="group">
						<input id="check" type="checkbox" class="check" checked>
						<label for="check"><span class="icon"></span> Keep me Signed in</label>
					</div>-->
					<div class="group">
						<input type="submit" class="button" value="Sign In">
					</div>
					<div class="hr"></div>
<!--					<div class="foot-lnk">
						<a href="#forgot">Forgot Password?</a>
					</div>-->
				</form>
				<form class="sign-up-htm" action="signup" method="POST">
					<div class="group">
						<label for="user" class="label">Username: </label>
						<input id="user" type="text" class="input" name="inpName">
					</div>
					<div class="group">
						<label for="pass" class="label">Password: </label>
						<input id="pass" type="password" class="input" name="inpPass" data-type="password">
					</div>
					<div class="group">
						<label for="pass" class="label">Repeat Password: </label>
						<input id="pass" type="password" name="inpRepeatPass" class="input" data-type="password">
					</div>
					<div class="group">
						<label for="pass" class="label">Email Address</label>
						<input id="pass" type="text" name="inpEmail" class="input">
					</div>
					<div class="group">
						<input type="submit" class="button" value="Sign Up">
					</div>
					<div class="hr"></div>
					<div class="foot-lnk">
						<label for="tab-1">Already Member?</a>
						</div>
					</div>
				</form>
			</div>
		</div>

		<!-- Bootstrap core JavaScript ================================================== -->
                
		<!-- Placed at the end of the document so the pages load faster -->
		<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

	</body>
	</html>
