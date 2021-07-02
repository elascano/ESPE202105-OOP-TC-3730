/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.game.model;

/**
 *
 * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
 */
public class Game {
    private String title;
    private String creativeCompany;
    private String typeGame;
    private String yearOfLaunch;

    public Game(String title, String creativeCompany, String typeGame, String yearOfLaunch) {
        this.title = title;
        this.creativeCompany = creativeCompany;
        this.typeGame = typeGame;
        this.yearOfLaunch = yearOfLaunch;
    }

    @Override
    public String toString() {
        return "Game{" + "title=" + title + ", creativeCompany=" + creativeCompany + ", typeGame=" + typeGame + ", yearOfLaunch=" + yearOfLaunch + '}';
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the creativeCompany
     */
    public String getCreativeCompany() {
        return creativeCompany;
    }

    /**
     * @param creativeCompany the creativeCompany to set
     */
    public void setCreativeCompany(String creativeCompany) {
        this.creativeCompany = creativeCompany;
    }

    /**
     * @return the typeGame
     */
    public String getTypeGame() {
        return typeGame;
    }

    /**
     * @param typeGame the typeGame to set
     */
    public void setTypeGame(String typeGame) {
        this.typeGame = typeGame;
    }

    /**
     * @return the yearOfLaunch
     */
    public String getYearOfLaunch() {
        return yearOfLaunch;
    }

    /**
     * @param yearOfLaunch the yearOfLaunch to set
     */
    public void setYearOfLaunch(String yearOfLaunch) {
        this.yearOfLaunch = yearOfLaunch;
    }
    
}
