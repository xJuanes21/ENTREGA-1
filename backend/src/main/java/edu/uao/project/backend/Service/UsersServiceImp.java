package edu.uao.project.backend.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import edu.uao.project.backend.Model.UsersModel;
import edu.uao.project.backend.Repository.IUsersRepository;

@Service
public class UsersServiceImp implements IUsersService {
    @Autowired
    IUsersRepository usersRepository;
    @Override
    public String crearUsuario(@RequestBody UsersModel user) {
        this.usersRepository.save(user);
        return "El Usuario "+user.getNombre()+" fue creado exitosamente";
    }
    
}
