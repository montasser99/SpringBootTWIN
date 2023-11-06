package com.example.debutwork.Controller;

import com.example.debutwork.Service.FoyerServiceImpl;
import com.example.debutwork.Service.ReservationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationController {
    @Autowired
    ReservationServiceImpl reservationService;
}
