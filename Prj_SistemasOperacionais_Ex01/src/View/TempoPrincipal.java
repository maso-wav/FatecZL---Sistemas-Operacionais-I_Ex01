package View;

import Controller.TempoController;

public class TempoPrincipal {
    
    public static void main (String args[]){
        
        TempoController tc = new TempoController();               
        
        tc.tempoVetorMil();
        tc.tempoVetorDezMil();
        tc.tempoVetorCemMil();        
    }    
}
