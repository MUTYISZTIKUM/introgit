package classstructureio;

public class TrainerMain {
    public static void main(String[] args) {

            Trainer aladar = new Trainer();
            aladar.name = "Földes Gábor";
            aladar.yaerOfBirth = 1986;

            System.out.println(aladar.name+ " " +aladar.yaerOfBirth);

            Trainer bela = new Trainer();
            bela.name = "Bella Bela";
            bela.yaerOfBirth = 1993;

            System.out.println(bela.name+ " " +bela.yaerOfBirth);
            System.out.println(aladar.name);
    }
}
