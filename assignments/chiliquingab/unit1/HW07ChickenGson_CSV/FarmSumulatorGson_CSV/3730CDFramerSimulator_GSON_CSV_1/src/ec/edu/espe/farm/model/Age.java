/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class Age {
        private int dia;
        private int mes;
        private int ano;

    public Age(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Age{" + "dia=" + dia + ", mes=" + mes + ", ano=" + ano + '}';
    }

    public static int calculaDias(int dia, int mes, int ano){
        
        Calendar inicio = Calendar.getInstance();
        inicio.set(ano, mes - 1,dia);
        inicio.set(Calendar.HOUR, 0);
        inicio.set(Calendar.HOUR_OF_DAY, 0);
        inicio.set(Calendar.MINUTE, 0);
        inicio.set(Calendar.SECOND, 0);
        
        Calendar actual = Calendar.getInstance();
        actual.set(Calendar.HOUR, 0);
        actual.set(Calendar.HOUR_OF_DAY, 0);
        actual.set(Calendar.MINUTE, 0);
        actual.set(Calendar.SECOND, 0);
        
        long finMs = actual.getTimeInMillis();
        long inicioMs = inicio.getTimeInMillis();
        
        int dias = (int) ((Math.abs(finMs - inicioMs)) / (1000 * 60 * 60 * 24) );
        
        return dias;
    }
    
    public static int calculaAnos(int dia, int mes, int ano){
       Date actual = new Date();
       
       int diaActual =  actual.getDate();
       int mesActual = actual.getMonth()+1;
       int anoActual = actual.getYear()+1900;
       
       int diferencia = anoActual - ano;
       
        if(mesActual <= mes){
            if(mesActual == mes){
                if(dia > diaActual){
                    diferencia--;
                }
            }else{
                diferencia--;
            }
        }
        return diferencia;
    }
    
    public static int calculaMeses(int dia, int mes, int ano){
        Calendar inicio = Calendar.getInstance();
        inicio.set(ano, mes -1,dia);
        
        Calendar actual = Calendar.getInstance();
        
        int anos_diferencia = calculaAnos(dia, mes, ano);
        
        int meses = (anos_diferencia * 12) + (actual.get(Calendar.MONTH) - inicio.get(Calendar.MONTH));
        
        if(actual.get(Calendar.DATE) < dia){
            meses--;
        }
        
        return meses;
    }

    /**
     * @return the dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public String[] getArray(){
        String[] datos = {String.valueOf(dia), String.valueOf(mes), String.valueOf(ano)};
        
        return datos;
    }
    
}
