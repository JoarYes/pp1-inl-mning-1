public class TravelCard {
    private final int MAX_BALANCE = 200;
    private static int nextCardNumber;
    private final int cardNumber;
    private int balance;
    private int tripCount;
    private Trip lastTrip;

    public TravelCard()
    {
        if (nextCardNumber == 0)
        {
            nextCardNumber = 1001;
        }
        cardNumber = nextCardNumber;
        balance = 0;
        tripCount = 0;

        nextCardNumber += 1;
    }

    public void toUp(int amount)
    {
        if (balance + amount <= 0)
        {
            IO.println("Balance can't be negative");
        }
        else
        {
            if ((balance + amount) > MAX_BALANCE)
            {
                IO.println("Exceded max balance amount");
            }
            else {
                balance += amount;
            }
        }
    }

    private void pay(int amount)
    {
        if (balance - amount < 0)
        {
            IO.println("You don't have enough money");
        }
        else
        {
            balance -= amount;
        }
    }

    public void travel(Trip trip)
    {
        if (trip != null)
        {
            pay(trip.getPrice());

            tripCount += 1;
            lastTrip = trip;
        }
        else
        {
            IO.println("Trip must not be null");
        }
    }

    public int getNumber()
    {
        return cardNumber;
    }

    public int getBalance()
    {
        return balance;
    }

    public int getTripCount()
    {
        return tripCount;
    }

    public Trip getLastTrip()
    {
        return lastTrip;
    }

    public int getIssuedCount()
    {
        return cardNumber - 1000;
    }

    @Override
    public String toString()
    {
        String tripString;
        if (lastTrip == null)
        {
            tripString = "No trips made";
        }
        else
        {
            tripString = lastTrip.toString();
        }

        return "Card: " + cardNumber + "\n" +
                balance + " Euro, " + tripCount + " trips \n" +
                "Last trip: " + tripString;
    }
}
