package controllers;

import model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.StudentService;
import service.StudentServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Controller
public class Main {

    StudentService studentService = new StudentServiceImpl();

    public boolean isDouble(String s){
        try {
            double x = Double.parseDouble(s);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    @GetMapping("/")
    private ModelAndView show() {
        List<Student> student = studentService.findAll();
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("Student", student);
        return modelAndView;
    }


    @GetMapping("/view")
    private ModelAndView view(@RequestParam String id) {
        int ID = Integer.parseInt(id);
        Student student = studentService.findById(ID);

        ModelAndView modelAndView = new ModelAndView("view");
        modelAndView.addObject("Student", student);
        return modelAndView;

    }

    @GetMapping("/edit")
    public ModelAndView showEditForm(@RequestParam int id) {
        ModelAndView modelAndView = new ModelAndView("editForm");
        Student student = studentService.findById(id);
        modelAndView.addObject("student", student);
        return modelAndView;
    }

    @PostMapping("/edit")
    private ModelAndView edit(@ModelAttribute Student student, Model model) {
        ModelAndView modelAndView = new ModelAndView("editForm");

        studentService.update(student.getId(), student);
        model.addAttribute("message", "Successful");
        return modelAndView;
    }

    @GetMapping("/delete")
    private ModelAndView showDeleteForm(@RequestParam String id) {
        ModelAndView modelAndView = new ModelAndView("deleteForm");
        Student student = studentService.findById(Integer.parseInt(id));
        modelAndView.addObject("student", student);
        return modelAndView;
    }

    @PostMapping("/delete")
    private ModelAndView delete(@ModelAttribute Student student, Model model) {
        ModelAndView modelAndView = new ModelAndView("deleteForm");
        studentService.remove(student.getId());
        model.addAttribute("message", "Successful");
        return modelAndView;
    }

    @GetMapping("/create")
    private ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("createForm","student",new Student());
        return modelAndView;
    }


    @PostMapping("/create")
    private ModelAndView createStudent(@ModelAttribute Student student, Model model) {
        ModelAndView modelAndView = new ModelAndView("createForm");
        Random random = new Random();
        int id = 1;
        while(studentService.checkId(id) == false){
            id = random.nextInt(1000);
        }
        student.setId(id);

        studentService.save(student);

        model.addAttribute("message", "Successful");
        return modelAndView;
    }

    @PostMapping("/find")
    private String find(@RequestParam String nameKey,Model model){
        List<Student> listResult = studentService.findByName(nameKey);
        model.addAttribute("list",listResult);
        return "resultPage";
    }


}
