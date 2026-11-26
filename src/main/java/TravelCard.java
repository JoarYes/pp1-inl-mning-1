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

    public boolean topUp(int amount)
    {
        if (balance + amount <= 0)
        {
            IO.println("Balance can't be negative");
            return false;
        }
        else
        {
            if ((balance + amount) > MAX_BALANCE)
            {
                IO.println("Exceded max balance amount");
                return false;
            }
            else {
                balance += amount;
                return true;
            }
        }
    }

    public boolean pay(int amount)
    {
        if (amount <= 0) return false;

        if (balance - amount < 0)
        {
            IO.println("You don't have enough money");
            return false;
        }
        else
        {
            balance -= amount;
            return true;
        }
    }

    public boolean travel(Trip trip)
    {
        if (trip != null)
        {
            if (!pay(trip.getPrice())) return false;

            tripCount += 1;
            lastTrip = trip;

            return true;
        }
        else
        {
            IO.println("Trip must not be null");

            return false;
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

    static int getIssuedCount()
    {
        return nextCardNumber - 1001;
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
                "Last trip: " + tripString + "\n";
    }
}
