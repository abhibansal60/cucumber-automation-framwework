package com.company.project.automation.pages;

import com.company.project.automation.setup.DriverManager;
import org.springframework.beans.factory.annotation.Autowired;

public class Base {
    @Autowired
    DriverManager dm;

    public String fetchPageTitle(){
       return dm.getDriver().getTitle();
    }


}
