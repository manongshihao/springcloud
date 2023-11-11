package eurekaclient.servier.iml;

import eurekaclient.Model.student;
import eurekaclient.servier.serverier;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class serveriml implements serverier {
        private static Map<Integer, student> studetmap;
        static {
            studetmap=new HashMap<>();
            studetmap.put(1,new student(1,"丁晋玲",22));
            studetmap.put(2,new student(2,"丁晋玲2",22));
            studetmap.put(3,new student(3,"丁晋玲3",22));
        }
        @Override
        public Collection<student> filldll() {
            return studetmap.values();
        }

        @Override
        public student filldllId(Integer id) {
            return studetmap.get(id);
        }

        @Override
        public void deleteId(Integer id) {
            studetmap.remove(id);
        }

//    @Override
//    public void updatestudent(student student) {
//
//    }

        @Override
        public void save(student s) {
            studetmap.put(s.getId(),s);
        }
}
