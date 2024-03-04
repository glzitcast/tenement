package com.example.validation;

import com.example.anno.State;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.lang.annotation.Annotation;
//给哪个注解提供校验规则，校验的数据类型
public class StateValidation implements ConstraintValidator<State, String> {

    /**
     *
     * @param s 将来要校验的数据
     * @param constraintValidatorContext
     * @return 如果返回false，则校验不通过；如果返回true，则校验通过
     */
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        //提供校验规则
        if (s==null){
            return false;
        }

        if(s.equals("已发布")||s.equals("草稿")){
            return true;
        }
        return false;
    }
}
