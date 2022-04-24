package com.example.tracker.services;

import com.example.tracker.beans.patientDetails;
import com.example.tracker.beans.sampleDetails;
import com.example.tracker.repositories.patientDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class patientDetailsService {
    @Autowired
    private patientDetailsRepository pdR;
    //List<patientDetails> list;
    public patientDetailsService() {
//        list=new ArrayList<>();
//        list.add(new patientDetails(1,"1","name",22,"F"));

    }
    public patientDetails getPatient_sampleIDRest(String sample_id){
        return pdR.getPatient_sampleIDRepo(sample_id);
    }

    public List<patientDetails> getPatientDetailsRest(){
//        System.out.println("Hi");
//        System.out.println(pdR.findAll());
        //return list;
       return pdR.findAll();
    }
    public patientDetails getPatientDetailsRest(String id) {

//        patientDetails pd=null;
//        for(patientDetails p:list){
//            if(p.getId()==id){
//                pd=p;
//                break;
//            }
//        }
//        return pd;
        return pdR.getById1(id);
    }

    public List<patientDetails> getRequestsRest(){
        return pdR.getRequestsJPA();
    }

    public List<patientDetails> getAcceptedRequestsRest(){
        return pdR.getAcceptedRequestsRepo();
    }

    public patientDetails addPatientDetailsRest(patientDetails pd) {
        patientDetails p=pdR.getById1(pd.getPatient_id());
        if(p==null){
            return pdR.save(pd);
        }
        else{
            return null;
        }

//        list.add(pd);
//        return pd;
    }

    public patientDetails updatePatientDetailsRest(patientDetails pd){
//        list.forEach(e->{
//            if(e.getId()==pd.getId()){
//                e.setName(pd.getName());
//                e.setAge(pd.getAge());
//                e.setSex(pd.getSex());
//                e.setUHID(pd.getUHID());
//            }
//        });
        pdR.save(pd);
        return pd;
    }

    public patientDetails updateAcceptRest(patientDetails pd){
        pdR.save(pd);
        return pd;
    }

    public void deletePatientDetailsRest(String id){
        //list=this.list.stream().filter(e->e.getId()!=id).collect(Collectors.toList());
          patientDetails ent=pdR.getById1(id);
          pdR.delete(ent);
    }
//    public patientDetails findByUHIDRest(String uhid){
//        return pdR.findByUHID(uhid);
//    }
    public List<patientDetails> getPndngPtnt_Service(int stationNo){
        return pdR.getPndngPtnt_Repo(stationNo);
    }

}
