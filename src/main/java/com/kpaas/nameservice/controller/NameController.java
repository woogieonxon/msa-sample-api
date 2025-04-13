package com.kpaas.nameservice.controller;

import com.kpaas.nameservice.model.NameEntity;
import com.kpaas.nameservice.service.NameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
    private final NameService nameService;

    public NameController(NameService nameService) {
        this.nameService = nameService;
    }
    @GetMapping("/info")
    public NameEntity getName() {
        NameEntity res = nameService.getNameByNo(1L).orElse(null);
        System.out.println("call to /info");
        return res;
    }
}