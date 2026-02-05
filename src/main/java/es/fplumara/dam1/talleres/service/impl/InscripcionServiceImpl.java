package es.fplumara.dam1.talleres.service.impl;

import es.fplumara.dam1.talleres.exception.DatosIncripcionUsuarioServiceException;
import es.fplumara.dam1.talleres.exception.DatosInscripcionTallerServiceException;
import es.fplumara.dam1.talleres.model.Inscripcion;
import es.fplumara.dam1.talleres.model.Taller;
import es.fplumara.dam1.talleres.model.Usuario;
import es.fplumara.dam1.talleres.repository.InscripcionRepository;
import es.fplumara.dam1.talleres.repository.TallerRepository;
import es.fplumara.dam1.talleres.repository.UserRepository;
import es.fplumara.dam1.talleres.service.InscripcionService;

import java.util.List;

public class InscripcionServiceImpl implements InscripcionService {

     private InscripcionRepository InscripcionRepository;
     private TallerRepository TallerRepository;
     private UserRepository UserRepository;









    @Override
    public Inscripcion inscribirUsuario(Long tallerid, Long usuarioid, String rol) {
        //1. Comprobar si el taller existe o no
        Taller Taller = TallerRepository.findById(tallerid);
        if (Taller == null) {
            throw new DatosInscripcionTallerServiceException("El taller no existe, no se encuentra");
        }
        return null;

        //2. Comprobar si el usuario existe
        Usuario usuario = UserRepository.findById(usuarioid);
        if (usuario == null) {
            throw new DatosIncripcionUsuarioServiceException("El usuario no existe, no se encuentra");
        }
    }


    @Override
    public Inscripcion cambiarRol(Long tallerid, Long usuarioid, String nuevoRol) {
        return null;
    }

    @Override
    public Inscripcion expulsarUsuario(Long tallerid, Long usuarioid) {
        return null;
    }

    @Override
    public List<Inscripcion> listarInscripcionesDETaller(Long tallerid) {
        return List.of();
    }

    @Override
    public List<Inscripcion> listarInscripcionesDeUsuario(Long Usuarioid) {
        return List.of();
    }

    @Override
    public Inscripcion verMiembrosAgrupadosPorPerfil(Long tallerid) {
        return null;
    }

    @Override
    public Inscripcion verResponsables(Long tallerid) {
        return null;
    }
}
