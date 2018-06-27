package P10;

public class Employee {

    private String id, name, description;
    private Department dep;

    public Employee() {

    }

    public Employee(String id, String name, String description, Department dep) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.dep = dep;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Department getDep() {
        return dep;
    }

    public void setDep(Department dep) {
        this.dep = dep;
    }
}
