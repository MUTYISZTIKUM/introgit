package classstructuremethods;

public class TrainerMain {

    public static void main(String[] args) {

        Trainer trainer = new Trainer();

        trainer.setName("John Doe");
        trainer.setYearOfBirth(1986);

        System.out.println("Name: " + trainer.getName());

        trainer.setName("Földes Gábor");

        System.out.println("Name: " + trainer.getName());
        int age =  trainer.getAge(2024);

        System.out.println(age +2);
        trainer.printTrainer(2024);


    }
}
