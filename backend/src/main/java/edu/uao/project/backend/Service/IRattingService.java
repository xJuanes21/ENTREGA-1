package edu.uao.project.backend.Service;


import java.util.List;

import edu.uao.project.backend.Model.RattingModel;

public interface IRattingService {
    String crearRatting(RattingModel ratting);
     List<String> cursosRatingMayorN(Float n);
    
}
