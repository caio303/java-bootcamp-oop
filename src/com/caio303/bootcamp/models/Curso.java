package com.caio303.bootcamp.models;

public class Curso extends Conteudo {
	private int cargaHoraria;
	
	public Curso(String titulo, String descricao, int cargaHoraria) {
		super(titulo, descricao);
		this.cargaHoraria = cargaHoraria;
	}
	
	public Curso(String titulo, int cargaHoraria) {
		super(titulo, "Curso");
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public double calcularXP() {
		return XP_PADRAO * cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
}
