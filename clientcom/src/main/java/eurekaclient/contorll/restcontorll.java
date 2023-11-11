package eurekaclient.contorll;

import eurekaclient.Model.student;
import eurekaclient.servier.serverier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
public class restcontorll {

@Autowired
private RestTemplate restTemplate;
@RequestMapping("/filldll")
    public Collection<student> findll() {
        return restTemplate.getForEntity("http://localhost:8082/filldll",Collection.class).getBody();
    }
}
