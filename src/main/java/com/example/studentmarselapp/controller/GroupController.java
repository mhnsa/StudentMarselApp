package com.example.studentmarselapp.controller;


import com.example.studentmarselapp.dto.GroupDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping(path = "/university")
public class GroupController {


    @PostMapping(path = "/groups")
    public void add(@RequestBody GroupDTO groupDTO) {
        System.out.println(groupDTO.getName());
    }

}
