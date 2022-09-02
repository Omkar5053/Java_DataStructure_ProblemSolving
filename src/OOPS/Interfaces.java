package OOPS;

public class Interfaces {
    public static void main(String[] args)
    {
        Queen q = new Queen();
        q.moves();
    }
}
interface chessPlayer{
    void moves();
}
class Queen implements chessPlayer{
    public void moves()
    {
        System.out.println("up, right, down, left, diagonal(in all four directions)");
    }
}
class Rook implements chessPlayer{
    @Override
    public void moves() {
        System.out.println("up, down, right, left");
    }
}
class King implements chessPlayer{
    public void moves(){
        System.out.println("up, right, down, left, diagonal(by 1 step)");
    }
}
