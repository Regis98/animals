public enum MapDirection {
    NORTH,
    NORTH_EAST,
    EAST,
    NORTH_WEST,
    WEST,
    SOUTH,
    SOUTH_EAST,
    SOUTH_WEST;

    @Override
    public String toString() {
        switch (this){
            case NORTH:
                return "Północ";
            case NORTH_EAST:
                return "Północny Wschód";
            case EAST:
                return "Wschód";
            case SOUTH_EAST:
                return "Południowy Wschód";
            case SOUTH:
                return "Południe";
            case SOUTH_WEST:
                return "Południowy Zachód";
            case WEST:
                return "Zachód";
            case NORTH_WEST:
                return "Północny Zachód";
            default:
                return "Błędne dane";
        }
    }
    public Position vector(){
        int x = 0;
        int y = 0;
        switch (this){
            case SOUTH_WEST:
                x = -1;
                y = -1;
                break;
            case SOUTH_EAST:
                x = +1;
                y = -1;
                break;
            case NORTH_WEST:
                x = -1;
                y = +1;
                break;
            case NORTH_EAST:
                x = +1;
                y = +1;
                break;
            case NORTH:
                y = +1;
                break;
            case SOUTH:
                y = -1;
                break;
            case WEST:
                x = -1;
                break;
            case EAST:
                x = +1;
                break;
        }
        return new Position(x,y);
    }
}