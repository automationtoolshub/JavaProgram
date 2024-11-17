package JavaPrograms;

public class Employee {

    private String name;
    private Integer age;

    public Double getSalary() {
        return salary;
    }

    private Double salary;
    private Long mobile;


    public Employee(String name, Integer age, Double salary,Long mobile) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.mobile = mobile;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }





}
