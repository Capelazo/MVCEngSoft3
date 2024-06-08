package br.fatrvl.mvcdemo.controllers; //serve para produzir uma view


import br.fatrvl.mvcdemo.models.Aluno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping ("/alunos")
public class AlunoController {

    private static final List<Aluno> alunos = new ArrayList<Aluno>();

    public AlunoController() { // uma espécie de banco de dados
        alunos.add(new Aluno("111111", 10, 8, "Enzo"));
        alunos.add(new Aluno("222222", 8, 7,"Lorenzo"));
        alunos.add(new Aluno("333333", 9, 9, "Valentina"));
    }

    @GetMapping
    public String getAlunos(Model model){

        model.addAttribute("alunos", alunos);
        return "alunos";
    }
}
