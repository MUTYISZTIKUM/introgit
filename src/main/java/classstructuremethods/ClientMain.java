package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {

        Client client = new Client();

        client.setName("Földes Gábor");
        client.setYear(1986);
        client.setAddress("Pannónia utca 66");

        System.out.println(client.getName());
    }
}
