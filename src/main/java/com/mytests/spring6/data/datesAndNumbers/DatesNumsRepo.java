package com.mytests.spring6.data.datesAndNumbers;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.sql.Time;
import java.util.Date;
import java.util.List;

/**
 * *
 * <p>Created by irina on 5/4/2022.</p>
 * <p>Project: sb3-web-freemarker</p>
 * *
 */
public interface DatesNumsRepo extends CrudRepository<DatesAndNumbers,Integer> {

    @Query("select d from DatesAndNumbers d where d.firstDate = local date ")
    List<DatesAndNumbers> query1();

    @Query("select d from DatesAndNumbers d where (local datetime - :time) > d.timeOne and local time > d.timeTwo")
    List<DatesAndNumbers> query2(@Param("time") Time time);

    @Query("select d from DatesAndNumbers d where (extract(YEAR from :date) = YEAR(d.firstDate)) or (extract(MONTH from d.secondDate) = extract(MONTH from local date))")
    List<DatesAndNumbers> query3(@Param("date") Date date);

    @Query("select d from DatesAndNumbers d where ceiling(d.floatTwo) > 100 ")
    List<DatesAndNumbers> query4();

    @Query("select d from DatesAndNumbers d where exp(d.firstNum) > 100 ")
    List<DatesAndNumbers> query5();

    @Query("select d from DatesAndNumbers d where floor(d.floatTwo) > d.firstNum ")
    List<DatesAndNumbers> query6();

    @Query("select d from DatesAndNumbers d where ln(d.secondNum) < d.firstNum + 10")
    List<DatesAndNumbers> query7();

    @Query("select d from DatesAndNumbers d where power(d.firstNum+100, d.secondNum) > :num ")
    List<DatesAndNumbers> query8(@Param("num") int num);

    @Query("select d from DatesAndNumbers d where round(d.firstNum, d.secondNum) = :num ")
    List<DatesAndNumbers> query9(@Param("num") int num);

    @Query("select d from DatesAndNumbers d where sign(d.floatTwo) = -1 ")
    List<DatesAndNumbers> query10();

}
