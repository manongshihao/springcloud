package com.Feign.iml;

import com.Feign.feigns;
import com.Model.student;
import org.springframework.stereotype.Component;

import java.util.Collection;
@Component
public class feigniml implements feigns {
    @Override
    public Collection<student> filldll() {
        return null;
    }
}
