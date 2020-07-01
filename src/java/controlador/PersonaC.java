package controlador;

import modelo.PersonaM;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;


@Named(value = "Anotaciones")
@SessionScoped
public class PersonaC implements Serializable {

    private PersonaM persona = new PersonaM();
    private ArrayList<PersonaM> lst = new ArrayList<>();
    private ArrayList<PersonaM> lstpersona = new ArrayList<>();
    private PersonaM seleccionPersona;

    /**
     * Creates a new instance of MbTablas
     */
    public PersonaC() {
    }

    public PersonaM getPersona() {
        return persona;
    }

    public void setPersona(PersonaM persona) {
        this.persona = persona;
    }

    public ArrayList<PersonaM> getLst() {
        return lst;
    }

    public void setLst(ArrayList<PersonaM> lst) {
        this.lst = lst;
    }

    public void agregar() {
        if (lst.contains(persona) || lstpersona.contains(persona)) {
                FacesContext.getCurrentInstance().addMessage(null, 
                        new FacesMessage(FacesMessage.SEVERITY_ERROR, "El registro ya existe ", "Dato duplicado"));
                return;
            }
        PersonaM t = new PersonaM();
        t.setDNI(persona.getDNI());
        t.setNOMBRE(persona.getNOMBRE());
        lst.add(t);
        persona = new PersonaM();
    }

    public PersonaM getSeleccionPersona() {
        return seleccionPersona;
    }

    public void setSeleccionPersona(PersonaM seleccionPersona) {
        this.seleccionPersona = seleccionPersona;
    }

    public void eliminar() {

        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i).getDNI() == seleccionPersona.getDNI()) {
                lst.remove(i);
                break;
            }
        }

        seleccionPersona = null;
    }

}
