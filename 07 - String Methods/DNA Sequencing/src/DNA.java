class DNA {

    /**
     * This program determines whether there is a protein in a strand of DNA.
     * @author Dyrits
     */

    public static void main(String[] args) {
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";
        String dna = dna3;
        System.out.println("The length of the DNA Strand is: " + dna.length());
        int indexATG = dna.indexOf("ATG");
        int indexTGA = dna.lastIndexOf("TGA");
        if (indexATG != -1 && indexTGA != -1 && (indexTGA - indexATG) % 3 == 0) {
            String protein = dna.substring(indexATG + 3, indexTGA);
            System.out.println("Protein found: " + protein);
        } else { System.out.println("No protein..."); };
    }
}