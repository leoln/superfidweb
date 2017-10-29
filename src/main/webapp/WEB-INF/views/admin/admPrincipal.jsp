<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib tagdir="/WEB-INF/tags/template" prefix="template"%>

<template:admin>

	<jsp:attribute name="extraScripts">
		<script type="text/javascript">
			$(function() {
				$('.nav-tabs a:first').tab('show');
			});
		</script>
	</jsp:attribute>

	<jsp:body>
		
		<div class="container">
		
			<br />
		
			<div class="row">
				<div class="col col-12">
					<ul class="nav nav-tabs justify-content-center" role="tablist">
						<li class="nav-item"><a href="#aba1" data-toggle="tab" role="tab" class="nav-link">Gerenciamento de Produtos</a></li>
						<li class="nav-item"><a href="#aba2" data-toggle="tab" role="tab" class="nav-link">Relatório de Vendas</a></li>
						<li class="nav-item"><a href="#aba3" data-toggle="tab" role="tab" class="nav-link">Admin</a></li>
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
									<input class="form-control" id="consProduto" placeholder="Digite o que está procurando de acordo com o filtro ao lado esquerdo">
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
									<div class="modal-content">
										<div class="modal-header text-center">
											<h2 class="modal-title">Adicionar Produto</h2>
                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
												<span aria-hidden="true">&times;</span>
											</button>
										</div>
										                            
										<div class="modal-body">
											<div class="form-group row justify-content-center">
                                                <div class="col align-self-center col-2">
                                                    <label class="control-label">Cód. Produto:</label>
                                                </div>
                                                <div class="col-9">
                                                    <input class="form-control" name="codProd" id="inpCodigoProd" type="text" placeholder="Use o botão para recuperar o código do produto">
								                </div>
                                            </div>
											<div class="form-group row">
												<div class="col-12">
													<div class="form-group row justify-content-center">
														<div class="col-4">
															<button type="button" class="btn btn-secundario btn-block">Recuperar Cód. </button>
														</div>
													</div>
												</div>
											</div>
										</div>
										
										<div class="form-group row">
											<div class="col-6">
												<div class="form-group">
													<label for="nomeProd" class="control-label col-12">Nome Produto:</label>
													<div class="col-12">
														<input class="form-control input-block-level" size="8" type="text" id="nomeProd" disabled>
													</div>
												</div>
											</div>
											
											<div class="col-6">
												<div class="form-group">                  
													<label for="precoProd" class="control-label col-12">Preço Unitário:</label>
													<div class="col-12">
														<input class="form-control" size="8" type="text" id="precoProd" disabled>
													</div>
												</div>
											</div>
										</div>
										
										<div class="form-group row">
                                            <div class="col-6">
                                                <div class="form-group">
                                                        <label for="marcaProd" class="control-label col-6">Marca Produto:</label>
                                                        <div class="col-12">
                                                            <input class="form-control" size="8" type="text" id="marcaProd" disabled>
                                                        </div>
                                                </div>
                                            </div>
                                            <div class="col-6">
                                                <div class="form-group">
                                                    <label for="inpValidadeProd" class="control-label col-6">Data Validade:</label>
                                                    <div class="col-12">
                                                        <div class="input-group">
                                                            <input class="form-control clsDatePicker" size="8" type="text" id="inpValidadeProd" data-date-container="#modalAdd" data-provide="datepicker" disabled>
                                                            <div class="input-group-btn">
                                                                <button type="button" onclick="limpar('inpValidadeProd')" class="btn btn-danger" disabled>
                                                                    <i class="fa fa-times-circle" aria-hidden="true"></i>
                                                                </button>
                                                                <button onclick="mostrarDatePicker('inpValidadeProd')" type="button" class="btn btn-secundario" disabled>
                                                                    <i class="fa fa-calendar" aria-hidden="true"></i>
                                                                </button>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
										</div>

										<div class="form-group row">
                                                <div class="col-6">
                                                    <label for="numLoteProd" class="control-label col-4">Lote:</label>
                                                    <div class="col-12">
                                                        <input class="form-control" size="8" type="text" id="numLoteProd" disabled>
                                                    </div>
                                                </div>
                                                <div class="col-6">
                                                    <label for="unidadeProd" class="control-label col-4">Unidade:</label>
                                                    <div class="col-12">
                                                        <input class="form-control" size="8" type="text" id="unidadeProd" disabled>
                                                    </div>
                                                </div>
										</div>
                                        
                                        <br />
                                        
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-default" data-dismiss="modal">Sair</button>
                                            <button type="button" class="btn btn-primary">Adicionar</button>
                                        </div>                                        
									</div>								                             
								</div>
							</div>
                            
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="table-responsive">
                                        <table class="table table-bordered table-striped table-hover">
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
                                            	<c:forEach items="${produto}" var="prod">
	                                                <tr>
	                                                    <td class='light-primary-color'>${prod.descricao}</td>
	                                                    <td class='light-primary-color'><fmt:formatNumber value="${prod.precoUnitario}" type="currency" /></td>
	                                                    <td class='light-primary-color'>${prod.marca}</td>
	                                                    <td class='light-primary-color'>${prod.dataValidade}</td>
	                                                    <td class='light-primary-color'>${prod.codigoLote}</td>
	                                                    <td class='light-primary-color'>${prod.unidade}</td>
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
                                                </c:forEach>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>	
                            </div>                            
						</div>
                        
                        <div class="tab-pane" id="aba2" role="tabpanel">
                            <div class="form-group row">
                                <div class="col-6">
                                    <div class="form-horizontal">
                                        <label>Data Inicial:</label>
                                        <div class="input-group date" data-provide="datepicker">
                                            <input class="form-control" size="8" type="text" id="inpDtInicialRel" placeholder="Digite a data inicial">
                                            <div class="input-group-btn">
                                                <button type="button" onclick="limpar('inpDtInicialRel')" class="btn btn-danger">
                                                    <i class="fa fa-times-circle" aria-hidden="true"></i>
                                                </button>
                                                <button type="button" id="btnDtInicial" onclick="mostrarDatePicker('inpDtInicialRel')" class="btn btn-secundario">
                                                    <i class="fa fa-calendar" aria-hidden="true"></i>
                                                </button>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="col-6">
                                    <div class="form-horizontal">
                                        <label>Data Final:</label>
                                        <div class="input-group date" data-provide="datepicker">
                                            <input class="form-control" size="8" type="text" id="inpDtFinalRel" placeholder="Digite a data inicial">
                                            <div class="input-group-btn">
                                                <button type="button" onclick="limpar('inpDtFinalRel')" class="btn btn-danger">
                                                    <i class="fa fa-times-circle" aria-hidden="true"></i>
                                                </button>
                                                <button type="button" id="btnDtInicial" onclick="mostrarDatePicker('inpDtFinalRel')" class="btn btn-secundario">
                                                    <i class="fa fa-calendar" aria-hidden="true"></i>
                                                </button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
														
							<div class="form-group row justify-content-center">
                                <div class="col-1">
                                    <button type="button" onclick="javascript:mostrarRelatorio();" id="btnRelatorio" class="btn btn-principal">Gerar Relatório </button>
                                </div>
							</div>
							
							<div class="row" id="divRelatorio" style="display: none;">
                                <div class="col-md-12">
                                    <div class="table-responsive">
                                        <table class="table table-bordered table-striped table-hover">
                                            <thead class="dark-primary-color">
                                                <tr class="active">
                                                    <th class="text-center text-white">Código</th>
                                                    <th class="text-center text-white">Data de Início</th>
                                                    <th class="text-center text-white">Data de Término</th>
                                                    <th class="text-center text-white">Preço Total</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            	<c:forEach items="${compra}" var="comp">
                                            		<c:if test="${comp.indicadorFinalizado == '1'}">
		                                                <tr>
		                                                    <td class='light-primary-color'>${comp.codigo}</td>
		                                                    <td class='light-primary-color'>${comp.dataInicio}</td>
		                                                    <td class='light-primary-color'>${comp.dataTermino}</td>
		                                                    <td class='light-primary-color'><fmt:formatNumber value="${comp.precoTotal}" type="currency" /></td>
		                                                </tr>
		                                        	</c:if>
                                                </c:forEach>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                                
                            </div>
                            
                        </div>
                        
                        <div class="tab-pane" id="aba3" role="tabpanel">
                            <div class="form-group row justify-content-center">
                                <h2 class="text-center">Cadastro de Administradores</h2>
							</div>

							<br />

							<div class="form-group row justify-content-center">
								<label class="control-label col-2" for="inpNomeAdm">Nome completo:</label>										
                                <div class="col-4">
                                    <input id="inpNomeAdm" type="text" class="form-control">
                                </div>
							</div>
														
							<div class="form-group row justify-content-center">
                                <label class="control-label col-2" for="inpAreaAdm">Área de atuação:</label>
                                <div class="col-4">
                                    <input id="inpAreaAdm" type="text" class="form-control">
                                </div>
							</div>
							
							<div class="form-group row justify-content-center">
                                <label class="control-label col-2" for="inpTelefoneAdm">Telefone com DDD:</label>										
                                <div class="col-4">
                                    <input id="inpTelefoneAdm" type="text" class="form-control">
                                </div>
							</div>
							
							<div class="form-group row justify-content-center">
                                <label class="control-label col-2" for="inpEmailAdm">E-mail:</label>										
                                <div class="col-4">
                                    <input id="inpEmailAdm" type="text" class="form-control">
                                </div>
							</div>
							
							<div class="form-group row justify-content-center">
                                <label class="control-label col-2" for="inpSenhaAdm">Senha:</label>										
                                <div class="col-4">
                                    <input id="inpSenhaAdm" type="password" class="form-control">
                                </div>
							</div>

							<div class="form-group row justify-content-center">
                                <div class="col-2">
                                    <button type="button" class="btn btn-principal btn-lg btn-block">Cadastrar</button>
                                </div>
							</div>
                        </div>
					</div>
				</div>
			</div>
		</div>
		
		<script type="text/javascript">
			function mostrarRelatorio() {
				$("#divRelatorio").show();
			}
		</script>			
		
	</jsp:body>

</template:admin>