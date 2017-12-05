package com.spring.demo.service;

import com.spring.demo.repository.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormService {

    @Autowired
    FormRepository formRepository;

}
