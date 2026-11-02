void main() {
    var zone1 = new Zone(1, "Airport");
    var zone2 = new Zone(2, "Los Llanos");
    var zone3 = new Zone(3, "Rockwell");
    var zone4 = new Zone(4, "Longport Keys East");

    var myCard = new TravelCard();
    var trip = new Trip(zone2, zone3);

    myCard.toUp(100);

    myCard.travel(trip);

    IO.println(myCard.getBalance());

    myCard.toUp(-90);

    myCard.travel(new Trip(zone1, zone4));

    myCard.toUp(-10);
    myCard.toUp(201);
    IO.println(myCard.getBalance());
}