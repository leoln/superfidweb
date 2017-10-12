<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags/template" prefix="template"%>

<template:admin>

	<jsp:attribute name="extraScripts">
		<script type="text/javascript">
			$('.nav-tabs a:first').tab('show');
			$("#tooltip").tooltip();
		</script>
	</jsp:attribute>

	<jsp:body>
		<div class="container">
		
		<br />
		
			<div class="row">
				<div class="col col-12">
					<ul class="nav nav-tabs justify-content-center">
						<li class="nav-item"><a href="#aba1" class="nav-link">Gerenciamento de Produtos</a></li>
						
						<li class="nav-item"><a href="#aba2" class="nav-link">Relatório de Vendas</a></li>
						
						<li class="nav-item navbar-right"><a href="#aba3" class="nav-link">Admin</a></li>
					</ul>
				                  
					<br />
				                  
					<div class="tab-content">
					    
						<div id="aba1" class="tab-pane" role="tabpanel">
						
							<div class="form-group row">
								<div class="col-2">
									<select class="custom-select" name="size">
										<option value="optCodigo">Cód. Produto</option>
										<option value="optNome">Nome</option>
										<option value="optMarca">Marca</option>
										<option value="optLote">Lote</option>
									</select>
								</div>
							                    
								<div class="col-8">
									<input class="form-control" id="consProduto" placeholder="Digite o que está procurando :)">
								</div>
							                    
								<div class="col-2">
									<button id="btnConsultar" class="btn btn-principal">Consultar Produto</button>
								</div>
							</div>
						
							<br />
						                 
							<div class="form-group row">
								<div class="col-6">
									<div class="input-group date" data-provide="datepicker">
										<input class="form-control" size="8" type="text" id="inpDataInicial" placeholder="Digite a data inicial">
										<div class="input-group-btn">
											<button type="button" onclick="limpar('inpDataInicial')" class="btn btn-danger">
												<i class="fa fa-times-circle" aria-hidden="true"></i>
											</button>
											<button type="button" id="btnDtInicial" onclick="mostrarDatePicker('inpDataInicial')" class="btn btn-secundario">
												<i class="fa fa-calendar" aria-hidden="true"></i>
											</button>
										</div>
									</div>
								</div>
								                    
								<div class="col-6">
									<div class="input-group date" data-provide="datepicker">
										<input class="form-control" size="8" type="text" id="inpDataFinal" placeholder="Digite a data inicial">
										<div class="input-group-btn">
											<button type="button" onclick="limpar('inpDataFinal')" class="btn btn-danger">
												<i class="fa fa-times-circle" aria-hidden="true"></i>
											</button>
											<button type="button" id="btnDtInicial" onclick="mostrarDatePicker('inpDataFinal')" class="btn btn-secundario">
												<i class="fa fa-calendar" aria-hidden="true"></i>
											</button>
										</div>
									</div>
								</div>
							</div>
						                
							<br />
						                 
							<div class="form-group row justify-content-end">
								<div class="col-1">
									<button type="button" onclick="mostrarModal('modalAdd')" class="btn btn-secundario btn-block">
										<i class="fa fa-plus" aria-hidden="true"></i>
									</button>
								</div>
							</div>
						
							<div class="modal fade" id="modalAdd" tabindex="-1" role="dialog">
								<div class="modal-dialog modal-lg" role="document">
									<div class="modal-content">--
										<div class="modal-header text-center">
											<button type="button" class="close" data-dismiss="modal" aria-label="Close">
												<span aria-hidden="true">&times;</span>
											</button>
											<h2 class="modal-title" align="center">Adicionar Produto</h2>
										</div>
										                            
										<div class="modal-body">
											<div class="form-group row">
												<div class="col-12">
													<div class="form-group row">
														<label for="inpCodigoProd" class="control-label col-2">Cód. Produto:</label>
														<div class="col-12">															    												    	
															<input class="form-control" name="codProd" id="inpCodigoProd" type="text" placeholder="Use o botão para recuperar o código do produto">
														</div>
													</div>
													<div class="form-group row justify-content-center">
														<div class="col-4">
															<button type="button" class="btn btn-secundario btn-block">Recuperar Cód. </button>
														</div>
													</div>
												</div>
											</div>
										
										</div>
										
										<br />
										<br />
										
										<div class="form-group row">
											<div class="col-12">
												<div class="col-6">
													<div class="form-group">
														<label for="nomeProd" class="control-label col-md-4">Nome Produto:</label>
														<div class="col-md-8">
															<input class="form-control input-block-level" size="8" type="text" id="nomeProd" disabled>
														</div>
													</div>
												</div>
												
												<div class="col-6">
													<div class="form-group">                  
														<label for="precoProd" class="control-label col-md-4">Preço Unitário:</label>
														<div class="col-md-8">
															<input class="form-control" size="8" type="text" id="precoProd" disabled>
														</div>
													</div>
												</div>
											</div>
										</div>
										                                
										<br />
										
										<div class="row">
										<div class="col-md-12">
										<div class="col-md-6">
										<div
										class="form-horizontal">
										                                    	
										<label for="marcaProd" class="control-label col-md-4">Marca Prod.:</label>
										<div class="col-md-8">
										<input class="form-control" size="8" type="text"
										id="marcaProd" disabled>
										</div>
										</div>
										</div>
											
										<div class="col-md-6">
										<div class="form-horizontal">
											
										<label for="inpValidadeProd"
										class="control-label col-md-4">Data Validade:</label>
										<div class="col-md-8">
										<div class="input-group">
										<input class="form-control clsDatePicker"
										size="8" type="text" id="inpValidadeProd"
										data-date-container="#modalAdd"
										data-provide="datepicker" disabled>
										<div class="input-group-btn">
										<button type="button"
										onclick="limpar('inpValidadeProd')"
										class="btn btn-default" disabled>
										<i class="fa fa-times-circle"
										aria-hidden="true"></i>
										</button>
										<button
										onclick="mostrarDatePicker('inpValidadeProd')"
										type="button" class="btn btn-default" disabled>
										<i class="fa fa-calendar"
										aria-hidden="true"></i>
										</button>
										</div>
										</div>
										</div>
										</div>
										</div>
										</div>
										</div>
										
										<br />
										
										<div class="row">
										<div class="col-md-12">
										<div class="col-md-6">
										<div class="form-horizontal">
										<label for="numLoteProd" class="control-label col-md-4">Nº do Lote.:</label>
										<div class="col-md-8">
										<input class="form-control" size="8" type="text" id="numLoteProd" disabled>
										</div>
										</div>
										</div>
										<div class="col-md-6">
										<div
										class="form-horizontal">
										<label for="unidadeProd" class="control-label col-md-4">Unidade:</label>
										<div class="col-md-8">
										<input class="form-control" size="8" type="text" id="unidadeProd" disabled>
										</div>
										</div>
										</div>
										</div>
										</div>
									</div>
								
									<div class="modal-footer">
										<button type="button" class="btn btn-default" data-dismiss="modal">Sair</button>
										<button type="button" class="btn btn-primary">Adicionar</button>
									</div>
								                             
								</div>
							</div>
						</div>
					</div>
				
					<br />
						
					<div class="row">
					<div class="col-md-12">
					<div class="table-responsive">
					<table class="table table-bordered table-striped table-hover"> <!-- table-striped table-bordered table-condensed -->
					<thead class="dark-primary-color">
					<tr class="active">
					<th class="text-center text-white">Nome</th>
					<th class="text-center text-white">Preço</th>
					<th class="text-center text-white">Marca</th>
					<th class="text-center text-white">Validade</th>
					<th class="text-center text-white">Lote</th>
					<th class="text-center text-white">Unidade</th>
					<th class="text-center text-white">Ações</th>
					    </tr>
					</thead>
					<tbody>
					<tr>
					<td class='light-primary-color'>&nbsp;</td>
					<td class='light-primary-color'>&nbsp;</td>
					<td class='light-primary-color'>&nbsp;</td>
					<td class='light-primary-color'>&nbsp;</td>
					<td class='light-primary-color'>&nbsp;</td>
					<td class='light-primary-color'>&nbsp;</td>
					<td class="light-primary-color text-center">
					<div class="btn-group" role="group" aria-label="...">
					<button type="button" class="btn btn-secundario" id="alterar">
					<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
					</button>
					<button type="button" class="btn btn-danger" onclick="removerLinha(this)" id="excluir">
					<i class="fa fa-times-circle" aria-hidden="true"></i>
					</button>
					</div>													
					</td>
					</tr>
					</tbody>
					</table>
					</div>
					</div>	
					</div>
				</div>
			</div>
		</div>				
		
	</jsp:body>

</template:admin>