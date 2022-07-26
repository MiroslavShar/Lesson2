public class Car { //создал класс
    private String color; //модификатор private - поля класса Car не будут использованы вне класса
    private int year;
    private String brand;

    public Car(String color, int year, String brand){
        this.color = color;
        this.year = year;
        this.brand = brand;
    }

    public String getColor() { // создаем геттер. Возвращаем значение
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear() {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand() {
        this.brand = brand;
    }
}
