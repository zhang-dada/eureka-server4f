package com.test4fclient.controller;

import com.test4fclient.api.TestClient2Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestClient1Contrioller {
    @Autowired
    private TestClient2Api testClient2Api;

    @RequestMapping("test01")
    public String test01(){
        String s = testClient2Api.test01();
        return s;
    }
}
