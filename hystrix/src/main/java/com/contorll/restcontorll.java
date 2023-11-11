package com.contorll;


import com.Feign.feigns;
import com.Model.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class restcontorll {

@Autowired
private feigns feigns;
@RequestMapping("/filldll")
    public Collection<student> findll() {
        return feigns.filldll();
    }

}
