package com.example.debutwork.Controller;

import com.example.debutwork.Service.BlocServiceImpl;
import com.example.debutwork.Service.FoyerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoyerController {
    @Autowired
    FoyerServiceImpl foyerService;
}
