package com.mytests.spring6.data.datesAndNumbers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * *
 * <p>Created by irina on 5/4/2022.</p>
 * <p>Project: sb3-web-freemarker</p>
 * *
 */
@Service
public class DatesAndNumbersService {


    @Autowired
    private DatesNumsRepo datesNumsRepo;

    public List<DatesAndNumbers> listAll(){
        return (List<DatesAndNumbers>) datesNumsRepo.findAll();
    }
    public List<DatesAndNumbers> qwe1(){
        return datesNumsRepo.query1();
    }

    public List<DatesAndNumbers> qwe2(){
        return datesNumsRepo.query2(new Time(60,0,0));
    }

    public List<DatesAndNumbers> qwe3(){
        return datesNumsRepo.query3(new Date((2022-1900), Calendar.MAY,5));
    }

    public List<DatesAndNumbers> qwe4(){
        return datesNumsRepo.query4();
    }
    public List<DatesAndNumbers> qwe5(){
        return datesNumsRepo.query5();
    }
    public List<DatesAndNumbers> qwe6(){
        return datesNumsRepo.query6();
    }
    public List<DatesAndNumbers> qwe7(){
        return datesNumsRepo.query7();
    }
    public List<DatesAndNumbers> qwe8(){
        return datesNumsRepo.query8(7);
    }
    public List<DatesAndNumbers> qwe9(){
        return datesNumsRepo.query9(25);
    }
    public List<DatesAndNumbers> qwe10(){
        return datesNumsRepo.query10();
    }
}
