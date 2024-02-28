package com.DH.Charter.Test;



import com.DH.Charter.Model.Avion;
import com.DH.Charter.Service.AvionService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class AvionServiceTest {
    private static AvionService avionService = new AvionService();

    @Test
    public void InsertarAvion(){
        Avion avion = new Avion("test","test1","test1.1", LocalDate.of(2012,12,5));

        avionService.registrar(avion);
        avionService.eliminar(1);

        Assert.assertNotNull(avionService);

    }
}
