package AnonymousClasses;

public class AnonymousClasses {
    public static class Robot {                         //klasa wewnętrzna
        private final GreetingModule greetingModule;    //pole klasy wewnętrznej typu wewnętrznego interfejsu zdefiniowanego dalej

        public Robot(GreetingModule greetingModule) {   //konstruktor klasy wewnętrznej
            this.greetingModule = greetingModule;
        }

        public void saySomething() {                    //metoda klasy wewnętrznej
            greetingModule.sayHello();
        }
    }

    public interface GreetingModule {                   //wewnętrzny interface klasy zewnętrznej
        void sayHello();                                //ze swoją metodą
    }

    public static void main(String[] args) {
        Robot jan = new Robot(new GreetingModule() {    //instancja klasy wewnętrznej, do kontruktora wrzucam klasę anonimową?
            @Override                                   //w instacji tej klasy anoniwej, która wygląda na to, że nazywa się tak samo jak interface
            public void sayHello() {                    //nadpisuję metodę z interfaceu
                System.out.println("dzien dobry");
            }
        });
        Robot john = new Robot(new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("good morning");
            }
        });

        Robot helga = new Robot(new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("guten morgen");
            }
        });

        jan.saySomething();
        john.saySomething();
        helga.saySomething();
    }
}
