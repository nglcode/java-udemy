
package beans.backing;

import beans.model.Candidato;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class VacanteForm {
    
    @Inject
    private Candidato candidato;

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }
    
    public String enviar(){
        if(this.candidato.getNombre().equals("Juan")){
            return "exito";
        } else {
            return "fallo";
        }
    }
}
