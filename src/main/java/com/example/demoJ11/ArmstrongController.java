package com.example.demoJ11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan(basePackages = {"com.example.demoJ11"})
public class ArmstrongController {

    @Autowired
    private final ArmstrongHelper armstrongHelper = new ArmstrongHelper();

    @GetMapping("/armstrong")
    @ResponseBody
    public boolean isArmstrongNumber(@RequestParam int input){
        return armstrongHelper.isArmstrongNumber(input);
    }


}
