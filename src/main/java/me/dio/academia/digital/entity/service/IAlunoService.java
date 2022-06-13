package me.dio.academia.digital.entity.service;

import java.util.List;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.entity.form.AlunoUpdateForm;

public interface IAlunoService {
	/**
	 * Cria um aluno e salva no banco de dados.
	 * @param form - 
	 * @return
	 */
	Aluno create(AlunoForm form);
	
	/**
	 * Retorna um aluno que está no banco de dados de acordo com seu Id.
	 * @param id - 
	 * @return
	 */
	Aluno get(Long id);
	
	/**
	 * Retorna todos os alunos que estão no banco de dados.
	 * @return - Uma lista de alunos que estão salvas no BD.
	 */
	List<Aluno> getAll();
	
	/**
	 * Atualiza o Aluno
	 * @param id - id do Aluno que será atualizada.
	 * @param formUpdate - formulario referente aos dados necessarios para atualizacao do Aluno no banco de dados;
	 * @return - Aluno recém-atualizado.
	 */
	Aluno update(Long id, AlunoUpdateForm formUpdate);
	
	/**
	 * Deleta um Aluno específico.
	 * @param id - id do Aluno que será removido.  
	 */
	void delete(Long id);
	
	List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);
}
