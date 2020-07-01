package modelo;

import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.ToString;
import lombok.Value;

@EqualsAndHashCode(exclude = {"NOMBRE"})
@ToString

public class PersonaM {

    @NonNull
    private Integer DNI;
    @NonNull
    private String NOMBRE;

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }





}
