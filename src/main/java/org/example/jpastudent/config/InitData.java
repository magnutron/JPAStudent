package org.example.jpastudent.config;

import org.example.jpastudent.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.example.jpastudent.model.Student;
import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class InitData implements CommandLineRunner{

    @Autowired
    StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {
        Student s1 = new Student();
        s1.setName("John1");
        s1.setBornDate(LocalDate.of(2000, 1, 1));
        s1.setBornTime(LocalTime.of(12, 0));
        studentRepository.save(s1);
        System.out.println("Student saved: " + s1);

        Student s2 = new Student();
        s2.setName("John2");
        s2.setBornDate(LocalDate.of(2000, 1, 1));
        s2.setBornTime(LocalTime.of(12, 0));
        studentRepository.save(s2);
        System.out.println("Student saved: " + s2);

        Student s3 = new Student();
        s3.setName("John3");
        s3.setBornDate(LocalDate.of(2000, 1, 1));
        s3.setBornTime(LocalTime.of(12, 0));
        studentRepository.save(s3);
        System.out.println("Student saved: " + s3);
    }
}
