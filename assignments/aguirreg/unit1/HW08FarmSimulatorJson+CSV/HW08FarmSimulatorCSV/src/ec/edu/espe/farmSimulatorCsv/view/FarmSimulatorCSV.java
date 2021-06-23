/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmSimulatorCsv.view;

import com.csvreader.CsvWriter;
import ec.edu.espe.farmSimulatorCsv.model.Chicken;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class FarmSimulatorCSV {
    
    public static void main(String[] args) throws IOException {
        
        ArrayList<Chicken> chickens = new ArrayList();
                
        chickens.add(new Chicken(1,"Rose\t","Black\t","03/04/2020", true , 2));
        chickens.add(new Chicken(2,"Kitty\t","Black\t","05/03/2020", true , 4));
        chickens.add(new Chicken(3,"Juan\t","Blue\t","16/02/2019", true , 7));
        chickens.add(new Chicken(4,"Mark\t","Brown\t","18/08/2020", false , 2));
        chickens.add(new Chicken(5,"DonOmar\t","Yellow\t","09/06/2021", true , 2));
        chickens.add(new Chicken(6,"Ozuna\t","Black\t","05/04/2019", false , 1));
        chickens.add(new Chicken(7,"BadBunny\t","White\t","10/04/2021", false , 4));
        chickens.add(new Chicken(8,"Clara\t","White\t","23/07/2020", false , 5));
        chickens.add(new Chicken(9,"Pame\t","Silver\t","13/03/2021", true ,2));
        chickens.add(new Chicken(10,"Yema\t","Black\t","13/02/2020", true , 9));
        
       
       CsvWriter csvWriter = new CsvWriter("Gabriel Sebastian Aguirre Almache Farm Chicken Simulator.csv");
       
       for (Chicken chicken : chickens){
           String[] note = chicken.getArray();
           csvWriter.writeRecord(note);
           
       }
       
       csvWriter.close();
      

}
    
}
