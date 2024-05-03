package edu.uao.project.backend.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import edu.uao.project.backend.Model.RattingModel;
import edu.uao.project.backend.Repository.IRattingRepository;

@Service
public class RattingsServiceImp implements IRattingService {
    @Autowired
    IRattingRepository rattingRepository;
    @Override
    public String crearRatting(@RequestBody RattingModel ratting) {
        this.rattingRepository.save(ratting);
        return "El Ratting de Id: "+ratting.get_id()+" fue creado exitosamente para el curso con ID: "+ratting.getIdCurso();
    }

    public List<String> cursosRatingMayorN(Float n) {
        List<RattingModel> ratings = rattingRepository.findAll();
        List<String> cursosConRatingMayorN = ratings.stream()
                .filter(rating -> rating.getRating() > n)
                .map(RattingModel::getIdCurso)
                .collect(Collectors.toList());
    
        String mensaje = "Los IDs de los cursos con rating mayor a "+ n +" encontrados son: ";
        cursosConRatingMayorN.add(0, mensaje);
        return cursosConRatingMayorN;
    }

    
    
    
    }
    



    
     
