package com.example.debutwork.Controller;

import com.example.debutwork.Service.BlocServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlocController {
    @Autowired
    BlocServiceImpl blocService;


}
