package com.example.tracker.controllers;

import com.example.tracker.beans.blockDetails;
import com.example.tracker.beans.patientDetails;
import com.example.tracker.beans.sampleDetails;
import com.example.tracker.services.blockDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/block")
public class blockDetailsController {
    @Autowired
    private blockDetailsService bdS;

    @GetMapping("/getAllBlocks")
    public List<blockDetails> getBlockDetails() {
        return bdS.getBlockDetailsRest();
    }

    @PostMapping("/insertBlock")
    public blockDetails addBlockDetails(@Valid @RequestBody blockDetails bd) {
        return bdS.addBlockDetailsRest(bd);
    }

    @PostMapping("/insertAllBlocks")
    public List<blockDetails> addAllBlockDetails(@Valid @RequestBody List<blockDetails> bd){
        return bdS.addAllBlockDetailsRest(bd);
    }
    @PutMapping("/updateRemarks")
    public blockDetails updateRemarks(@RequestBody blockDetails bd){
        return bdS.updateRemarksRest(bd);
    }




}
