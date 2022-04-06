package com.example.tracker.repositories;

import com.example.tracker.beans.patientDetails;
import com.example.tracker.beans.sampleDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface patientDetailsRepository extends JpaRepository<patientDetails,Integer> {

 @Query(
         value="SELECT * FROM patient_details u WHERE u.patient_id=(SELECT s.pd_patient_id FROM sample_details s WHERE s.sample_id=?1)",
         nativeQuery = true

 )
 patientDetails getPatient_sampleIDRepo(String sample_id);
   // patientDetails findByUHID(String id);
    @Query(
            value = "SELECT * FROM patient_details u WHERE u.patient_id = ?1",
            nativeQuery = true)
    patientDetails getById1(Integer id);


    @Query(
            value = "SELECT * FROM patient_details u WHERE u.accept=false",
            nativeQuery= true
    )
    List<patientDetails> getRequestsJPA();

    @Query(
            value="SELECT * FROM patient_details u WHERE u.accept=true",
            nativeQuery = true
    )
    List<patientDetails> getAcceptedRequestsRepo();
}
