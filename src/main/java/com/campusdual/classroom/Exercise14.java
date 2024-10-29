package com.campusdual.classroom;

public class Exercise14 {

    public static void main(String[] args) {
        Person p = new Person("John", "Smith");
        Teacher t = new Teacher("Maria", "Montessori", "Educación");
        PoliceOfficer po = new PoliceOfficer("Jake", "Peralta", "B-99");
        Doctor d = new Doctor("Gregory", "House", "Nefrología e Infectología");
        System.out.println("Detalles de la persona: ");
        p.getDetails();
        System.out.println("Detalles del oficial de policia: ");
        po.getDetails();
        System.out.println("Detalles del profesor: ");
        t.getDetails();
        System.out.println("Detalles del doctor: ");
        d.getDetails();
        }

    }

