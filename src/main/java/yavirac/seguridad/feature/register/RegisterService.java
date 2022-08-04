package yavirac.seguridad.feature.register;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    @Autowired
    RegisterRepository registerRepository;

    //CRUD = Create, Read, Update, Delete

    public Register save(Register register){

        return registerRepository.save(register);
    }

    public Register findById(long id){
        return registerRepository.findById(id).orElse(new Register());
    }

    public Register update(Register register){
        return registerRepository.save(register);
    }

    public void deleteById(long id){
        registerRepository.deleteById(id);
    }
    
    public List<Register> findAll(){
        return registerRepository.findAll();
    }

    public List<Register> findByDetalle(String term){
        return registerRepository.findByDetalleLikeIgnoreCase(term+"%");
    }
}
