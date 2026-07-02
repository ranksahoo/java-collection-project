package com.example;

import java.util.Objects;

public class EqualsMethodMain {
    protected static class Car{
        private String make;
        private String model;
        private int mileage;

        public Car(String make, String model, int mileage) {
            this.make = make;
            this.model = model;
            this.mileage = mileage;
        }

        public String getMake() {
            return make;
        }

        public String getModel() {
            return model;
        }

        public int getMileage() {
            return mileage;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Car car = (Car) obj;
            return mileage == car.mileage &&
                    make.equals(car.make) &&
                    model.equals(car.model);
        }

        @Override
        public int hashCode() {
            return Objects.hash(make, model, mileage);
        }
    }
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Toyota", "Camry", 2020);

        System.out.println("Using '==': " + (car1 == car2)); // false, different references
        System.out.println("Using 'equals()': " + car1.equals(car2)); // true, same content
    }
}
