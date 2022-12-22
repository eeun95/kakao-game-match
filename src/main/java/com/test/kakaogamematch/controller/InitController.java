package com.test.kakaogamematch.controller;

import com.test.kakaogamematch.request.InitRequest;
import com.test.kakaogamematch.response.InitResponse;
import com.test.kakaogamematch.service.InitService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/start")
public class InitController {

    private InitService initService;

    @PostMapping("")
    public ResponseEntity start(@RequestBody InitRequest request) throws IOException {
        InitResponse response = initService.start(request.getProblem());
        return ResponseEntity.ok(response);
    }

}