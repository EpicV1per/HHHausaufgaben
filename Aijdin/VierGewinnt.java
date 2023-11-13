package HHHausaufgaben.Aijdin;

public class VierGewinnt {
    public static void main(String[] args) {
        char[][] sampleField = {
            {'X', 'O', '_'},
            {'O', 'X', '_'},
            {'X', 'O', 'O'}
        };
        insertToken(sampleField, 'X', 2);
        printField(sampleField);
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
    
    public static void insertToken(char[][] field, char token, int index) {
        for (int counter = field.length - 1; counter >= 0; counter--) {
            if (field[counter][index] == '_') {
                field[counter][index] = token;
                break;
            }
        }
    }


}
