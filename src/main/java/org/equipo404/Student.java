package org.equipo404;

import java.util.Objects;

public class Student {
    private String name;
    private String email;
    private double availableMoney;

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
}
