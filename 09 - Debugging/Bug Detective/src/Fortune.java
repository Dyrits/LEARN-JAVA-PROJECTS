class Fortune {

    public static void main(String[] args) {

        Fortune fortuneCookie = new Fortune();
        int fortune = fortuneCookie.generateRandom();

        switch (fortune) {
            case 0: System.out.println("Flattery will go far tonight."); break;
            case 1: System.out.println("Don't behave with cold manners."); break;
            case 2: System.out.println("May you someday be carbon neutral"); break;
            case 3: System.out.println("You have rice in your teeth."); break;
            case 4: System.out.println("A conclusion is simply the place where you got tired of thinking."); break;
            case 5: System.out.println("No snowflake feels responsible in an avalanche."); break;
            case 6: System.out.println("He who laughs last is laughing at you."); break;
            case 7: System.out.println("If you look back, you'll soon be going that way."); break;
            case 8: System.out.println("You will die alone and poorly dressed."); break;
            case 9: System.out.println("The fortune you seek is in another cookie."); break;
            default: break;
        }
    }

    public int generateRandom() { return (int) (Math.random() * 10); }

}