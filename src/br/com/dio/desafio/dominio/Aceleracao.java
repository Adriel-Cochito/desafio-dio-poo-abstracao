package br.com.dio.desafio.dominio;

public class Aceleracao extends Conteudo{

    private int cargaHoraria;
	
	@Override
	public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
	}

	public Aceleracao() {
    }

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}


    @Override
    public String toString() {
        return "Aceleracao{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
    
    
}
