/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.bonus.model.Compare;
import ec.edu.espe.bonus.model.User;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Karen Quilumbaquin Program Builder ESPE-DCC0
 */
public class FileManager implements PersistenceI {
    ArrayList<User> userArray= new ArrayList();
             
                    User e1 = new User(1, "Alejandro", "Aguilar", 76);
                    User e2 = new User(2, "David", "Bedoya", 69);
                    User e3 = new User(3, "Melissa", "Camacho", 72);
                    User e4 = new User(4, "Belen", "Diaz", 50);
                    User e5 = new User(5, "Benajamin", "Manosalva", 59);
                    User e6 = new User(6, "Juan", "Montalvo", 69);         
                    User e7 = new User(7, "Jose", "Nantes", 70);
                    User e8 = new User(8, "Fernanda", "Ovando", 50);
                    User e9 = new User(9, "Pablo", "Paucar", 50);
                    User e10 = new User(10, "Raquel", "Zambrano", 100);
                    User e11 = new User(11, "Milton", "Ortiz", 84);
                    User e12 = new User(12, "Karime", "Rivera", 100); 
                    User e13 = new User(13, "Erick", "Hinojosa", 90);
                    User e14 = new User(14, "Karen", "Andrade", 78);
                    User e15 = new User(15, "Enrique", "Valladares",95);
                    User e16 = new User(16, "Fabricio", "Sánchez", 93);
                    User e17 = new User(17, "Bryan", "López", 87);
                    User e18 = new User(18, "Paola", "Mendosa", 76);         
                    User e19 = new User(19, "Diego", "Castro", 98);
                    User e20 = new User(20, "Santiago", "Guerrero", 85);
                    User e21 = new User(21, "Patricia", "Jacome", 71);
                    User e22 = new User(22, "Julio", "Proaño", 83);
                    User e23 = new User(23, "Martha", "Gutieerez", 56);
                    User e24 = new User(24, "Tatiana", "Terán", 73);          
                    User e25 = new User(25, "Raquel", "Egas", 87);                                 
    @Override
    public boolean create(String data, String table) {
        userArray.add(e1);
                    userArray.add(e2);
                    userArray.add(e3);
                    userArray.add(e4);
                    userArray.add(e5);
                    userArray.add(e6);
                    userArray.add(e7);
                    userArray.add(e8);
                    userArray.add(e9);
                    userArray.add(e10);
                    userArray.add(e11);
                    userArray.add(e12);     
                    userArray.add(e13);
                    userArray.add(e14);
                    userArray.add(e15);
                    userArray.add(e16);
                    userArray.add(e17);
                    userArray.add(e18);
                    userArray.add(e19);
                    userArray.add(e20);
                    userArray.add(e21);
                    userArray.add(e22);
                    userArray.add(e23);
                    userArray.add(e24);  
                    userArray.add(e25); 
             return true;
    }

    @Override
    public String read(String table) {
        String jsonUser ="";
                                GsonBuilder gson2Builder=new GsonBuilder();
                                Gson gson2 = gson2Builder.create();                   
                                    
                                //serializacion  
                                jsonUser= gson2.toJson(e1);                    
                                jsonUser= gson2.toJson(e2);                     
                                jsonUser= gson2.toJson(e3);                    
                                jsonUser= gson2.toJson(e4);                    
                                jsonUser= gson2.toJson(e5);                    
                                jsonUser= gson2.toJson(e6);                     
                                jsonUser= gson2.toJson(e7);                    
                                jsonUser= gson2.toJson(e8);                      
                                jsonUser= gson2.toJson(e9);                    
                                jsonUser= gson2.toJson(e10);                     
                                jsonUser= gson2.toJson(e11);                    
                                jsonUser= gson2.toJson(e12);                    
                                jsonUser= gson2.toJson(e13);                    
                                jsonUser= gson2.toJson(e14);                     
                                jsonUser= gson2.toJson(e15);                    
                                jsonUser= gson2.toJson(e16);
                                jsonUser= gson2.toJson(e17);                    
                                jsonUser= gson2.toJson(e18);                     
                                jsonUser= gson2.toJson(e19);                    
                                jsonUser= gson2.toJson(e20);                    
                                jsonUser= gson2.toJson(e21);                    
                                jsonUser= gson2.toJson(e22);                     
                                jsonUser= gson2.toJson(e23);                    
                                jsonUser= gson2.toJson(e24);                      
                                jsonUser= gson2.toJson(e25);
                          ec.edu.espe.Filemanager.utils.FileManager.save("UserList.json", gson2.toJson(e1));
                          ec.edu.espe.Filemanager.utils.FileManager.save("UserList.json", gson2.toJson(e2));                    
                          ec.edu.espe.Filemanager.utils.FileManager.save("UserList.json", gson2.toJson(e3));
                          ec.edu.espe.Filemanager.utils.FileManager.save("UserList.json", gson2.toJson(e4));                    
                          ec.edu.espe.Filemanager.utils.FileManager.save("UserList.json", gson2.toJson(e5));
                          ec.edu.espe.Filemanager.utils.FileManager.save("UserList.json", gson2.toJson(e6));                    
                          ec.edu.espe.Filemanager.utils.FileManager.save("UserList.json", gson2.toJson(e7));
                          ec.edu.espe.Filemanager.utils.FileManager.save("UserList.json", gson2.toJson(e8));                    
                          ec.edu.espe.Filemanager.utils.FileManager.save("UserList.json", gson2.toJson(e9));
                          ec.edu.espe.Filemanager.utils.FileManager.save("UserList.json", gson2.toJson(e10));                    
                          ec.edu.espe.Filemanager.utils.FileManager.save("UserList.json", gson2.toJson(e11));
                          ec.edu.espe.Filemanager.utils.FileManager.save("UserList.json", gson2.toJson(e12));                    
                          ec.edu.espe.Filemanager.utils.FileManager.save("UserList.json", gson2.toJson(e13));
                          ec.edu.espe.Filemanager.utils.FileManager.save("UserList.json", gson2.toJson(e14));                    
                          ec.edu.espe.Filemanager.utils.FileManager.save("UserList.json", gson2.toJson(e15));
                          ec.edu.espe.Filemanager.utils.FileManager.save("UserList.json", gson2.toJson(e16));                                                                               
                          ec.edu.espe.Filemanager.utils.FileManager.save("UserList.json", gson2.toJson(e17));
                          ec.edu.espe.Filemanager.utils.FileManager.save("UserList.json", gson2.toJson(e18));                    
                          ec.edu.espe.Filemanager.utils.FileManager.save("UserList.json", gson2.toJson(e19));
                          ec.edu.espe.Filemanager.utils.FileManager.save("UserList.json", gson2.toJson(e20));                    
                          ec.edu.espe.Filemanager.utils.FileManager.save("UserList.json", gson2.toJson(e21));
                          ec.edu.espe.Filemanager.utils.FileManager.save("UserList.json", gson2.toJson(e22));                    
                          ec.edu.espe.Filemanager.utils.FileManager.save("UserList.json", gson2.toJson(e23));
                          ec.edu.espe.Filemanager.utils.FileManager.save("UserList.json", gson2.toJson(e24));                    
                          ec.edu.espe.Filemanager.utils.FileManager.save("UserList.json", gson2.toJson(e25));                    
                           
             Collections.sort(userArray,new Compare());
             for(User aux:userArray){System.out.println("\t"+aux);}
             System.out.println(" The total of user registers are: "+userArray.size());
             return jsonUser;
    }

    @Override
    public boolean update(String searchString, String data, String table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String searchString, String table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String find(String searchString, String table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
