package AM8EMDIANTE.AM8EMDIANTE.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_clima")
@Data
@AllArgsConstructor
@NoArgsConstructor // faz praticamente tudo get set e bla bla bla
public class Clima {

	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false, length = 200)
	private int minima;

	@Column(nullable = false, length = 30)
	private int maxima;

	@Column(nullable = true, length = 100)
	private double umidade;

	@Column(nullable = true, length = 100)
	private String descricao;

	@Temporal(TemporalType.DATE)
	@Column(nullable = true, length = 100)
	private Date data;

	@ManyToOne(cascade = CascadeType.ALL)
	private Semana semana;

	@ManyToOne(cascade = CascadeType.ALL)
	private Cidade cidade;
	
	public Clima()
	{}
	
	public Clima (Long id, int minima, int maxima, double umidade, String descricao, Date data, Semana semana, Cidade cidade )
	{
		this.id = id;
		this.minima = minima;
		this.maxima = maxima;
		this.umidade = umidade;
		this.descricao = descricao;
		this.data = data;
		this.semana = semana;
		this.cidade = cidade;
		
	}
	public Long getId() {
		return id;
	}

	public int getMinima() {
		return minima;
	}

	public int getMaxima() {
		return maxima;
	}

	public double getUmidade() {
		return umidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public Date getData() {
		return data;
	}

	public Semana getSemana() {
		return semana;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setMinima(int minima) {
		this.minima = minima;
	}

	public void setMaxima(int maxima) {
		this.maxima = maxima;
	}

	public void setUmidade(double umidade) {
		this.umidade = umidade;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void setSemana(Semana semana) {
		this.semana = semana;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
}
