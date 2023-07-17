
package intentobasedatos2.logica;

import intentobasedatos2.persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void agregarPersona(String nombre, String edad) {
        Persona persona = new Persona();
        persona.setNombre(nombre);
        persona.setEdad(0);
        controlPersis.agregarPersona(persona);
    }
    
}
