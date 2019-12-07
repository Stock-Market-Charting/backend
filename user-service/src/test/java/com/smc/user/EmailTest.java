package com.smc.user;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class EmailTest extends UserServiceTests {

    @Autowired
    private JavaMailSender javaMailSender;

    @Test
    public void test() {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setText("test");
        simpleMailMessage.setTo("lauro_lx@163.com");
        simpleMailMessage.setSubject("test");

        javaMailSender.send(simpleMailMessage);
    }


}
