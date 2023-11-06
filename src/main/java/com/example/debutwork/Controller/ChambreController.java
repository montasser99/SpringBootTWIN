package com.example.debutwork.Controller;


import com.example.debutwork.Service.ChambreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChambreController {
    @Autowired
    ChambreServiceImpl chambreService;
}
