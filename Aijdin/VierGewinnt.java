public class VierGewinnt {
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



    public static void main(String[] args) {
        char[][] sampleField = {
            {'X', 'O', 'X'},
            {'O', 'X', 'O'},
            {'X', 'O', 'X'}
        };
        printField(sampleField);
    }

    public static void printField(char[][] field) {
        for (char[] row : field) {
            for (char cell : row) {
                System.err.print(cell + " ");
            }
            System.err.println();
        }
    }
}
