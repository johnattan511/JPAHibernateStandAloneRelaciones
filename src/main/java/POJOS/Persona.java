package POJOS;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table
@Entity
public class Persona {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
    private String nombre;
    private String telefono;
    @ManyToMany(targetEntity=Ciudad.class)
    private Set<Ciudad> setCiudad;
    //@OneToOne
    //private Ciudad ciudad;
    
    //@ManyToOne
  //  private Ciudad ciudad;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Set<Ciudad> getSetCiudad() {
		return setCiudad;
	}
	public void setSetCiudad(Set<Ciudad> setCiudad) {
		this.setCiudad = setCiudad;
	}
	

}
