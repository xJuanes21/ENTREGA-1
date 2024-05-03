package edu.uao.project.backend.Service;

import java.util.List;

import edu.uao.project.backend.Model.TutorsModel;

public interface ITutorsService {
    String crearTutor(TutorsModel tutor);
    List<TutorsModel> listarTutores();
     List<TutorsModel> obtenerTutoresConCursosRatingMayorN(Float n) ;
}
