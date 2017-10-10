<%@attribute name="extraScripts" fragment="true"%>
<%@attribute name="extraStyles" fragment="true"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
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
		
		<!-- style -->
		<link rel="stylesheet" href="<c:url value='/assets/css/index.css'/>">
		<jsp:invoke fragment="extraStyles" />
	</head>

	<body>
		<jsp:doBody />
	
		<script src="<c:url value='/assets/js/jquery-3.2.1.min.js'/>"></script>
		<script src="<c:url value='/assets/js/jquery-ui.min.js'/>"></script>
		<script src="<c:url value='/assets/js/popper.min.js'/>"></script>
		<script src="<c:url value='/assets/js/bootstrap.min.js'/>"></script>
		
		<jsp:invoke fragment="extraScripts" />
	
	</body>
</html>