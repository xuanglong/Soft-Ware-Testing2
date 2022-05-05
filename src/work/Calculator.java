package work;

import java.io.FileWriter;
import java.io.IOException;

public abstract class Calculator {
    protected double accuracy;

    public Calculator(double accuracy) {
        this.accuracy = accuracy;
    }

    public abstract double calculate(double x);

    public void saveToCsv(String filePath, double x, double limit, double step){
        try(FileWriter writer = new FileWriter(filePath, false)) {
            writer.write(toCsv(x, limit, step));
            writer.flush();
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public String toCsv(double x, double limit, double step){
        StringBuilder result = new StringBuilder();
        while (x <= limit){
            result.append(x).append(", ").append(calculate(x)).append("\n");
            x += step;
        }
        return result.toString();
    }
}
