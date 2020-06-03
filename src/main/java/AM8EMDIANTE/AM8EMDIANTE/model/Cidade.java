package AM8EMDIANTE.AM8EMDIANTE.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cidade")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private double latitude;
	private double longitude;
	
	public Long getId() {
		return id;
	}



	public String getNome() {
		return nome;
	}



	public double getLatitude() {
		return latitude;
	}



	public double getLongitude() {
		return longitude;
	}



	public List<Clima> getClima() {
		return clima;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}



	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}



	public void setClima(List<Clima> clima) {
		this.clima = clima;
	}



	@OneToMany(mappedBy = "cidade", cascade = CascadeType.ALL)
	private List<Clima> clima;
}
