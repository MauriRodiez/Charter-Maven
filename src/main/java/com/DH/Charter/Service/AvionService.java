package com.DH.Charter.Service;


import com.DH.Charter.Implement.AvionDAOH2;
import com.DH.Charter.Implement.IDao;
import com.DH.Charter.Model.Avion;

import java.util.List;

public class AvionService {

    private IDao<Avion> avionIDao;

    public AvionService(){
        this.avionIDao = new AvionDAOH2();
    }

    // Insertar o registrar un avion
    public Avion registrar(Avion avion){
        return avionIDao.registrar(avion);
    }

    //Buscar por ID
    public Avion buscarXID(int id){
        return avionIDao.buscar(id);
    }

    // Eliminar registro
    public void eliminar(int id){
        avionIDao.eliminar(id);
    }

    // Buscar todos
    public List<Avion> buscarTodos(){
        return avionIDao.buscarTodos();
    }
}
