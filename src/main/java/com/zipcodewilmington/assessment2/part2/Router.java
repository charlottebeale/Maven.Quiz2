package com.zipcodewilmington.assessment2.part2;

import java.util.Map;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class Router {
    private Map<String, String> list = new LinkedHashMap<>();


    public void add(String path, String controller) {
        list.put(path, controller);
    }

    public Integer size() {

        return list.size();
    }

    public String getController(String path) {

        return list.get(path);
    }

    public void update(String path, String studentController) {
        list.replace(path, studentController);
    }

    public void remove(String path) {
        list.remove(path);
    }


    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        for(String s : list.keySet()){
            sb.append(s).append(list.get(s)).append("\n");
        }
        return sb.toString();
    }
}
