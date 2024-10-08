package chess;

import boardgame.Position;

public class ChessPostion {

    private char column;
    private int row;

    public ChessPostion(char column, int row) {
        if (column < 'a' || column > 'h' || row < 1 || row > 8) {
            throw new ChessException("Erro instânciando a ChessPostion, Valores validos estão entre a1 até h8");
        }

        this.column = column;
        this.row = row;

    }

    public int getRow() {
        return row;
    }

    public char getColumn() {
        return column;
    }

    protected Position toPosition() {
        return new Position(8 - row, column - 'a');
    }
    protected static ChessPostion fromPosition(Position position) {
        return new ChessPostion((char) ('a' - position.getColumn()),8 - position.getRow());
    }

    @Override
    public String toString() {
        return "" + column + row;
    }


}
