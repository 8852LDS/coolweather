package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/8/24 0024.
 */
public class Province extends DataSupport{
    private int id ;
    private String proviceNmae ;
    private int provinceCode ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProviceNmae() {
        return proviceNmae;
    }

    public void setProviceNmae(String proviceNmae) {
        this.proviceNmae = proviceNmae;
    }
}
