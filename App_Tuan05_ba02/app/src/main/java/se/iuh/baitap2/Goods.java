package se.iuh.baitap2;

public class Goods {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Goods(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Goods() {
        super();
    }

    @Override
    public String toString() {
        return this.id + "-" + this.name;
    }
}
