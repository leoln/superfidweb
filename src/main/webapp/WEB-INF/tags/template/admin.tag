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
			<div class="collapse navbar-collapse" id="navbarSuperfid">
                
                <img class="navbar-brand" src="<c:url value='/assets/img/logo_nav.png'/>" alt="logo">
                
				<ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <button type="button" class="btn btn-link text-white">
                            <i class="fa fa-fw fa-sign-out"></i>Sair
                        </button>
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