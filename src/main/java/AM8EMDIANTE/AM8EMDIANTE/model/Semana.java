package AM8EMDIANTE.AM8EMDIANTE.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_semana")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Semana implements Serializable {
	
	private static final long serialVersionUID = 7L;
	
	@Id
	@GeneratedValue
	private Long id;
	private String semana;
	
	public Long getId() {
		return id;
	}



	public String getSemana() {
		return semana;
	}



	public List<Clima> getClima() {
		return clima;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public void setSemana(String semana) {
		this.semana = semana;
	}



	public void setClima(List<Clima> clima) {
		this.clima = clima;
	}



	@OneToMany (mappedBy = "semana", cascade = CascadeType.ALL)
	private List <Clima> clima;
}
