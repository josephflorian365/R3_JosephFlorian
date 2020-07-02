package modelo;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

@EqualsAndHashCode(exclude = {"NOMBRE"})
@ToString
@NoArgsConstructor
public class PersonaM {

    @NonNull
    private Integer DNI;
    @NonNull
    private String NOMBRE;
    @NonNull
    private String EMAIL;

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

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }





}
