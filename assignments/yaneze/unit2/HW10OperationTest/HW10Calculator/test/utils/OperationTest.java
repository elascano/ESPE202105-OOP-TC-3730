/ *
 * Para cambiar este encabezado de licencia, elija Encabezados de licencia en Propiedades del proyecto.
* Para cambiar este archivo de plantilla, elija Herramientas | Plantillas
 * y abra la plantilla en el editor.
 * /
paquete de  utilidades ;

import  org.junit.Test ;
importar  org.junit.Assert estático . * ;

/ **
 *
* @autor Erick Yánez LAMESTech ESPE-DCC0
 * /
 OperationTest de clase  pública {
    
     OperationTest pública () {
    }

    / **
     * Prueba de método add, de clase Operation.
     * /
    @Prueba
    public  void  testAddZeroes () {
        Sistema . fuera . println ( " agregar " );
        suma flotante1 =  0.0F ;
        sumando flotante2 =  0.0F ;
        flotar expResult =  0.0F ;
        resultado flotante =  Operación . agregar (sumando1, sumando2);
        asertEquals (expResult, resultado, 0.0 );
    }

    @Prueba
    public  void  testAdd () {
        Sistema . fuera . println ( " agregar " );
        suma flotante1 =  5.0F ;
        suma flotante2 =  3.0F ;
        flotante expResult =  8.0F ;
        resultado flotante =  Operación . agregar (sumando1, sumando2);
        asertEquals (expResult, resultado, 0.0 );
    }
    
    @Prueba
    public  void  testAddPositivos () {
        Sistema . fuera . println ( " agregar " );
        suma flotante1 =  1.20F ;
        suma flotante2 =  3.40F ;
        flotante expResult =  4.60F ;
        resultado flotante =  Operación . agregar (sumando1, sumando2);
        asertEquals (expResult, resultado, 0.1 );
        
    }
    
    @Prueba
    public  void  testAddNegativos () {
        Sistema . fuera . println ( " agregar " );
        suma flotante1 =  - 3.20F ;
        sumando flotante2 =  - 3.80F ;
        flotar expResult =  - 7.0F ;
        resultado flotante =  Operación . agregar (sumando1, sumando2);
        asertEquals (expResult, resultado, 0.0 );
        
    }
    
    @Prueba
    public  void  testAddPositivosNegativos () {
        Sistema . fuera . println ( " agregar " );
        suma flotante1 =  5.20F ;
        sumando flotante2 =  - 3.40F ;
        flotante expResult =  1.80F ;
        resultado flotante =  Operación . agregar (sumando1, sumando2);
        asertEquals (expResult, resultado, 0.1 );
        
    }
    
    @Prueba
    public  void  testAddPositivos1 () {
        Sistema . fuera . println ( " agregar " );
        suma flotante1 =  5.70F ;
        sumando flotante2 =  1.20F ;
        flotante expResult =  6.90F ;
        resultado flotante =  Operación . agregar (sumando1, sumando2);
        asertEquals (expResult, resultado, 0.1 );
        
    }
 
    
    public  void  testAddPositivos2 () {
        Sistema . fuera . println ( " agregar " );
        suma flotante1 =  10.70F ;
        sumando flotante2 =  12.20F ;
        flotante expResult =  22.90F ;
        resultado flotante =  Operación . agregar (sumando1, sumando2);
        asertEquals (expResult, resultado, 0.1 );
        
    }
    
    
    public  void  testAddPositivos3 () {
        Sistema . fuera . println ( " agregar " );
        suma flotante1 =  8.70F ;
        suma flotante2 =  4.90F ;
        flotante expResult =  13.60F ;
        resultado flotante =  Operación . agregar (sumando1, sumando2);
        asertEquals (expResult, resultado, 0.1 );
        
    }
    
    public  void  testAddPositivos4 () {
        Sistema . fuera . println ( " agregar " );
        sumando flotante1 =  6.90F ;
        sumando flotante2 =  1.20F ;
        flotante expResult =  8.10F ;
        resultado flotante =  Operación . agregar (sumando1, sumando2);
        asertEquals (expResult, resultado, 0.1 );
        
    }

    public  void  testAddPositivos5 () {
        Sistema . fuera . println ( " agregar " );
        suma flotante1 =  8.10F ;
        suma flotante2 =  9.80F ;
        flotante expResult =  17.90F ;
        resultado flotante =  Operación . agregar (sumando1, sumando2);
        asertEquals (expResult, resultado, 0.1 );
        
    }    

    / **
     * Prueba de método de resta, de clase Operación.
     * /
    @Prueba
    public  void  testSubtract () {
        Sistema . fuera . println ( " restar " );
        minuendo flotante =  0.0F ;
        sustraendo flotante =  0.0F ;
        flotar expResult =  0.0F ;
        resultado flotante =  Operación . restar (minuendo, restar);
        asertEquals (expResult, resultado, 0.0 );
    }
    
    public  void  testSubtract2 () {
        Sistema . fuera . println ( " restar " );
        minuendo flotante =  3.0F ;
        sustraendo flotante =  2.50F ;
        flotante expResult =  0.50F ;
        resultado flotante =  Operación . restar (minuendo, restar);
        asertEquals (expResult, resultado, 0.0 );
    }
    
    public  void  testSubtract3 () {
        Sistema . fuera . println ( " restar " );
        minuendo flotante =  6.50F ;
        sustraendo flotante =  2.50F ;
        flotar expResult =  4.0F ;
        resultado flotante =  Operación . restar (minuendo, restar);
        asertEquals (expResult, resultado, 0.0 );
    }
    
    public  void  testSubtract4 () {
        Sistema . fuera . println ( " restar " );
        minuendo flotante =  9.80F ;
        sustraendo flotante =  5.70F ;
        flotar expResult =  4.10F ;
        resultado flotante =  Operación . restar (minuendo, restar);
        asertEquals (expResult, resultado, 0.0 );
    }
    
    public  void  testSubtract5 () {
        Sistema . fuera . println ( " restar " );
        minuendo flotante =  0.0F ;
        sustraendo flotante =  2.90F ;
        flotador expResult =  - 2.90F ;
        resultado flotante =  Operación . restar (minuendo, restar);
        asertEquals (expResult, resultado, 0.0 );
    }
  
    public  void  testSubtract6 () {
        Sistema . fuera . println ( " restar " );
        minuendo flotante =  15,90F ;
        sustraendo flotante =  5.90F ;
        flotante expResult =  10.0F ;
        resultado flotante =  Operación . restar (minuendo, restar);
        asertEquals (expResult, resultado, 0.0 );
    }
    
    public  void  testSubtract7 () {
        Sistema . fuera . println ( " restar " );
        minuendo flotante =  80.0F ;
        sustraendo flotante =  550.0F ;
        flotador expResult =  - 470.0F ;
        resultado flotante =  Operación . restar (minuendo, restar);
        asertEquals (expResult, resultado, 0.0 );
    }
    
    public  void  testSubtract8 () {
        Sistema . fuera . println ( " restar " );
        minuendo flotante =  0.8F ;
        sustraendo flotante =  1.0F ;
        flotador expResult =  - 0.20F ;
        resultado flotante =  Operación . restar (minuendo, restar);
        asertEquals (expResult, resultado, 0.0 );
    }
   
    public  void  testSubtract9 () {
        Sistema . fuera . println ( " restar " );
        minuendo flotante =  55.80F ;
        sustraendo flotante =  62.90F ;
        flotar expResult =  - 7.10F ;
        resultado flotante =  Operación . restar (minuendo, restar);
        asertEquals (expResult, resultado, 0.0 );
    }
    
    public  void  testSubtract10 () {
        Sistema . fuera . println ( " restar " );
        minuendo flotante =  5.0F ;
        sustraendo flotante =  0.0F ;
        flotar expResult =  5.0F ;
        resultado flotante =  Operación . restar (minuendo, restar);
        asertEquals (expResult, resultado, 0.0 );
    }
    
}
