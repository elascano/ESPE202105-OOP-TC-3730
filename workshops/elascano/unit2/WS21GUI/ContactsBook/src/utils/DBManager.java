/** Copyright ESPE-DECC
 */
package utils;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class DBManager implements PersistenceI {

    public void connect(String database, String user, String password){
        
    }
    
    @Override
    public boolean create(String data, String table) {
        //TODO insert data in the database collection table
        return true;
    }

    @Override
    public String read(String table) {
        //TODO read data from the database collection "table"
        return "{}";
    }

    @Override
    public boolean update(String searchString, String data, String table) {
        //TODO update data in the database collection table according to the searchString
        return true;
    }

    @Override
    public boolean delete(String searchString, String table) {
        //TODO delete a record from database collection according to searchString
        return true;
    }

    @Override
    public String find(String searchString, String table) {
        //TODO find a record in the table database collection according to searchString
        return "{}";
    }

}
