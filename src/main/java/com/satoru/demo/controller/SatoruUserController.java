package com.satoru.demo.controller;

import com.satoru.demo.config.*;
import com.satoru.demo.entity.*;
import com.satoru.demo.repository.*;
import lombok.*;
import org.apache.logging.log4j.*;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/apis/user")
public class SatoruUserController {
    private final static Logger LOG = LogManager.getLogger(SatoruUserController.class);

    private final SatoruUserRepository satoruUserRepository;

    @GetMapping("/list")
    public SatoruApiResponse<List<SatoruUserEntity>> listUser() {
        List<SatoruUserEntity> users = satoruUserRepository.findAll();
        LOG.info(users);

        return SatoruApiResponse.success(users);
    }

    @PostMapping("/add")
    public SatoruApiResponse<SatoruUserEntity> addUser(@RequestBody String requestBody) {
        JSONObject userRequest = new JSONObject(requestBody);

        SatoruUserEntity satoruUserEntity = new SatoruUserEntity();
        satoruUserEntity.setFirstName(userRequest.getString("firstName"));
        satoruUserEntity.setLastName(userRequest.getString("lastName"));
        satoruUserEntity.setPhone(userRequest.getString("phone"));

        return SatoruApiResponse.success(satoruUserRepository.save(satoruUserEntity));
    }
}
