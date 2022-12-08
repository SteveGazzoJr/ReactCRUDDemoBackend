package com.example.demoJ11;

import org.springframework.stereotype.Service;


@Service
public class ArmstrongHelper {

        public boolean isArmstrongNumber(int input){
            int bigInput = Integer.valueOf(input);
            String inputAsString = (""+input);
            int numberOfDigits = inputAsString.length();
            int total = Integer.valueOf(0);
            for(int i = 0; i < numberOfDigits; i++){
                String s = String.valueOf(inputAsString.charAt(i));
                total += Math.pow(Integer.valueOf(s), numberOfDigits);
                if (total > bigInput) return false;
            }
            return (total == bigInput);
        }

}
