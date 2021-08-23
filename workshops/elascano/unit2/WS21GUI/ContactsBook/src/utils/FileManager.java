/** Copyright ESPE-DECC
*/

package utils;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class FileManager implements PersistenceI{

    @Override
    public boolean create(String data, String table) {
        //TODO insert data in the file table
        return true;
    }

    @Override
    public String read(String table) {
        //TODO read data from file "table"
        return "{}";
    }

    @Override
    public boolean update(String searchString, String data, String table) {
        //TODO update data in the file table according to the searchString
        return true;
    }

    @Override
    public boolean delete(String searchString, String table) {
        //TODO delete a record from table according to searchString
        return true;
    }

    @Override
    public String find(String searchString, String table) {
        //TODO find a record in the table file according to searchString
        return "{}";
    }

}
