package com.example.Medical_System.controllers;

import com.example.Medical_System.Services.MedicalServices;
import com.example.Medical_System.models.MedicalBillItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MedicalController {
    @Autowired
    private MedicalServices medicalServices;

    @GetMapping("/item")
    public List<MedicalBillItem> getAllItems(){
        return medicalServices.getAllItems();
    }
    @PostMapping("/item")
    public MedicalBillItem addItem(@RequestBody MedicalBillItem item){
        return medicalServices.addItem(item);
    }
    @GetMapping("/item/total-amount")
    public ResponseEntity<Double> getTotalAmount(){
        double totalamount = medicalServices.getTotalAmount();
        return ResponseEntity.ok(totalamount);
    }
    @DeleteMapping("/item/delete/{id}")
    public void deleteItem(@PathVariable long id){
        medicalServices.deleteItem(id);
    }
    @PutMapping("/item/update/{id}")
    public ResponseEntity<MedicalBillItem> updateItem(@PathVariable long id, @RequestBody MedicalBillItem updatedItem){
        MedicalBillItem result = medicalServices.updateItem(id,updatedItem);
        return ResponseEntity.ok(result);
    }
}
