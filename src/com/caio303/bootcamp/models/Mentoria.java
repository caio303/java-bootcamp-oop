package com.caio303.bootcamp.models;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	private LocalDate data;

	public Mentoria(String titulo, String descricao, LocalDate data) {
		super(titulo, descricao);
		this.data = data;
	}
	
	public Mentoria(String titulo, LocalDate data) {
		super(titulo, "Mentoria");
		this.data = data;
	}
	
	@Override
	public double calcularXP() {
		return XP_PADRAO + 20d;
	}
	
	@Override
	public String toString() {
		return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
}
