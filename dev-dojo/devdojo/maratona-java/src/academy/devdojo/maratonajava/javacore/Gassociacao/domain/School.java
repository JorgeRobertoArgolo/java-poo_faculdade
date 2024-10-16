package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

public class School {
    private String name;
    private Teacher[] teachers;

    public void print () {
        System.out.println("--------- Information of the School --------");
        System.out.println("School Name : " + getName());
        System.out.println("Teachers : ");

        if(teachers == null) return;//If void return

        for (Teacher teacher : teachers) {
            System.out.println("Teacher's name : " + teacher.getName());
        }
    }

    public School(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }
}
