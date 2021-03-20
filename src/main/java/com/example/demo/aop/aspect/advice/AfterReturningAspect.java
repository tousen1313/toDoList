package com.example.demo.aop.aspect.advice;

import com.example.demo.entity.Task;
import com.example.demo.service.TaskNotFoundException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Optional;

@Aspect
@Component
public class AfterReturningAspect {

    @AfterReturning(value = "execution(* *..calc..*ServiceImpl.*(..))", returning = "retValue")
    public void afterThrowing(JoinPoint jp, int retValue) {
        System.out.println("AfterReturning: " + jp.getSignature() + " (" + LocalDateTime.now() + ")  (戻り値): " + retValue);
    }
}
