package com.nanimono.simpleoddb;

import com.nanimono.simpleoddb.object.Object;
import com.nanimono.simpleoddb.object.ClassDesc;

import java.util.HashMap;

public class Catalog {

    private HashMap<String, Object> name2object;

    public Catalog() {
        name2object = new HashMap<>();
    }

    public void addClass(String name, ClassDesc classDesc) {
        if (name == null) {
            throw new IllegalArgumentException();
        }
        if (name2object.containsKey(name)) {
            throw new IllegalArgumentException("Class already exists");
        }

        name2object.put(name, new Object(classDesc));
    }

    public void dropClass(String name) {
        if (name == null) {
            throw new IllegalArgumentException();
        }
        if (!name2object.containsKey(name)) {
            throw new IllegalArgumentException("Class doesn't exist");
        }

        name2object.remove(name);
    }

    public void getClass(String name) {
        if (name == null) {
            throw new IllegalArgumentException();
        }
        if (!name2object.containsKey(name)) {
            throw new IllegalArgumentException("Class doesn't exist");
        }

        return;
    }

    public void clear() {
        name2object.clear();
    }
}
