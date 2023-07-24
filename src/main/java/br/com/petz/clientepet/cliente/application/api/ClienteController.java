package br.com.petz.clientepet.cliente.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.petz.clientepet.cliente.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ClienteController implements ClienteAPI {
	private final ClienteService clienteService;

	@Override
	public ClienteResponse postCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteController - postCliente");
		ClienteResponse clienteCriado = clienteService.criaCliente(clienteRequest);
		log.info("[finaliza] ClienteController - postCliente");
		return clienteCriado;
	}

	@Override
	public List<ClienteListResponse> getTodosClientes() {
		log.info("[inicia] ClienteController - getTodosClientes");
		List<ClienteListResponse> clientes = clienteService.buscaTodosClientes();
		log.info("[finaliza] ClienteController - getTodosClientes");
		return clientes;
	}

	@Override
	public ClienteDetalhadoResponse getClientesAtravesId(UUID idCliente) {
		log.info("[inicia] ClienteController - getClientesAtravesId");
		log.info("[idCliente] {}", idCliente);
		ClienteDetalhadoResponse ClienteDetalhado = clienteService.buscaClienteAtravesId(idCliente);
		log.info("[finaliza] ClienteController - getClientesAtravesId");
		return ClienteDetalhado;
	}

	@Override
	public void deletaClientesAtravesId(UUID idCliente) {
		log.info("[inicia] ClienteController - deletaClientesAtravesId");
		log.info("[idCliente] {}", idCliente);
		clienteService.deletalienteAtravesId(idCliente);
		log.info("[finaliza] ClienteController - deletaClientesAtravesId");

	}
}
