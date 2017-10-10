
$("#btnLogin").click(
	function () {
		var email = $("#txtEmail").val();
		var senha = $("#txtSenha").val();
		
		if( email != "" && senha != "") {
			
			firebase.auth().signInWithEmailAndPassword(email, senha).then(function() {
				window.location.href = "/admin"
			}).catch(function(error){
				$("#loginErro").show().text(error.message);
			});
			
		}
	}	
);