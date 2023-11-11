package eurekaclient.servier;

import eurekaclient.Model.student;
import org.springframework.stereotype.Service;

import java.util.Collection;

public interface serverier {
    public Collection<student> filldll();
    public student filldllId(Integer id);
    public void deleteId(Integer id);
//    public void  updatestudent(student student);
    public void save(student s);
}
