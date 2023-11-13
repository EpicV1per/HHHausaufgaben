package HHHausaufgaben.Aijdin;

public class VierGewinnt {
    public static void main(String[] args) {
        char[][] sampleField = {
            {'X', 'O', '_', '_'},
            {'X', 'X', '_', '_'},
            {'X', 'O', 'O', 'X'},
            {'X', 'X', 'X', 'O'}
        };
        insertToken(sampleField, 'X', 2);
        printField(sampleField);
        isGameOver(sampleField, 'X');
    }

    /*
        Für diesen code musst du durch jede Reihe und Zeile iteraten
        um die Elemente der Arrays zu drucken

        Pseudocode:
        for each row
            for each column
                print element
            next row
        exit
    */
    public static void printField(char[][] field) {
        for (char[] row : field) {
            for (char cell : row) {
                System.err.print(cell + " ");
            }
            System.err.println();
        }
    }

    /*
        Task:
            Insert Token function, inserte gegeben char token in gegebenen int index
        Solution:   
            Iterate over given column in each row checking if it contain an "empty" field,
            when on an empty field replace with given char token.
        Pseudocode: 
            for each row
                if column index of given row contain "_"
                    replace with given token
                    exit
                else

     */
    public static char[][] insertToken(char[][] field, char token, int index) {
        for (int counter = field.length - 1; counter >= 0; counter--) {
            if (field[counter][index] == '_') {
                field[counter][index] = token;
                return field;
            }
        }
        return null;
    }

    /*
        Task:
            Erstellen Sie die Klassenmethode „isGameOver(char[][] field, char token)“,
            welche prüft, ob es eine 4er Reihe, -Spalte, oder -Diagonale mit dem 
            übergebenen Token gibt. Ist dies der Fall, soll die Methode „true“ zurückgeben, 
            sonst „false“.
        Pseudocode:
            if 4 identical tokens connected in row
                return true
            else
                for each element token of row
                    if check identical token in row above with column+-1
                        check if identical token in row above in column
                        repeat
                        if 4 elements connected
                            return true
                        else
                            return false
                return False
     */
    public static boolean isGameOver(char[][] field, char token) {
        //Check for horizontal wins
        for (char[] row : field) {
            int count = 0;
            for (char cell : row) {
                if (cell == token) {
                    count++;
                    if (count == 4) {
                        System.err.print("horizontal win detection");
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }
        System.err.println();

        //Check for vertical wins
        for (int col = 0; col < field[0].length; col++) {
            int count = 0;
            for (int mod = -1; mod <= 1; mod++) {
                for (int row = 0; row < field.length; row++) {
                    int index = col + mod;
                    if (index >= 0 && index < field[0].length) {
                        if (field[row][index] == token) {
                            count++;
                            if (count == 4) {
                                System.err.print("vertical win detection");
                                return true;
                            }
                        }
                    }
                }
            }
        }
        System.err.print("no win detection");
        return false; // No vertical win detected
    }
}
