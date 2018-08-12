package Principal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import POJOS.Ciudad;
import POJOS.Persona;

public class Principal {
	
   public static void main(String[] args){
	   
	   EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJPARelacionesEjercicio");
	   EntityManager em = emf.createEntityManager();
	   
	   em.getTransaction().begin();
	   
	   Set<Ciudad> setCiudad = new HashSet<>();

	   Ciudad ciudad = new Ciudad();
	   ciudad.setNombre("Bogota");
	   em.persist(ciudad);
	   setCiudad.add(ciudad);
	   ciudad = new Ciudad();
	   ciudad.setNombre("Medellin");
	   em.persist(ciudad);
	   setCiudad.add(ciudad);
	   ciudad = new Ciudad();
	   ciudad.setNombre("Barranquilla");
	   em.persist(ciudad);
	   setCiudad.add(ciudad);
	   ciudad = new Ciudad();
	   ciudad.setNombre("Cali");
	   em.persist(ciudad);
	   setCiudad.add(ciudad);
	   ciudad = new Ciudad();
	   ciudad.setNombre("Pereira");
	   em.persist(ciudad);
	   setCiudad.add(ciudad);
	   
	   
	   Persona persona = new Persona();
	   persona.setNombre("Johnattan Zambrano");
	   persona.setTelefono("301253308");
	   ciudad = em.find(Ciudad.class, 1);
	   persona.setSetCiudad(setCiudad);
	   em.persist(persona);
	   
	   persona = new Persona();
	   persona.setNombre("Carolina Sevilla");
	   persona.setTelefono("451515");
	   ciudad = em.find(Ciudad.class, 1);
	   persona.setSetCiudad(setCiudad);
	   em.persist(persona);
	   

  
       em.getTransaction().commit();
       
       em.close();
       emf.close();

   }
}
