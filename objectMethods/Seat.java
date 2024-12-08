package objectMethods;

public class Seat {
    private int row;
    private int col;
    private String preference;
    private boolean assigned;

    public Seat(int row, int col, String preference) {
        this.row = row;
        this.col = col;
        this.preference = preference;
        this.assigned = false;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public String getPreference() {
        return preference;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void assign() {
        this.assigned = true;
    }

    public void unassign() {
        this.assigned = false;
    }
}