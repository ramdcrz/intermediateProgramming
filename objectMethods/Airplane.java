package objectMethods;

public class Airplane {
    private Seat[][] firstClass;
    private Seat[][] economyClass;

    public Airplane() {
        firstClass = new Seat[5][2];
        economyClass = new Seat[10][4];
        initializeSeats(firstClass, 5, 2);
        initializeSeats(economyClass, 10, 4);
    }

    public void initializeSeats(Seat[][] seats, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (seats == firstClass) {
                    seats[i][j] = new Seat(i + 1, j + 1, "W"); // Window seat in First Class
                } else {
                    if (j == 0 || j == cols - 1) {
                        seats[i][j] = new Seat(i + 1, j + 1, "W"); // Window seat in Economy Class
                    } else {
                        seats[i][j] = new Seat(i + 1, j + 1, "A"); // Aisle seat in Economy Class
                    }
                }
            }
        }
    }

    public String addPassengers(String classType, int numPassengers, String preference) {
        Seat[][] seats;
        if (classType.equalsIgnoreCase("F")) {
            seats = firstClass;
        } else {
            seats = economyClass;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numPassengers; i++) {
            boolean seatAssigned = false;
            while (!seatAssigned) {
                // Iterate through seats in the specified order
                for (int r = 0; r < seats.length; r++) {
                    for (int c = 0; c < seats[r].length; c++) {
                        if (seats == firstClass) {
                            if (!seats[r][c].isAssigned()) {
                                seats[r][c].assign();
                                seatAssigned = true;
                                sb.append((r + 1) + "" + (char) (c + 65) + " "); // Appending seat location
                                break;
                            }
                        } else {
                            if (preference.equalsIgnoreCase("W")) {
                                // Window seats: 1A to 10A and 1D to 10D
                                if ((c == 0 || c == seats[r].length - 1) && !seats[r][c].isAssigned()) {
                                    seats[r][c].assign();
                                    seatAssigned = true;
                                    sb.append((r + 1) + "" + (char) (c + 65) + " "); // Appending seat location
                                    break;
                                }
                            } else {
                                // Aisle seats: 1B to 10B and 1C to 10C
                                if ((c == 1 || c == seats[r].length - 2) && !seats[r][c].isAssigned()) {
                                    seats[r][c].assign();
                                    seatAssigned = true;
                                    sb.append((r + 1) + "" + (char) (c + 65) + " "); // Appending seat location
                                    break;
                                }
                            }
                        }
                    }
                    if (seatAssigned) {
                        break;
                    }
                }
            }
        }

        return "Assigned seats: " + sb.toString();
    }

    public String printSeats(Seat[][] seats) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                String status = seats[i][j].isAssigned() ? "Assigned" : "Available";
                sb.append(i + 1).append(" ").append((char) (j + 65)).append(" ").append(status);
                if (j < seats[i].length - 1) {
                    sb.append("\t");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public String showSeating() {
        StringBuilder sb = new StringBuilder();
        sb.append("First Class:\n");
        sb.append(printSeats(firstClass));
        sb.append("\n");
        sb.append("Economy Class:\n");
        sb.append(printSeats(economyClass));
        return sb.toString();
    }
}