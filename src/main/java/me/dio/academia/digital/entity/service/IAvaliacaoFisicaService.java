package me.dio.academia.digital.entity.service;

import java.util.List;

import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaUpdateForm;

public interface IAvaliacaoFisicaService {
	/**
	 * Cria uma avaliacao Física e salva no banco de dados.
	 * @param form - formulário referente aos dados para criacao da Avaliacao Física no banco de dados.
	 * @return - Avaliação Física recém-criada.
	 */
	AvaliacaoFisica create(AvaliacaoFisicaForm form);
	
	/**
	 * Retorna uma avaliacao fisica que está no banco de dados de acordo com seu ID.
	 * @param id - Id da Avaliacao Fisica que será exibida.
	 * @return - Avaliação Física de acordo com o Id fornecido.
	 */
	AvaliacaoFisica get(Long id);
	
	/**
	 * Retorna todas as Avaliacoes Fisicas que estão no banco de dados.
	 * @return
	 */
	List<AvaliacaoFisica> getAll();
	
	/**
	 * Atualiza a Avaliacao Fisica
	 * @param id - id da Avaliacao Fisica que será atualizada.
	 * @param formUpdate - formulario referente aos dados necessarios para atualizacao da Avaliacao Fisica no banco de dados.
	 * @return - Avaliação Física recém-atualizada.
	 */
	AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);
	
	/**
	 * Deleta uma Avaliação Física específica.
	 * @param id - id da Avaliação Física que será removida.
	 */
	void delete(Long id);
}
