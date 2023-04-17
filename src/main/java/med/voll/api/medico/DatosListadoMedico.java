package med.voll.api.medico;

public record DatosListadoMedico(Long id, String nombre, String especial, String documento, String email) {

    public DatosListadoMedico(Medico medico) {
        this(medico.getId(), medico.getNombre(), medico.getEspecialidad().toString(), medico.getDocumento(), medico.getEmail());

    }

}
