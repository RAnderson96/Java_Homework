public class Printer {
    private int numPagesLeft;
    public Printer(int numPagesLeft) {
        this.numPagesLeft = numPagesLeft;
    }

    public int getNumPagesLeft() {
        return numPagesLeft;
    }

    public void setNumPagesLeft(int numPagesLeft) {
        this.numPagesLeft = numPagesLeft;
    }

    public void printer(int pagesToBePrinted){
        this.numPagesLeft -= pagesToBePrinted;
    }

    public int checkAndPrint(int numPages,int numCopies ){
        int totalPages = numPages * numCopies;
        if (this.numPagesLeft >= totalPages){
            printer(totalPages);
            return this.numPagesLeft;

        }
        int dif = totalPages - this.numPagesLeft;
        System.out.printf("Cannot print, requires %d more pages ", dif);
        return this.numPagesLeft;

    }

}
