package br.com.mauraumdev.bolaoCopa.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.mapstruct.Mapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.Entity;


public class Result {
    long id;
    int result1;
    int result2;

    public Result(long id, int result1, int result2) {
        this.id = id;
        this.result1 = result1;
        this.result2 = result2;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getResult1() {
        return result1;
    }

    public void setResult1(int result1) {
        this.result1 = result1;
    }

    public int getResult2() {
        return result2;
    }

    public void setResult2(int result2) {
        this.result2 = result2;
    }
}
