package info.moraes.produtoservicedocker.controller;


import info.moraes.produtoservicedocker.model.Pizza;
import info.moraes.produtoservicedocker.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pizzas")
public class PizzaController {
    @Autowired
    private PizzaService pizzaService;

    @GetMapping
    public List<Pizza> listar(){
        return pizzaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pizza> getPizzaId(@PathVariable Long id){
        Optional<Pizza> pizza = pizzaService.findById(id);
        return pizza.isPresent() ? ResponseEntity.ok(pizza.get()) : ResponseEntity.notFound().build();
    }
    @PostMapping
    public Pizza salvarPizza(@RequestBody Pizza pizza){
        return pizzaService.save(pizza);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity excluirPizza(@PathVariable Long id){
        pizzaService.delete(id);
        return ResponseEntity.ok().build();
    }
}
