package com.mytests.spring6;

import com.mytests.spring6.data.MyConfig;
import com.mytests.spring6.data.datesAndNumbers.DatesAndNumbers;
import com.mytests.spring6.data.datesAndNumbers.DatesAndNumbersService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * *
 * <p>Created by irina on 5/4/2022.</p>
 * <p>Project: spring6-jpa</p>
 * *
 */
public class RunMe {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
        DatesAndNumbersService service= ctx.getBean(DatesAndNumbersService.class);
        System.out.println("====== findAll()");
        for (DatesAndNumbers datesAndNumbers : service.listAll()) {
            System.out.println(datesAndNumbers);
        }
        System.out.println("====== firstDate = local date");
        for (DatesAndNumbers datesAndNumbers : service.qwe1()) {
            System.out.println(datesAndNumbers);
        }
        System.out.println("====== local datetime and local time");
        for (DatesAndNumbers datesAndNumbers : service.qwe2()) {
            System.out.println(datesAndNumbers);
        }
        System.out.println("====== extract");
        for (DatesAndNumbers datesAndNumbers : service.qwe3()) {
            System.out.println(datesAndNumbers);
        }
        System.out.println("====== ceiling()");
        for (DatesAndNumbers datesAndNumbers : service.qwe4()) {
            System.out.println(datesAndNumbers);
        }
        System.out.println("====== exp()");
        for (DatesAndNumbers datesAndNumbers : service.qwe5()) {
            System.out.println(datesAndNumbers);
        } System.out.println("====== floor()");
        for (DatesAndNumbers datesAndNumbers : service.qwe6()) {
            System.out.println(datesAndNumbers);
        } System.out.println("====== ln()");
        for (DatesAndNumbers datesAndNumbers : service.qwe7()) {
            System.out.println(datesAndNumbers);
        } System.out.println("====== power()");
        for (DatesAndNumbers datesAndNumbers : service.qwe8()) {
            System.out.println(datesAndNumbers);
        } System.out.println("====== round()");
        for (DatesAndNumbers datesAndNumbers : service.qwe9()) {
            System.out.println(datesAndNumbers);
        } System.out.println("====== sign()");
        for (DatesAndNumbers datesAndNumbers : service.qwe10()) {
            System.out.println(datesAndNumbers);
        }
    }

}