/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saveBooks.view;

/**
 *
 * @author Alexander Pachacama BUILDER ESPE-DCC0
 */
class FileManager {
    public static void save(String fileName, String data){
        //TODO saving data in the FileName 
        
        System.out.println("saving --> "+data+"<-- in file -->"+ fileName);
    }
    public static String find(String fileName, String dataToFind){
        //TODO finding dataToFind in the file fileName 
        String results;
        results = "Alexander Pachacama ,15,12,17";
        System.out.println("returning -->"+ results);
        
        return results;
    }
     public static String findAll(String fileName){
        //TODO finding dataToFind in the file fileName 
        String results;
        
        results = "Alexader Pachacacma ,15,12,17";
        
         System.out.println("returnig -->"+ results);
        return results;
     }
     public static boolean update (String fileName, String dataToFind, String dataToUpdate){
         //TODO update information
         boolean update;
         
         update= true;
         
         System.out.println("updation"+ dataToFind+ "in" + fileName);
         return update;
     }
     public static boolean delete (String fileName, String dataToDelete){
         //TODO delete information 
         boolean delete;
         
         delete = true;
         
         System.out.println("deleting" + dataToDelete + "from" + fileName );
         return delete;
     }
     
     
     
}


