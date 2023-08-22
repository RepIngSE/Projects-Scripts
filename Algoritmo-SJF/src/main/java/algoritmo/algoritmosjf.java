package algoritmo;

public class algoritmosjf {
    
    public algoritmosjf(String[][] datos,int[][] tiempo,int tiempoTotal,int totalProgramas){
        
        setDatos(datos);
        setTiempo(tiempo);
        setTiempoTotal(tiempoTotal);
        setProgramas(totalProgramas);
        ejecucion();
    }
    
    private void ejecucion(){
       
        tabla=new String[getTiempoTotal()][2];
        
        int programa=0;
        for(int tiempoe=0;tiempoe<getTiempoTotal();tiempoe++){            

            tiempo[programa][2]=tiempo[programa][2]-1;
            setNombrePrograma(datos[programa][1]);
            if(tiempo[programa][2]==0 && programa+1<getProgramas()){
                programa++;
                espera(tiempoe,tiempo[programa][1]);
            }
            tabla[tiempoe][0]=String.valueOf(tiempoe);
            tabla[tiempoe][1]=getNombrePrograma();
        }
        setEspera(getEspera()/getProgramas());
        algoritmos.imprimir(getTabla());
        algoritmos.cargarTabla(getTiempoTotal(),getTabla(),getEspera());
    }
    
    private void espera(int actual, int tiempoi){
        
        setEspera(getEspera()+(actual-tiempoi));
    }
    
    private int getEspera(){
        
        return espera;
    }
    
    private  void setEspera(int espera){
        
        this.espera=espera;
    }
    
    private String[][] getTabla(){
        
        return tabla;
    }
    
    private int getProgramas(){
        
        return programas;
    }
    
    private int getTiempoTotal(){
        
        return tiempoTotal;
    }
    
    private void setProgramas(int programas){
        
        this.programas=programas;
    }
    
    private void setTiempoTotal(int tiempoTotal){
        
        this.tiempoTotal=tiempoTotal;
    }
    
    private void setTiempo(int[][]tiempo){
        
        this.tiempo=tiempo;
    }
    
    private void setDatos(String[][]datos){
        
        this.datos=datos;
    }
    
    private void setNombrePrograma(String nombrePrograma){
        
        this.nombrePrograma=nombrePrograma;
    }
    
    private String getNombrePrograma(){
        
        return nombrePrograma;
    }
    
    private String[][]datos;
    private int [][]tiempo;
    private int tiempoTotal,programas, espera=0;
    private String nombrePrograma;
    private String[][]tabla;  
}