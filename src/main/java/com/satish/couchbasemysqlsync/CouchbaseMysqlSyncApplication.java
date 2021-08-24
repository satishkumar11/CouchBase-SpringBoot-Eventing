package com.satish.couchbasemysqlsync;

import com.satish.couchbasemysqlsync.dto.Request;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CouchbaseMysqlSyncApplication {

    public static void main(String[] args) {
        SpringApplication.run(CouchbaseMysqlSyncApplication.class, args);
    }

    @PutMapping("/add")
    public void addDoc(@RequestBody Request request) {
        try {
            System.out.println(request.toString());
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
    }
}
