package Controller;

public class TempoController {
    
    public TempoController(){
        
        super();
        
    }
    
    public void tempoVetorMil(){
        
        double tempoInicial = System.nanoTime();
        
        int[] vetor = new int[1000];
        
        for(int i = 0; i < 1000; i++){
            
            vetor[i] = 0;
        }
        
        double tempoFinal = System.nanoTime();
        double tempoTotal = tempoFinal - tempoInicial;
        
        tempoTotal = (tempoTotal / Math.pow(10, 9));
        
        System.out.println("Vetor de 1000 posições - Tempo de Processamento => " + String.format("%, 2f", tempoTotal) + "s.");
    }
    
    public void tempoVetorDezMil(){
        
        double tempoInicial = System.nanoTime();
        
        int[] vetor = new int[10000];
        
        for(int i = 0; i < 10000; i++){
            
            vetor[i] = 0;
        }
        
        double tempoFinal = System.nanoTime();
        double tempoTotal = tempoFinal - tempoInicial;
        
        tempoTotal = (tempoTotal / Math.pow(10, 9));
        
        System.out.println("Vetor de 10000 posições - Tempo de Processamento => " + String.format("%, 2f", tempoTotal) + "s.");
    }
    
    public void tempoVetorCemMil(){
        
        double tempoInicial = System.nanoTime();
        
        int[] vetor = new int[100000];
        
        for(int i = 0; i < 100000; i++){
            
            vetor[i] = 0;
        }
        
        double tempoFinal = System.nanoTime();
        double tempoTotal = tempoFinal - tempoInicial;
        
        tempoTotal = (tempoTotal / Math.pow(10, 9));
        
        System.out.println("Vetor de 100000 posições - Tempo de Processamento => " + String.format("%, 2f", tempoTotal) + "s.");
    }
    
   }
