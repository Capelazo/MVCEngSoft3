package br.fatrvl.mvcdemo.controllers;

import br.fatrvl.mvcdemo.models.Aluno;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/alunos")
public class AlunoApiController {
    private static final List<Aluno> alunos = new ArrayList<Aluno>();

    public AlunoApiController() { // uma espécie de banco de dados
        alunos.add(new Aluno("111111", 10, 8, "Enzo"));
        alunos.add(new Aluno("222222", 8, 7, "Lorenzo"));
        alunos.add(new Aluno("333333", 9, 9, "Valentina"));

    }
    @GetMapping
    public List<Aluno> getAlunos()
    {
        return alunos;
    }
}
