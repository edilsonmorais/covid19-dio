package me.dio.academia.digital.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import me.dio.academia.digital.entity.Aluno;

@Repository
public interface AlunoRepository extends CrudRepository<Aluno, Long>{

}
