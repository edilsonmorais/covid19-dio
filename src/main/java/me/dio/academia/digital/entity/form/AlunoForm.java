package me.dio.academia.digital.entity.form;

import java.time.LocalDate;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AlunoForm {
	
	@Getter @Setter private String nome;
	
	private String cpf;
	
	private String bairro;
	
	private LocalDate dataDeNascimento;
}
