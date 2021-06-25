/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.futuresprogrammers.studentdatabase.model;

/**
 *
 * @author Gabriela Sunta Future'sProgrammersTech ESPE- DCCO
 */
public class StudentsInformation {
    private String nameStudent;
    private int numbersId;
    private String civilStatus;
    private String sex;
     private String nameUniversity;
    private String racing;
     private String semester;
    private int nrc;
     private String nameSubject;
    private int type;

    public StudentsInformation(String nameStudent, int numbersId, String civilStatus, String sex, String nameUniversity, String racing, String semester, int nrc, String nameSubject, int type) {
        this.nameStudent = nameStudent;
        this.numbersId = numbersId;
        this.civilStatus = civilStatus;
        this.sex = sex;
        this.nameUniversity = nameUniversity;
        this.racing = racing;
        this.semester = semester;
        this.nrc = nrc;
        this.nameSubject = nameSubject;
        this.type = type;
    }

    public StudentsInformation(String next, int nextInt, String next0, String next1, String next2, int nextInt0, String next3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "StudentsInformation{" + "nameStudent=" + getNameStudent() + ", numbersId=" + getNumbersId() + ", civilStatus=" + getCivilStatus() + ", sex=" + getSex() + ", nameUniversity=" + getNameUniversity() + ", racing=" + getRacing() + ", semester=" + getSemester() + ", nrc=" + getNrc() + ", nameSubject=" + getNameSubject() + ", type=" + getType() + '}';
    }

    /**
     * @return the nameStudent
     */
    public String getNameStudent() {
        return nameStudent;
    }

    /**
     * @param nameStudent the nameStudent to set
     */
    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    /**
     * @return the numbersId
     */
    public int getNumbersId() {
        return numbersId;
    }

    /**
     * @param numbersId the numbersId to set
     */
    public void setNumbersId(int numbersId) {
        this.numbersId = numbersId;
    }

    /**
     * @return the civilStatus
     */
    public String getCivilStatus() {
        return civilStatus;
    }

    /**
     * @param civilStatus the civilStatus to set
     */
    public void setCivilStatus(String civilStatus) {
        this.civilStatus = civilStatus;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return the nameUniversity
     */
    public String getNameUniversity() {
        return nameUniversity;
    }

    /**
     * @param nameUniversity the nameUniversity to set
     */
    public void setNameUniversity(String nameUniversity) {
        this.nameUniversity = nameUniversity;
    }

    /**
     * @return the racing
     */
    public String getRacing() {
        return racing;
    }

    /**
     * @param racing the racing to set
     */
    public void setRacing(String racing) {
        this.racing = racing;
    }

    /**
     * @return the semester
     */
    public String getSemester() {
        return semester;
    }

    /**
     * @param semester the semester to set
     */
    public void setSemester(String semester) {
        this.semester = semester;
    }

    /**
     * @return the nrc
     */
    public int getNrc() {
        return nrc;
    }

    /**
     * @param nrc the nrc to set
     */
    public void setNrc(int nrc) {
        this.nrc = nrc;
    }

    /**
     * @return the nameSubject
     */
    public String getNameSubject() {
        return nameSubject;
    }

    /**
     * @param nameSubject the nameSubject to set
     */
    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }

    
    
}
