package br.com.petz.clientepet.cliente.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ClienteResponse {
	private UUID idCliente;

	public static ClienteResponseBuilder builder() {
		// TODO Auto-generated method stub
		return null;
	}


}
