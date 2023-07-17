
package intentobasedatos2.persistencia;

import intentobasedatos2.logica.Persona;

public class ControladoraPersistencia {

    public void agregarPersona(Persona persona) {
        
        PersonaJpaController personaJpa = new PersonaJpaController();
        
        personaJpa.create(persona);

    }
    
}
