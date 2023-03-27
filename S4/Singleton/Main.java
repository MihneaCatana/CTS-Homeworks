package Singleton;

public class Main {

    public static void main(String[] args){

        Server server = Server.getInstance(3000,"Singleton.Server React");
        Server server2 = Server.getInstance(8000,"Singleton.Server Backend");

        System.out.println(server.toString());
        System.out.println(server2.toString());
    }
}
