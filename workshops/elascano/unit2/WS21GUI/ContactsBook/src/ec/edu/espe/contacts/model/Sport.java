/** Copyright ESPE-DECC
*/

package ec.edu.espe.contacts.model;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class Sport {
    private int id;
    private String description;
    private boolean team;

    public Sport(int id, String description, boolean team) {
        this.id = id;
        this.description = description;
        this.team = team;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the team
     */
    public boolean isTeam() {
        return team;
    }

    /**
     * @param team the team to set
     */
    public void setTeam(boolean team) {
        this.team = team;
    }

    
    
}
