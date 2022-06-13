package me.dio.academia.digital.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import me.dio.academia.digital.entity.AvaliacaoFisica;

@Repository
public interface AvaliacaoFisicaRepository extends CrudRepository<AvaliacaoFisica, Long>{

}
