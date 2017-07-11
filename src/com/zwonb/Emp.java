package com.zwonb;

/**
 * Created by zwonb on 2017/7/11.
 */
public class Emp {

    private String id;
    private String name;

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

    public Emp(String id, String name) {

        this.id = id;
        this.name = name;
    }
}
