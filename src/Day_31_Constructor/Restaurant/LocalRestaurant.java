package Day_31_Constructor.Restaurant;

public class LocalRestaurant {

    public static void main(String[] args) {

        Server server1 = new Server("ali",15,6,true);
        Server server2 = new Server("cem",10,6,true);
        Server server3 = new Server("veli",25,6,false);
        Server server4 = new Server("ayşe",45,6,true);

        Server[] servers = {server2,server3,server4};

        Chef chef1 = new Chef("john",75,10,true);
        Chef chef2 = new Chef("jame",85,10,false);
        Chef chef3 = new Chef("kayi",95,10,true);
        Chef chef4 = new Chef("lami",65,10,true);

        Chef[] chefs = {chef2,chef3,chef4};

        Restaurant restaurant1 = new Restaurant("Efe","Eskişehir",10);

        restaurant1.addServer(server1);
        restaurant1.addServers(servers);

        restaurant1.addChef(chef1);
        restaurant1.addChefs(chefs);

        System.out.println(restaurant1);


    }
}
