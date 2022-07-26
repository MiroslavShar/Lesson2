public class WorldOfClass { // Здесь мы создали класс
    // Class это шаблон, конструктор где мы создаем объекты
    // Оператор import сообщает компилятору Java, где найти классы, на которые ссылается код.
    public static void main(String[] args){
        Car auto = new Car("Blue", 2010, "Ford");
        String autoColor = auto.getColor();
        int autoYear = auto.getYear();
        String autoBrand = auto.getBrand();

        System.out.println("Tsvet avtomobila: " + autoColor);
        System.out.println("God avtomobila: " + autoYear);
        System.out.println("Marka avtomobila: " + autoBrand);

    }
}


