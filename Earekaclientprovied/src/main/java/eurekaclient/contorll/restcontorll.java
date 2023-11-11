package eurekaclient.contorll;

import eurekaclient.Model.student;
import eurekaclient.servier.serverier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class restcontorll {

@Autowired
private serverier serverier;
@RequestMapping("/filldll")
    public Collection<student> findll() {
        return serverier.filldll();
    }
}
