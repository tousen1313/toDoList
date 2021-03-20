package com.example.demo.aop;

import com.example.demo.aop.address.AddressService;
import com.example.demo.aop.calc.CalcService;
import com.example.demo.aop.some.Some;
import com.example.demo.aop.some.SomeService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringJUnitConfig
@SpringBootTest
@ActiveProfiles("unit")
@DisplayName("AOPのテスト")
class AopTest {

    @Autowired
    private CalcService calcService;

    @Autowired
    private SomeService someService;

    @Autowired
    private AddressService addressService;

    @Test
    @DisplayName("CalcServiceImpl:addメソッド")
    void test1() {
        calcService.add(1, 2);
    }

    @Test
    @DisplayName("SomeServiceImpl")
    void test2() {
        someService.getUserName(1);
    }

    @Test
    @DisplayName("SomeServiceImpl")
    void test2_1() {
        someService.insert(new Some());
    }

    @Test
    @DisplayName("@annotation")
    void test3() {
        addressService.getAddress("123-4567");
    }

}
