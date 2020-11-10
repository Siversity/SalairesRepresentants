/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package representation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Stéphane
 */
public class TestZoneGeographique {
    
    private static final float INDEMNITE_ILEDEFRANCE = 500f;
    private ZoneGeographique ile_de_france;
    
    @BeforeEach
    public void setUp() {
        ile_de_france = new ZoneGeographique(4, "Ile de France");
        ile_de_france.setIndemniteRepas(INDEMNITE_ILEDEFRANCE);
    }
    
    @Test
    public void testConstructeur() {
        assertEquals(4, ile_de_france.getNumero());
        assertEquals("Ile de France", ile_de_france.getNom());
    }
    
    @Test
    public void testToString() {
        assertEquals("ZoneGeographique{numero=4, nom=Ile de France, indemniteRepas=500.0}", ile_de_france.toString());
    }
}
