package com.example.ycm;

import android.app.Application;
import android.content.ClipData;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class GlobalVariable extends Application {



    private static List<String> order_list = new ArrayList<>();

    public List<String> getOrder_list() {
        return order_list;
    }

    public void setOrder_list(List<String> order_list) {
        this.order_list = order_list;
    }

    private Integer total=0;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    private Integer cake_total=0;

    public Integer getCake_total() {
        return cake_total;
    }

    public void setCake_total(Integer cake_total) {
        this.cake_total = cake_total;
    }

    private Integer burger_total=0;

    public Integer getBurger_total() {
        return burger_total;
    }

    public void setBurger_total(Integer burger_total) {
        this.burger_total = burger_total;
    }

    private Integer donut_total=0;

    public Integer getDonut_total() {
        return donut_total;
    }

    public void setDonut_total(Integer donut_total) {
        this.donut_total = donut_total;
    }



    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
