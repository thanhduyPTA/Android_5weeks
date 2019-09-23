package com.e.app_bai01;

public class NhanVien {
    private String id;
    private String name;
    private boolean gender;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public NhanVien() {
        super();
    }

    @Override
    public String toString() {
        return this.id + " - " + this.name;
    }

    public NhanVien(String id, String name, boolean gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
}
