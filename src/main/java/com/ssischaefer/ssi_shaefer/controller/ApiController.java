package com.ssischaefer.ssi_shaefer.controller;

import com.ssischaefer.ssi_shaefer.entity.TransportUnitEntity;
import com.ssischaefer.ssi_shaefer.repository.LableTempRepo;
import com.ssischaefer.ssi_shaefer.repository.LocationRepo;
import com.ssischaefer.ssi_shaefer.repository.PrinterRepo;
import com.ssischaefer.ssi_shaefer.repository.TransportUnitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController {

    @Autowired
    private TransportUnitRepo transportUnitRepo;
    private LocationRepo locationRepo;
    private PrinterRepo printerRepo;
    private LableTempRepo lableTempRepo;

    @PostMapping("/notification")
    @ResponseBody
    public void notificationPointPassed(@RequestParam String tuName,
                                                  @RequestParam String rpName,
                                                  @RequestParam String movementType){
        //доделать логику
    }
    @PostMapping("/printingCompletion")
    public void printingCompletion(String tuName, String printerName, String labelTemplate){
        //доделать логику
    }

    @GetMapping("/getTo/{tuName}")
    public String getTo(@PathVariable String tuName) {
        Long locId = transportUnitRepo.findByName(tuName).get(0).getLocationId();
        return locationRepo.findById(locId).get().getName();
    }
    @GetMapping("/getLabelTemplate/{printerName}")
    public String getLabelTemplate(@PathVariable String printerName) {
        Long labelId = printerRepo.findByName(printerName).get(0).getLabelTemplateId();
        return lableTempRepo.findById(labelId).get().getName();
    }
}
