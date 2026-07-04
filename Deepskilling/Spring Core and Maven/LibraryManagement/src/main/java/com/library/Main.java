package com.library;

import com.library.service.Bookservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Bookservice bookService = context.getBean("bookService", Bookservice.class);

        System.out.println(bookService.getBookDetails(101));
    }
}