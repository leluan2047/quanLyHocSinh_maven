package service;

import model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findById(int id);
    void save( Student student);
    void update(int id,Student student);
    void remove(int id);
    List<Student> findByName(String name);
    boolean checkId(int id);

}
