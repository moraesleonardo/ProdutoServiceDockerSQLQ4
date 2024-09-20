package info.moraes.produtoservicedocker.service;


import info.moraes.produtoservicedocker.model.Pizza;
import info.moraes.produtoservicedocker.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PizzaService {
    @Autowired
    private PizzaRepository pizzaRepository;

    public List<Pizza> findAll(){
        return pizzaRepository.findAll();
    }

    public Optional<Pizza> findById(Long id){
        return pizzaRepository.findById(id);
    }
    public Pizza save(Pizza pizza) {
        return pizzaRepository.save(pizza);
    }
    public void delete(Long id){
        pizzaRepository.deleteById(id);
    }

}
