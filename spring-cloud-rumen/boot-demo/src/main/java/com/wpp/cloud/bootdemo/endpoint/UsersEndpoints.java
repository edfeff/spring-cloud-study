package com.wpp.cloud.bootdemo.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Endpoint(id = "users")
@Component
public class UsersEndpoints {

    @ReadOperation
    public List<Map<String, Object>> users() {

        Map<String, Object> user1Map = new HashMap<>();
        user1Map.put("name", "wpp");
        user1Map.put("age", 28);


        Map<String, Object> user2Map = new HashMap<>();
        user2Map.put("name", "admin");
        user2Map.put("age", 0);

        return Arrays.asList(user1Map, user2Map);
    }
}
