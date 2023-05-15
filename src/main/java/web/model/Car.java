package web.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {
    private String model;
    private String series;
    private int yearOfIssue;

    public Car(String model, String series, int yearOfIssue) {
        this.model = model;
        this.series = series;
        this.yearOfIssue = yearOfIssue;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public static List<Car> createCarsList() {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("VAZ", "2109", 2003));
        carsList.add(new Car("VAZ", "2112", 2011));
        carsList.add(new Car("Mercedes", "B-class", 2015));
        carsList.add(new Car("Mercedes", "CLS", 2008));
        carsList.add(new Car("McLaren", "650", 2022));
        return carsList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (yearOfIssue != car.yearOfIssue) return false;
        if (!Objects.equals(model, car.model)) return false;
        return Objects.equals(series, car.series);
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + (series != null ? series.hashCode() : 0);
        result = 31 * result + yearOfIssue;
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                '}';
    }
}
