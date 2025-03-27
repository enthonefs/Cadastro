package dev.java10x.Cadastro.Missoes;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class MissoesService {
    @Autowired
    private MissoesRepository repository;

    public List<MissoesModel> listarTodas() {
        return repository.findAll();
    }

    public Optional<MissoesModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public MissoesModel salvar(MissoesModel missao) {
        return repository.save(missao);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

}
