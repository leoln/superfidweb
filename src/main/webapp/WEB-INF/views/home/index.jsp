<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags/template" prefix="template" %>

<template:commons>

	<jsp:attribute name="extraStyles">
		<style type="text/css">
			#loginErro {
				display: none;
			}
			.fa-spinner {
				display: none;
			}
		</style>
	</jsp:attribute>
	
	<jsp:attribute name="extraScripts">
		<script src="https://www.gstatic.com/firebasejs/4.5.0/firebase.js"></script>
		<script>
			// Initialize Firebase
			var config = {
			  apiKey: "AIzaSyCyvO9GZuSnl1ZKTGi3xJ4Ioh7zZfHB4QU",
			  authDomain: "superfidapp-8695.firebaseapp.com",
			  databaseURL: "https://superfidapp-8695.firebaseio.com",
			  projectId: "superfidapp-8695",
			  storageBucket: "superfidapp-8695.appspot.com",
			  messagingSenderId: "873164849506"
			};
			firebase.initializeApp(config);
		</script>
		
		<script src="<c:url value='/assets/js/index.js'/>"></script>
	</jsp:attribute>
		
	<jsp:body>
		<div class="container">
			<div class="row">
				
				<div class="col-md-6">
					
					<div class="col-sm-offset-2 col-md-offset-2 col-sm-10 col-md-10 col-xs-12 text-center">
						<img alt="Imagem principal" class="img-responsive" src="<c:url value='/assets/img/logo_web.png'/>">
					</div>
				</div>
				
				<div class="col-md-6">
					<div class="form-signin">
						<h3>Acesse o Portal</h3>
						<div class="input-group margin-bottom-sm">
							<span class="input-group-addon"><i class="fa fa-user-circle fa-fw" aria-hidden="true"></i></span>
							<input class="form-control" type="text" placeholder="E-mail" name="email" id="txtEmail">
						</div>
						
						<br/>
	
						<div class="input-group margin-bottom-sm">
						  	<span class="input-group-addon"><i class="fa fa-key fa-fw" aria-hidden="true"></i></span>
					  		<input class="form-control" type="password" placeholder="Senha" name="senha" id="txtSenha">
						</div>
	
						<br />
						<button name="btnLogin" id="btnLogin" class="btn btn-lg btn-success btn-block">
							<i class="fa fa-sign-in" aria-hidden="true"></i>
							Entrar
						</button>
						<i class="fa fa-spinner fa-pulse fa-3x fa-fw"></i>
						<span class="sr-only">Loading...</span>
						
						<br/>
						<br/>
						
						<p id="loginErro">Erro</p>
					</div>
				</div>
			</div>
		</div>
		<!-- /container -->
	</jsp:body>
</template:commons>
