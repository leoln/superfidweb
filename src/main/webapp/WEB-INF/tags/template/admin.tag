<%@attribute name="extraScripts" fragment="true"%>
<%@attribute name="extraStyles" fragment="true"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0" >
		
		<title>SupeRFiD Admin</title>
				
		<link rel="shortcut icon" type="image/png" sizes="32x32" href="<c:url value='/assets/img/favicon_tsp.png'/>" >
		
		<!-- Adicionar CSS Bootstrap -->
		<link rel="stylesheet" href="<c:url value='/assets/css/bootstrap.min.css'/>" media="screen" >
		
		<!-- adicionar CSS Font Awesome -->
		<link rel="stylesheet" href="<c:url value='/assets/css/font-awesome.min.css'/>" media="screen" >
		
		<!-- adicionar CSS JQuery UI -->
		<link rel="stylesheet" href="<c:url value='/assets/css/jquery-ui.min.css'/>" media="screen" >
		<link rel="stylesheet" href="<c:url value='/assets/css/jquery-ui.structure.min.css'/>" media="screen" >
        <link rel="stylesheet" href="<c:url value='/assets/css/jquery-ui.theme.min.css'/>" media="screen" >
		
		<link rel="stylesheet" href="<c:url value='/assets/css/adm-principal.css'/>" media="screen" >
		<link rel="stylesheet" href="<c:url value='/assets/css/palette.css'/>" media="screen" >
		
		<jsp:invoke fragment="extraStyles" />
	</head>

	<body>
	
		<!-- INICIO NAV -->
		<nav class="navbar navbar-expand-lg dark-primary-color">
			<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSuperfid" aria-controls="navbarSuperfid" aria-expanded="false" aria-label="Toggle navigation">
  				<i class="fa fa-bars fa-lg text-white" aria-hidden="true"></i>
			</button>

			<div class="collapse navbar-collapse justify-content-md-center" id="navbarSuperfid">
				<ul class="navbar-nav">
				    <li class="nav-item">
				      	<a class="nav-link text-white" href="#"><i class="fa fa-home text-white" aria-hidden="true"></i> Home </a>
				    </li>
					<li class="nav-item dropdown">
					    <a class="nav-link text-white" href="#" id="dropdownSuperfid" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
					    	<i class="fa fa-chevron-circle-down text-white" aria-hidden="true"></i> Curiosidades
					    </a>
					    <div class="dropdown-menu" aria-labelledby="dropdownSuperfid">
						    <label class="dropdown-header">Infos Especiais</label>
						    <a class="dropdown-item" href="#">Quem somos</a>
						    <a class="dropdown-item" href="#">Sair</a>
					    </div>
					</li>
				</ul>
			</div>
		</nav>
		<!-- FINAL NAV -->
		
		<jsp:doBody />
	
		<script src="<c:url value='/assets/js/jquery-3.2.1.min.js'/>"></script>
		<script src="<c:url value='/assets/js/jquery-ui.min.js'/>"></script>
		<script src="<c:url value='/assets/js/popper.min.js'/>"></script>
		<script src="<c:url value='/assets/js/bootstrap.min.js'/>"></script>
		<script src="<c:url value='/assets/js/main.js'/>"></script>
		
		<jsp:invoke fragment="extraScripts" />
	</body>
</html>