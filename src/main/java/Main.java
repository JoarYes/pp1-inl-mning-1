void main() {
    var zone1 = new Zone(1, "Airport");
    var zone2 = new Zone(2, "Los Llanos");
    var zone3 = new Zone(3, "Rockwell");
    var zone4 = new Zone(4, "Longport Keys East");

    var myCard = new TravelCard();
    var friendCard = new TravelCard();

    IO.println(myCard.toString());
    IO.println(friendCard.toString());

    myCard.topUp(100);
    friendCard.topUp(5);

    var firstTrip = new Trip(zone1, zone3);
    var friendTrip = new Trip(zone2, zone1);
    var otherTrip = new Trip(zone3, zone4);

    myCard.travel(firstTrip);
    myCard.travel(friendTrip);
    friendCard.travel(friendTrip);
    myCard.travel(otherTrip);

    IO.println(myCard.toString());
    IO.println(friendCard.toString());

    var expensiveTrip = new Trip(zone4, zone1);

    friendCard.travel(expensiveTrip);

    myCard.topUp(150);
    friendCard.topUp(-10);

    IO.println(TravelCard.getIssuedCount());
}