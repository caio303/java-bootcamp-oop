package com.caio303.bootcamp.models;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	private String nome;
	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
	
	public Dev(String nome) {
		this.nome = nome;
	}
	
	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudosInscritos.addAll(bootcamp.getConteudos());
		bootcamp.adicionarAluno(this);
	}
	
	public void progredir() {
		Optional<Conteudo> primeiroConteudo = this.conteudosInscritos.stream().findFirst();
		if(primeiroConteudo.isPresent()) {
			this.conteudosConcluidos.add(primeiroConteudo.get());
			this.conteudosInscritos.remove(primeiroConteudo.get());
		} else {
			System.err.println(String.format("O Dev %s não está matriculado em nenhum conteúdo!",this.nome));
		}
	}
	
	public double calcularTotalXP() {
		return this.conteudosConcluidos.stream()
		.mapToDouble(Conteudo::calcularXP)
		.sum();
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}
	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}
	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}
	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluidos, conteudosInscritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
				&& Objects.equals(conteudosInscritos, other.conteudosInscritos) && Objects.equals(nome, other.nome);
	}
}
