package com.example.demoJ11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArmstrongHelperTest {

    ArmstrongHelper helper = new ArmstrongHelper();

    @Test
    public void isArmstrongNumber() {
        //happy path
        assert(helper.isArmstrongNumber(9474));
        assertFalse(helper.isArmstrongNumber(1204));
        //boundary
        assert(helper.isArmstrongNumber(0));
        assertFalse(helper.isArmstrongNumber(2147483647));
        //experimental
        assertThrows(NumberFormatException.class, ()->helper.isArmstrongNumber(-2147483647));
    }

}