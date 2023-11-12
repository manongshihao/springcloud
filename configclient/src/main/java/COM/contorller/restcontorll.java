package COM.contorller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class restcontorll {

@Value("${name}")
private String port;
@RequestMapping("/filldll")
    public String findll() {
        return this.port;
    }

}
