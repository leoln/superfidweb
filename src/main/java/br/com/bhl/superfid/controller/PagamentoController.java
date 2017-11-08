package br.com.bhl.superfid.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import br.com.bhl.superfid.model.Pagamento;
import br.com.bhl.superfid.service.IPagamentoService;

@Controller
@RequestMapping("/pagamento")
public class PagamentoController {
	
	Logger logService = LoggerFactory.getLogger(PagamentoController.class);
	
	@Autowired
	IPagamentoService pagamentoService;

	@Autowired
	Gson gson;

	@RequestMapping(value = "/isPagamentoSuccess", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String produtoParseJson(String json) {
		boolean isCompraOk = false;
		String indicadorPagamento = "";
		Pagamento pagamentoRecebido = gson.fromJson(json, Pagamento.class);
		
		logService.info(json);
		
		Pagamento pagamentoVerificado = pagamentoService.getProdutoByCodigoUsuario(pagamentoRecebido.getCodigoUsuario());
		
		if ( pagamentoRecebido.getCompra().getPrecoTotal() <= Double.parseDouble( pagamentoVerificado.getLimiteCartao() ) ) {
			isCompraOk = true;
		}
		
		if( isCompraOk ) {
			indicadorPagamento = "sucesso";
		} else {
			indicadorPagamento = "fracasso";
		}
		
		return indicadorPagamento;	
	}

}
