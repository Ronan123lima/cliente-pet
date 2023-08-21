package br.com.petz.clientepet.pet.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.petz.clientepet.pet.domain.Porte;
import br.com.petz.clientepet.pet.domain.SexoPet;
import br.com.petz.clientepet.pet.domain.TipoPet;
import lombok.Value;

@Value
public class PetClienteDetalheResponse {
	private UUID idPet;
	private UUID idClienteTutor;
	private String nomePet;
	private Porte porte;
	private TipoPet tipo;
	private String microchip;
	private String raca;
	private SexoPet sexo;
	private String pelagemCor;
	private LocalDate dataNascimento;
	private String rga;
	private Integer peso;
}
