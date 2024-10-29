package com.zero.spel;

import com.zero.spel.common.config.BaseValueInject;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

@Slf4j
@SpringBootTest
class ZeroSpelBootApplicationTests {

    @Autowired
    private BaseValueInject baseValueInject;

    @BeforeEach
    public void before() {
        log.info("init some data");
    }

    @AfterEach
    public void after() {
        log.info("clean some data");
    }

    @Test
    public void execute() {
        log.info("your method test Code");
    }

    @Test
    public void stringSpel() {
        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression("'Hello World'");
        String message = (String) exp.getValue();
        log.info(message);
    }

    @Test
    public void stringSpelConcat() {
        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression("'Hello World'.concat('!')");
        String message = (String) exp.getValue();
        log.info(message);
    }

    @Test
    public void baseValueInject() {
        System.out.println(baseValueInject.toString());
    }

}
