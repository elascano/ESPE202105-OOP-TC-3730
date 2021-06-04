public class IgvProducto

{

    public static void main( String[] args )

    {

        Scanner valor = new Scanner(System.in);

        float vv,pv,igv;

        

        System.out.print("Ingrese el valor de venta: ");

        vv=valor.nextFloat();

        

        igv=vv*0.19f;

        pv = vv+igv;

        

        System.out.println("IGV: "+igv+"\nPrecio de venta: "+pv );

        
 
    }

}
