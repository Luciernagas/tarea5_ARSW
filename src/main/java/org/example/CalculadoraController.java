package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculadoraController {
    @Autowired
    ValorAnterior valorAnterior;

    @GetMapping("/add")
    public String add(@RequestParam(name = "number", required = false, defaultValue = "0") String valor, Model model){
        model.addAttribute("valor", valor);
        valorAnterior.setValorAnterior(valorAnterior.getValorAnterior() + Double.parseDouble(valor));
        model.addAttribute("resultado", valorAnterior.getValorAnterior());
        return "calculadora";
    }

    @GetMapping("/mult")
    public String mult(@RequestParam(name = "number", required = false, defaultValue = "0") String valor, Model model){
        model.addAttribute("valor", valor);
        valorAnterior.setValorAnterior(valorAnterior.getValorAnterior() * Double.parseDouble(valor));
        model.addAttribute("resultado", valorAnterior.getValorAnterior());
        return "calculadora";
    }

    @GetMapping("/rest")
    public String rest(@RequestParam(name = "number", required = false, defaultValue = "0") String valor, Model model){
        model.addAttribute("valor", valor);
        valorAnterior.setValorAnterior(valorAnterior.getValorAnterior() - Double.parseDouble(valor));
        model.addAttribute("resultado", valorAnterior.getValorAnterior());
        return "calculadora";
    }

    @GetMapping("/div")
    public String div(@RequestParam(name = "number", required = false, defaultValue = "0") String valor, Model model){
        model.addAttribute("valor", valor);
        valorAnterior.setValorAnterior(valorAnterior.getValorAnterior() / Double.parseDouble(valor));
        model.addAttribute("resultado", valorAnterior.getValorAnterior());
        return "calculadora";
    }

    @GetMapping("/ac")
    public String ac(Model model){
        valorAnterior.setValorAnterior(0);
        model.addAttribute("valor", valorAnterior.getValorAnterior());
        return "calculadora";
    }

    @GetMapping("/calc")
    public String defaultCalc(){
        System.out.println("defaultcalc");
        return "calculadora";
    }

}
