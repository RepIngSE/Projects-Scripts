package algoritmo;

public class robin {
 
    /* 
    se ingresan los siguientes datos, datos hace referencia a una matriz definicion datos[cantidad de programas][2]
    datos[indice del programa ejemplo 1 de programa 1][nombre del programa]
    tiempo hace referencia a una matriz definicion tiempo [cantidad de programas] [3]
    tiempo[indice del programa ejemplo 1 de programa 1][no aplica][tiempo de ejecucion]
    tiempo total se itera la matriz tiempo[indice del programa][2  en este caso se almacena los tiempos en esa columna]
    y se suman en una variable, obteniendo el tiempo total de ejecuacucion
    total programas es la cantidad de programas ingresados
    quantum es... bueno se ingresa el quantum
    */
    public robin(String[][] datos,int[][] tiempo,int tiempoTotal,int totalProgramas, int quantum){
        // se almacena cada argumento ingresado en su respectiva variable
        
        //se almacenan los datos de los diferentes programas
        setDatos(datos);
        //se almacena el quantum definido
        setQuantum(quantum);
        //se almacenan los tiempos de cada programa
        setTiempo(tiempo);
        //se almacena el tiempo total
        setTiempoTotal(tiempoTotal);
        //se almacena la cantidad de programas
        setProgramas(totalProgramas);
        //se ejecuta el algoritmo round robin
        ejecucion();
    }
    
    private void ejecucion(){
        //base de la impresion por consola
        System.out.println(" - "+"tiempo"+" - "+" quantum "+" - "+"programa"+" - ");
        //ignorar jajaja
        tabla=new String[getTiempoTotal()][3];
        //se inician las siguientes variables en 0
        int nquantum=0;
        //con esta variable nos refereimos al programa que se ejecuta para el primero es 0 ya que en el matriz el indice del primero es 0
        int programa=0;
        //va a realizar el conteo del tiempo de ejecucion
        int tiempoe=0;
        
        //mientras el tiempoe que hace referencia al tiempo en ejecucion, sea menor que el tiempo total
        
        while(tiempoe<getTiempoTotal()){
            //entonces a quantum le sumamos uno
            nquantum++;
            //si la variable quantum es mayor al quantum definido al principio
            if(nquantum>getQuantum()){
                //entonces nquantum vuelve a se uno y sumamos 1 a programa es decir pasamos al siguente programa
                nquantum=1;
                programa++;
            }
            //en el caso de que sean 5 programas y la variable programa sea 4 entonces se reinicia el conteo es decir vuelve a iniciar desde el primer programa y reiniciamos el quantum
            if(programa>getProgramas()-1){
                programa=0;
                nquantum=1;
            }
            //cuando el tiempo del programa es 0 entonces 
            if(tiempo[programa][2]==0){
                //buscamos el siguiente programa que todavia tenga un tiempo restante
                int x=programa+1;
                //asi que mientras el programa que esta-á en 0 sea diferente al siguiente programa entonces
                while(programa!=x){
                    //si es el ultimo programa entonces volvemos a iniciar desde el primer programa
                    if(x==getProgramas()){
                            x=0;
                        }
                    //si el tiempo del programa que se esta revisando actualmente es 0 entonces cambiamos al siguiente programa
                    if(tiempo[x][2]==0){
                        x++;
                        nquantum=1;
                    }else{
                        //pero si no entonces el programa que se revisó va ejecutarse
                        programa=x;
                        nquantum=1;
                    }
                }
            }
            
            //al programa actual se le disminuye en uno el tiempo de ejecucion
            tiempo[programa][2]=tiempo[programa][2]-1;
            //ignorar jajaja
            setNombrePrograma(datos[programa][1]);
            tabla[tiempoe][0]=String.valueOf(tiempoe);
            tabla[tiempoe][1]=getNombrePrograma();
            tabla[tiempoe][2]=String.valueOf(nquantum);  
            //aumentamos el tiempo de ejecuacucion en 1
            tiempoe++;
            
            //se imprime el tiempo de ejecucion, el quantum y el nombre del programa
            System.out.println(" -   "+tiempoe+"      -   "+nquantum+"   -   "+datos[programa][1]+"  - ");
        }
        
        setEspera(getEspera()/getProgramas());
        //algoritmos.imprimir(getTabla());
        algoritmos.cargarTabla(getTiempoTotal(),getTabla(),getEspera());
    }
    //ingnarar el resto del codigo
    private String[][] getTabla(){
        
        return tabla;
    }
    
    private int getEspera(){
        
        return espera;
    }
    
    private void setEspera(int espera){
        
        this.espera=espera;
    }
    
    private void setNombrePrograma(String nombrePrograma){
        
        this.nombrePrograma=nombrePrograma;
    }
    
    private String getNombrePrograma(){
        
        return nombrePrograma;
    }
    
    private int getProgramas(){
        
        return programas;
    }
    
    private int getQuantum(){
        
        return quantum;
    }
    
    private int getTiempoTotal(){
        
        return tiempoTotal;
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
    
    private void setDatos(String[][]datos){
        
        this.datos=datos;
    }
    
    private void setQuantum(int quantum){
        
        this.quantum=quantum;
    }
    
    private String[][]datos;
    private int [][]tiempo;
    private int tiempoTotal,programas, espera=0,quantum;
    private String nombrePrograma;    
    private String[][]tabla;
}