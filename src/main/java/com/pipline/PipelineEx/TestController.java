package com.pipline.PipelineEx;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @GetMapping()
    public String test() {
       return "<h1 align="center">This is Testing Website Working Correctly !!!</h1>";
    }
}
