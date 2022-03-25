package example01.e220325;

public class Practice1 {

    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setData(1234,"홍길동");

//        System.out.println("직원번호: " + em.getId()
//                          +"\n사원명: " + em.getName());
        System.out.println("직원번호：" + employee.getId());

        System.out.println("직원명：" + employee.getName());
    }
}

class Employee {
    private String name;
    private int id;

    public Employee() {
        this.name = null;
        this.id = 0;
    }

    public void setData(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }
}
