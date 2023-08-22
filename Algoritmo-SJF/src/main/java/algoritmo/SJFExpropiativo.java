package algoritmo;

public class SJFExpropiativo {
    
    public SJFExpropiativo(String[][] datos,int[][] tiempo,int tiempoTotal,int totalProgramas){
        
        setDatos(datos);
        setTiempo(tiempo);
        setTiempoTotal(tiempoTotal);
        setProgramas(totalProgramas);
        ejecucion();
    }
                
    private void ejecucion(){

        tabla=new String[getTiempoTotal()][2];
        int restante, ejecucion1=0;
        boolean val=true;
        for(int tiempoe=0;tiempoe<getTiempoTotal();tiempoe++){
            for(int x=0;x<getProgramas();x++){
                if(tiempo[x][1]==tiempoe){
                    
                    ejecucion1=x;
                    setNombrePrograma(datos[x][1]);
                    tiempo[x][2]=tiempo[x][2]-1;
                    restante=tiempo[x][2];
                    val=false;
                    espera(x,tiempoe);
                    if(restante==0 && x>0){
                        
                        cambio(x-1,tiempoe+1);
                    }
                    break;
                }
            }
            
            if(val){
                
                tiempo[ejecucion1][2]=tiempo[ejecucion1][2]-1;
                restante=tiempo[ejecucion1][2];
                espera(ejecucion1,tiempoe);
                if(restante==0 && ejecucion1>0){
                    cambio(ejecucion1-1,tiempoe+1);
                }
            }
            val=true;
            tabla[tiempoe][0]=String.valueOf(tiempoe);
            tabla[tiempoe][1]=getNombrePrograma();
        }
        
        setEspera(getEspera()/getProgramas());
        algoritmos.imprimir(getTabla());
        algoritmos.cargarTabla(getTiempoTotal(),getTabla(),getEspera());
    }

    public void espera(int x,int tiempoe){
        
        for(int y=0;y<x;y++){
            if(tiempo[y][2]>0){
                
                setEspera(getEspera()+1);
            }
        }
    }
    
    public void cambio(int x, int y){
        
        if(tiempo[x][2]>0){
                
            tiempo[x][1]=y;
        }else{
            if(x>0){
                    
                cambio(x-1,y);
            }             
        }       
    }
    
     private int getEspera(){
        
        return espera;
    }
    
    private void setEspera(int espera){
        
        this.espera=espera;
    }
    
    private void setDatos(String[][]datos){
        
        this.datos=datos;
    }
    
    private void setTiempo(int[][]tiempo){
        
        this.tiempo=tiempo;
    }
    
    private void setProgramas(int programas){
        
        this.programas=programas;
    }
    
    private void setTiempoTotal(int tiempoTotal){
        
        this.tiempoTotal=tiempoTotal;
    }
    
    private int getTiempoTotal(){
        
        return tiempoTotal;
    }
    
    private int getProgramas(){
        
        return programas;
    }
    
    private void setNombrePrograma(String nombrePrograma){
        
        this.nombrePrograma=nombrePrograma;
    }
    
    private String getNombrePrograma(){
        
        return nombrePrograma;
    }
    
    private String[][] getTabla(){
        
        return tabla;
    }
    
    private String[][]datos;
    private int [][]tiempo;
    private int tiempoTotal,programas, espera=0;
    private String nombrePrograma;    
    private String[][]tabla;
}
