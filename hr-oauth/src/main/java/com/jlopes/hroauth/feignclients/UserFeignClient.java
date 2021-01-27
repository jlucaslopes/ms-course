package com.jlopes.hroauth.feignclients;

import com.jlopes.hroauth.entities.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name = "hr-user", path = "/users")
public interface UserFeignClient {

    //Copia o nome exato do método do resource que queremos nos comunicar
    @GetMapping(value = "/search")
    ResponseEntity<User> findByEmail(@RequestParam String email);
}
