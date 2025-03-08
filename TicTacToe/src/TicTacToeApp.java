import util.MyConsole;

public class TicTacToeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyConsole.printHeader("Welcome to TicTacToe!");

		String board = "+---+---+---+\n";
		board += "|	| 	| 	|\n";
		board += "+---+---+---+\n";
		board += "|	| 	| 	|\n";
		board += "+---+---+---+\n";
		board += "|	| 	| 	|\n";
		board += "+---+---+---+\n";

		MyConsole.printLine(board);

		MyConsole.printLine("+---+---+---+");
		MyConsole.printLine("|   |   |   |");
		MyConsole.printLine("+---+---+---+");
		MyConsole.printLine("|   |   |   |");
		MyConsole.printLine("+---+---+---+");
		MyConsole.printLine("|   |   |   |");
		MyConsole.printLine("+---+---+---+");

		String even = ("+---+---+---+");
		String odd = ("|   |   |   |");

		for (int i = 0; i < 7; i++) {
			if (i % 2 == 0) {
				MyConsole.printLine(even);
			} else {
				MyConsole.printLine(odd);
			}
		}

		String boardBoarder = ("+---+---+---+");
		String boardRow = ("| 4 | 5 | 6 |");
		
		String[][] boardom = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };

		String boardString = boardBoarder + "\n";
		// loop through the rows
		for (int r = 0; r < boardom.length; r++) {
			boardString += "|";
			// loop through the columns
			for (int c = 0; c < boardom[r].length; c++) {
				boardString += " " + (boardom[r][c]) + " |";
			}
			boardString += "\n" + boardBoarder + "\n";
		}
		MyConsole.printLine(boardString);

		// p244 twod arrays
		MyConsole.printLine("Bye");
	}

}
