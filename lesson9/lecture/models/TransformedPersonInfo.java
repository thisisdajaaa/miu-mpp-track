package lesson9.lecture.models;

import lesson9.lecture.Main;

import java.util.ArrayList;
import java.util.List;

public class TransformedPersonInfo {
    private String name;
    private List<TransformedPerson> personList = new ArrayList<>();

    public TransformedPersonInfo(String name, List<TransformedPerson> personList) {
        this.name = name;
        this.personList = personList;
    }

    @Override
    public String toString() {
        return "TransformedPersonInfo{" +
                "name='" + name + '\'' +
                ", personList=" + personList +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TransformedPerson> getPersonList() {
        return personList;
    }

    public void setPersonList(List<TransformedPerson> personList) {
        this.personList = personList;
    }
}