package es.fplumara.dam1.talleres.service.impl;

import es.fplumara.dam1.talleres.repository.UserRepository;
import es.fplumara.dam1.talleres.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService {

    private UserRepository userRepository;
    public UsuarioServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


}
