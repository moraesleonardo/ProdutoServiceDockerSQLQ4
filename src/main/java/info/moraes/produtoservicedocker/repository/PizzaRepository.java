package info.moraes.produtoservicedocker.repository;

import info.moraes.produtoservicedocker.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Long>{



}
