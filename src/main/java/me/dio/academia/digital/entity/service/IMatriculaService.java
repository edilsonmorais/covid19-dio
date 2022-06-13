package me.dio.academia.digital.entity.service;

import java.util.List;

import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;

public interface IMatriculaService {
	
	/**
	 * Cria uma Matrícula e salva no banco de dados.
	 * @param form - formulário referente aos dados para criação da Matrícula no banco de dados.
	 * @return - Matrícula recém-criada.
	 */
	Matricula create(MatriculaForm form);
	
	/**
	 * Retorna uma Matrícula que está no banco de dados de acordo com seu Id.
	 * @param id - id da Matrícula que será exibida.
	 * @return - Matricula de acordo com o Id fornecido.
	 */
	Matricula get(Long id);
	
	/**
	 * Retorna todas as Matriculas que estao no banco de dados.
	 * @return
	 */
	List<Matricula> getAll();
	
	/**
	 * Deleta uma Matrícula específica
	 * @param id - Id da Matrícula que será removida.
	 */
	void delete(Long id);
}
