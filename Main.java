import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class MetroRoute {
    private String name;
    private List<Station> stations;
    private Schedule schedule;

}

class Station {
    private String name;

}

class Schedule {
    private Map<Station, List<Train>> schedule;

}

class Train {
    private String name;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private double price;
    private int availableTickets;

}

class TicketService {
    private Map<MetroRoute, List<Train>> availableTrains;

    public TicketService() {
    }

    public List<MetroRoute> getAvailableRoutes() {
        return new ArrayList<>();
    }

    public List<Train> getAvailableTrains(MetroRoute route) {
        return new ArrayList<>();
    }

    public boolean buyTicket(MetroRoute route, Train train, String passengerName) {
        return true;
    }

}

public class Main {
    public static void main(String[] args) {
        TicketService ticketService = new TicketService();
    }
}