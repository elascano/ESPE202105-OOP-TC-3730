/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hospital.controlller;

import ec.edu.espe.hospital.model.ClinicHistory;
import ec.edu.espe.hospital.model.Patient;

/**
 *
 * @author AnitaQ
 */
public class PatientController {
     public boolean addClinicHisToryToPatient(ClinicHistory clinicHistory,Patient patient){
       clinicHistory.getPatients().add(patient);
       // TODO add to database by calling utils
        return true;
    }
    
    
}
