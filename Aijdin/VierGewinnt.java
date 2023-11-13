public class VierGewinnt {
    public static void main(String[] args) {
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

    
}
