package algoritmo;
import Programa.datosPrograma;
import Programa.quantum;
import resultados.resultados;

public class algoritmos {
    
    public algoritmos(int cantidadProgramas,int algoritmo){
        
        setCantidadProgramas(cantidadProgramas);
        setAlgoritmo(algoritmo);
        iniciarVectores();
        cargarProgramas();
    }

    private void iniciarVectores(){
        
        datos=new String[getCantidadProgramas()][2];
        tiempo=new int [getCantidadProgramas()][3];
    }
    
    private static void cargarProgramas(){
        
        datosPrograma dp = new datosPrograma(getPro()+1,getAlgoritmo());
    }
    
    public static void siguiente(){
        
        cargarDatos();
        cargarTiempos();
        setPro(getPro()+1);
        if(getPro()<getCantidadProgramas()){
            
            cargarProgramas();
        }else{
            if (getAlgoritmo()==3){
                java.awt.EventQueue.invokeLater(() -> {
                    new quantum().setVisible(true);
                });
            }else{
            ejecucion();
            }
        }
    }
    
    public static void ejecucion(){
        
        int tiempoTotal=0;
        for(int x=0;x<getCantidadProgramas();x++){
            
            tiempoTotal=tiempoTotal+tiempo[x][2];
        }
        System.out.println("tiempo total: "+tiempoTotal);

        switch (getAlgoritmo()){
            case 1 -> {
                SJFExpropiativo al = new SJFExpropiativo(getDatos(),getTiempos(),tiempoTotal,getCantidadProgramas());
            }
            case 2 -> {
                algoritmosjf sjf = new algoritmosjf(getDatos(),getTiempos(),tiempoTotal,getCantidadProgramas());
            }
            case 3 -> {
                robin rb = new robin(getDatos(),getTiempos(),tiempoTotal,getCantidadProgramas(),getQuantum());
            }
        }
    }
    
    public static void cargarTabla(int total, String[][]tabla,int tiempoEspera){
        
        java.awt.EventQueue.invokeLater(() -> {
            new resultados(tabla,total,tiempoEspera).setVisible(true);
        });
    }

    public static void imprimir(String [][]x){
        if(getAlgoritmo()==3){
            System.out.println(" - "+"tiempo"+" - "+" quantum "+" - "+"programa"+" - ");
        }else{
            System.out.println(" - "+"tiempo"+" - "+"programa"+" - ");
        }
        for(int y=0;y<x.length;y++){
            try{
                Thread.sleep(1000);
                if(getAlgoritmo()==3){
                    System.out.println(" -   "+y+"      -   "+x[y][2]+"   -   "+x[y][1]+"  - ");
                }else{
                    System.out.println("  - "+y+"    -  "+x[y][1]+"    - ");
                }    
            }catch(InterruptedException ex){
                
            }
        }
    }
    
    public static void datos(String nombrePrograma, int tiempoInicio, int tiempoEjecucion){
        
        setNombrePrograma(nombrePrograma);
        setTiempoInicio(tiempoInicio);
        setTiempoEjecucion(tiempoEjecucion);
    }
    
    private static void cargarTiempos(){
        
        tiempo[getPro()][0]=getPro()+1;
        tiempo[getPro()][1]=getTiempoInicio();
        tiempo[getPro()][2]=getTiempoEjecucion();
    }
    
    private static void cargarDatos(){
        
        datos[getPro()][0]=String.valueOf(getPro()+1);
        datos[getPro()][1]=getNombrePrograma();
    }
    
        private static int[][] getTiempos(){
        
        return tiempo;
    }
    
    private static String[][] getDatos(){
        
        return datos;
    }
    
    private static void setNombrePrograma(String nombrePrograma){
        
        algoritmos.nombrePrograma=nombrePrograma;
    }
    
    private static String getNombrePrograma(){
        
        return nombrePrograma;
    }
    
    private static void setPro(int pro){
        
        algoritmos.pro=pro;
    }
    
    private static int getPro(){
        
        return pro;
    }
    
    private static void setTiempoInicio(int tiempoInicio){
        
        algoritmos.tiempoInicio=tiempoInicio;
    }
    
    private static int getTiempoInicio(){
        
        return tiempoInicio;
    }
    
    private static void setTiempoEjecucion(int tiempoEjecucion){
        
        algoritmos.tiempoEjecucion=tiempoEjecucion;
    }
    
    private static int getTiempoEjecucion(){
        
        return tiempoEjecucion;
    }
    
    private static void setCantidadProgramas(int cantidadProgramas){
        
        algoritmos.cantidadProgramas=cantidadProgramas;
    }
    
    private static int getCantidadProgramas(){
        
        return cantidadProgramas;
    }
    
    private static void setAlgoritmo(int algoritmo){
        
        algoritmos.algoritmo=algoritmo;
    }
    
    private static int getAlgoritmo(){
        
        return algoritmo;
    }
    
    public static void setQuantum(int quantum){
        
        algoritmos.quantum=quantum;
    }
    
    private static int getQuantum(){
        
        return quantum;
    }
    
    private static String datos[][];
    private static int tiempo [][];
    private static String nombrePrograma;
    private static int pro=0,tiempoInicio,tiempoEjecucion, cantidadProgramas, algoritmo, quantum;
}
