package ru.kostenko.springcourse;

public class BaseEntity {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id=" + id +
                '}';
    }

    public boolean isNew(){
        return (this.getId() == null);
    }

    public BaseEntity(Long id) {
        this.id = id;
    }
}
