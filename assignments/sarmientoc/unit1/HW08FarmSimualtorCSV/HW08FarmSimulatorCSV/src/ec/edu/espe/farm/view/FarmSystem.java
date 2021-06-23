/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import com.csvreader.CsvWriter;
import ec.edu.espe.farm.model.Chicken;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class FarmSystem {
    
    public static void main(String[] args) throws IOException {
        
        ArrayList<Chicken> chickens = new ArrayList();
                
        chickens.add(new Chicken(1,"Pamela\t","White\t","10/05/2021", true , 3));
        chickens.add(new Chicken(2,"Mike\t","Black\t","15/04/2019", true , 3));
        chickens.add(new Chicken(3,"Erick\t","White\t","19/03/2020", false , 6));
        chickens.add(new Chicken(4,"Gabriel\t","Brown\t","20/07/2019", false , 3));
        chickens.add(new Chicken(5,"Pablo\t","White\t","14/07/2020", false , 3));
        chickens.add(new Chicken(6,"Glace\t","Black\t","05/05/2020", false , 2));
        chickens.add(new Chicken(7,"Niko\t","White\t","09/05/2019", true , 3));
        chickens.add(new Chicken(8,"Catalina\t","White\t","28/08/2021", true , 4));
        chickens.add(new Chicken(9,"Jorgito\t","Black\t","15/02/2020", true ,3));
        chickens.add(new Chicken(10,"ChupaloChicken\t","Black\t","03/01/2021", true , 9));
       
       CsvWriter csvWriter = new CsvWriter("Cristopher Sarmiento create Farm Chicken Simulator.csv");
       
       for (Chicken chicken : chickens){
           String[] note = chicken.getArray();
           csvWriter.writeRecord(note);
           
       }
       
       csvWriter.close();
      

}
    
}