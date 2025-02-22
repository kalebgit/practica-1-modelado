package org.equipo404.student;

import org.equipo404.courses.CourseRaw;
import org.equipo404.util.TerminalUI;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Student implements Observer {
    private String name;
    private String email;
    private double availableMoney;
    private List<CourseRaw> history;

    public Student(String name, String email, double availableMoney) {
        this.name = name;
        this.email = email;
        this.availableMoney = availableMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(double availableMoney) {
        this.availableMoney = availableMoney;
    }

    public List<CourseRaw> getHistory() {
        return history;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + name + '\'' +
                ", email='" + email + '\'' +
                ", saldo=" + availableMoney +
                '}';
    }

    /// observer logic
    @Override
    public void update(List<String> messages) {
        TerminalUI.createPixelArtBanner("Anuncioss!!");
        messages.stream().forEach((message)->System.out.println(TerminalUI.createLogs(message)));
    }
}
