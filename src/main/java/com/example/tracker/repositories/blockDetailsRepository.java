package com.example.tracker.repositories;

import com.example.tracker.beans.blockDetails;
import com.example.tracker.beans.patientDetails;
import com.example.tracker.beans.sampleDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface blockDetailsRepository extends JpaRepository<blockDetails,Integer> {


}
