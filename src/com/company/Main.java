package com.company;
//      Балык, Попугай, мышык жана ит деген класс тузунуз
//      Алардын свойстваларын ойлоп табыныз
//      Бир канча объектилерин тузуп жана аларга маанилерин бериниз
//      Аларды консольго чыгарыныз
//      Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек

public class Main {

    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.setName("Fish");
        fish.setPrice(500);
        fish.setType("Farel");
        fish.method(fish.getName(), fish.getPrice(), fish.getType());


        Parrot parrot = new Parrot();
        parrot.setName("Pap");
        parrot.setAge(5);
        parrot.setColor("Green");
        parrot.method(parrot.getName(), parrot.getAge(),parrot.getColor());

        Cat cat = new Cat();
        cat.setName("Tom");
        cat.setAge(7);
        cat.setColor("Blue");
        cat.method(cat.getName(), cat.getAge(), cat.getColor());



        Dog dog = new Dog();
        dog.setName("Aktosh");
        dog.setAge(3);
        dog.setColor("Brown");
        dog.method(dog.getName(), dog.getAge(), dog.getColor());


    }
}






//        Car car = new Car();
//        car.setName("Odissey");
//        car.setModel("Honda");
//        car.setColor("White");
//        car.setSpeed(90);
//        car.metod(car.getName(), car.getModel(), car.getColor(), car.getSpeed());
//    }
//}





//        Books books = new Books();
//        books.setName("Harry Potter");
//        books.setCengre("Roman");
//        books.setPage(800);
//        books.setYear(1990);
//        books.method(books.getName(),books.getCengre(),books.getPage(),
//                books.getYear());
//    }
//}


//        House house = new House();
//        house.setHeight(5);
//        house.setWidth(10);
//        house.setKrysha(3);
//        house.method(house.getHeight(), house.getWidth(),house.getKrysha());
//    }
//}
//
//        Circle circle = new Circle();
//        circle.setHeight(10);
//        circle.setWidth(5);
//        circle.setRadius(2);
//        circle.method(circle.getHeight(),circle.getWidth(),
//                circle.getRadius());
//    }
//}

//        Rectangle rectangle = new Rectangle();
//        rectangle.setWidth(10.2);
//        rectangle.setHeight(20.6);
//        System.out.println(rectangle.method(rectangle.getHeight(),
//                rectangle.getWidth()));
//    }
// }




//        Student student = new Student();
//        student.setName("Nurmuhammad");
//        student.setEmail("@bk.ru");
//        student.setAge(-21);
//
//        System.out.println(student.getName());
//        System.out.println(student.getEmail());
//        System.out.println(student.getAge());
