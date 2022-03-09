package br.com.dio.desafio.dominio;

public class Labs extends Conteudo {

	private int cargaHoraria;

	@Override
	public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
	}

	public Labs() {
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Labs{" +
				"titulo='" + getTitulo() + '\'' +
				", descricao='" + getDescricao() + '\'' +
				", cargaHoraria=" + cargaHoraria + 
				'}';
	}
}
