package dev.java10x.Cadastro.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class NinjaController {
    @Autowired
    private NinjaService service;

    @GetMapping
    public List<NinjaModel> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<NinjaModel> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public NinjaModel salvar(@RequestBody NinjaModel ninja) {
        return service.salvar(ninja);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
