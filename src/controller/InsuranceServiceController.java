package controller;

import model.Database;
import model.DatabaseImpl;
import model.Insurance;
import model.RepairService;

import java.util.ArrayList;
import java.util.TreeSet;

public class InsuranceServiceController {
    Database database;

    public InsuranceServiceController() {
        this.database = new DatabaseImpl();
    }

    public void writeToFile(TreeSet<Insurance> insurances, String fileName) {
        this.database.writeToFile(insurances, fileName);
    }

    public void writeToFile(ArrayList<Insurance> insurances, String fileName) {
        this.database.writeToFile(insurances, fileName);
    }

    public ArrayList<Insurance> readDataFromFile(String fileName) {
        return (ArrayList<Insurance>) this.database.readDataFromFile(fileName);
    }
}