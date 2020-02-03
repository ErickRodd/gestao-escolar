package com.hbsis.controle.escolar.notas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface INotaRepository extends JpaRepository<Nota, Long> {
    List<Nota> findByAluno_Id(Long id);
}
