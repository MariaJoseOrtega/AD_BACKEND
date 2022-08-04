package yavirac.seguridad.feature.registro;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroService {
    
    @Autowired
    RegistroRepository actividadRepository;

    public Registro save(Registro actividadRegistro){

        return actividadRepository.save(actividadRegistro);
    }

    public Registro findById(long id){
        return actividadRepository.findById(id).orElse(new Registro());
    }

    public Registro update(Registro actividadRegistro){
        return actividadRepository.save(actividadRegistro);
    }

    public void deleteById(long id){
        actividadRepository.deleteById(id);
    }

    public List<Registro> findAll(){
        return actividadRepository.findAll();
    }

    public List<Registro> findByList(String term){
        return actividadRepository.findByUsuarioLikeIgnoreCase(term+"%");
    }
}
