package com.example.certificates.controller;
import com.example.certificates.dto.AcceptRequestDTO;
import com.example.certificates.dto.CertificateDTO;
import com.example.certificates.dto.DeclineRequestDTO;
import com.example.certificates.model.Paginated;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/certificate")
public class CertificateController {

    @GetMapping
    public ResponseEntity<Paginated<CertificateDTO>> getCertificates(){

        return new ResponseEntity<>(
                new Paginated<>(0, new HashSet<>()),
                                HttpStatus.OK);
    }

    @PutMapping(value = "/accept-request/{id}")
    public ResponseEntity<AcceptRequestDTO> acceptRequest(@PathVariable Long id){
    }

    @PutMapping(value = "/decline-request/{id}")
    public ResponseEntity<DeclineRequestDTO> declineRequest(@PathVariable Long id){

    }
}
