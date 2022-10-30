package com.caio303.bootcamp;

import java.time.LocalDate;

import com.caio303.bootcamp.models.Bootcamp;
import com.caio303.bootcamp.models.Curso;
import com.caio303.bootcamp.models.Dev;
import com.caio303.bootcamp.models.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso("POO com Java", 40);
		Curso curso2 = new Curso("Padrões de Projeto com Java","Singleton, Facade, Strategy...", 90);
		Mentoria mentoria = new Mentoria("Mentoria Java DIO",LocalDate.now());
		
		Bootcamp bootcampDIO =  new Bootcamp("Bootcamp Java DIO",curso1,curso2,mentoria);
		
		Dev caioAlves = new Dev("Caio");
		caioAlves.inscreverBootcamp(bootcampDIO);
		caioAlves.progredir();
		caioAlves.progredir();
		caioAlves.progredir();
		
		Dev jorge = new Dev("Jorge");
		jorge.inscreverBootcamp(bootcampDIO);
		jorge.progredir();
		jorge.progredir();
		
		System.out.println(String.format("Conteudos Concluidos de %s: %s\nXp Total: %s\n", caioAlves.getNome(),caioAlves.getConteudosConcluidos(),caioAlves.calcularTotalXP()));
		System.out.println(String.format("Conteudos Concluidos de %s: %s\nXp Total: %s\n", jorge.getNome(),jorge.getConteudosConcluidos(),jorge.calcularTotalXP()));
	}
	
}
