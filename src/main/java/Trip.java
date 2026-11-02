public class Trip {
    private final Zone fromZone;
    private final Zone toZone;

    public Trip(Zone from, Zone to)
    {
        fromZone = from;
        toZone = to;
    }

    public Zone getTo()
    {
        return toZone;
    }

    public Zone getFrom()
    {
        return fromZone;
    }

    public int getPrice()
    {
        int zoneDifference;

        if (fromZone.getNumber() < toZone.getNumber())
        {
            zoneDifference = toZone.getNumber() - fromZone.getNumber();
        }
        else
        {
            zoneDifference = fromZone.getNumber() - toZone.getNumber();
        }

        int price = 3;

        price += zoneDifference;

        return price;
    }

    @Override
    public String toString()
    {
        return "From " + fromZone.getName() + " to " + toZone.getName();
    }
}
