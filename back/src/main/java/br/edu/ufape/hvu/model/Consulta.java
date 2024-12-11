package br.edu.ufape.hvu.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;
import br.edu.ufape.hvu.model.enums.TipoFicha;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Getter @Setter @NoArgsConstructor @AllArgsConstructor 
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public  class Consulta  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private long id;
	private Double pesoAtual;
	private Double idadeAtual;
	private boolean tipo;
	private boolean proximaConsulta;
	private TipoFicha tipoFicha;
	@ManyToOne
	@ToString.Exclude
	private Medico medico;
	@ManyToMany
	@JoinColumn(name = "consulta_id")
	@ToString.Exclude
	private List<Estagiario> estagiario;
	@ManyToOne
	@ToString.Exclude
	private Animal animal;
	@ManyToOne
	@ToString.Exclude
	private Ficha ficha;
	@DateTimeFormat(pattern = "dd/MM/yyyy hh:mm")
	private LocalDateTime dataVaga;
}