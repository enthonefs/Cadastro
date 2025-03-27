package dev.java10x.Cadastro.Missoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/missoes")
public class MissoesController {
    @Autowired
    private MissoesService service;

    @GetMapping
    public List<MissoesModel> listarTodas(){
        return service.listarTodas();
    }

    @GetMapping("/{id}")
    public Optional<MissoesModel> buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    @PostMapping
    public MissoesModel salvar(@RequestBody MissoesModel missao){
        return service.salvar(missao);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }
}
