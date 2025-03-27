package dev.java10x.Cadastro.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class NinjaService {
    @Autowired
    private NinjaRepository repository;

    public List<NinjaModel> listarTodos(){
        return repository.findAll();
    }

    public Optional<NinjaModel> buscarPorId(Long id){
        return repository.findById(id);
    }

    public NinjaModel salvar(NinjaModel ninja){
        return repository.save(ninja);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }
}
