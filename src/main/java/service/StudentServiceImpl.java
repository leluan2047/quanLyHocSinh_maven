package service;

import model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentServiceImpl implements StudentService {

    private static Map<Integer, Student> list;

    static {
        list = new HashMap<>();
        list.put(1, new Student(1, "Lê Thanh Luận", 20, "Huế", "Nam", "F304"));
        list.put(2, new Student(2, "Lý Diệu Nhi", 23, "Quảng Trị", "Nữ", "E104"));
        list.put(3, new Student(3, "Trương Hiền Minh", 17, "Quảng Bình", "Nam", "H101"));
        list.put(4, new Student(4, "Nguyễn Nhật Linh", 25, "Nghệ An", "Nữ", "E106"));
        list.put(5, new Student(5, "Hoàng Kỳ Anh", 22, "Thanh Hóa", "Nam", "B52"));
        list.put(6, new Student(6, "Vương Thu Giang", 18, "Hà Tĩnh", "Nữ", "I502"));

    }


    public List<Student> findAll() {
        return new ArrayList<>(list.values());
    }


    public Student findById(int id) {
        return list.get(id);
    }

    public void save(Student student) {
        list.put(student.getId(), student);
    }

    public void update(int id, Student student) {
        list.put(id, student);
    }

    public void remove(int id) {
        list.remove(id);
    }

    public List<Student> findByName(String name) {
        Map<Integer, Student> findResult = new HashMap<>();
        for (Map.Entry<Integer, Student> map : list.entrySet()) {
            if (map.getValue().getName().equals(name)) {
                findResult.put(map.getValue().getId(), list.get(map.getValue().getId()));
            }
        }
        return new ArrayList<>(findResult.values());
    }

    public boolean checkId(int id) {
        for (Map.Entry<Integer, Student> x : list.entrySet()) {
            if (id == x.getValue().getId()) {
                return false;
            }
        }
        return true;
    }

}
