public class Calculator {
    //TODO: Limiting decimal point result to certain degree
    //TODO: Storing result and last operation (Do it here or elsewhere)
    //TODO: [NOT DONE HERE] Clearing var1 and var2
    public Calculator() {
        final long version = 20220922L;
        System.out.println("Calculator version: "+version);
    }

    public double calculate(double var1, double var2, Operations CurrentOperation) throws IllegalStateException {

        double result = 0;


        try {
            switch (CurrentOperation) {
                case ADD -> result = var1 + var2;
                case DIVIDE -> result = var1 / var2;
                case MULTIPLY -> result = var1 * var2;
                case SUBS -> result = var1 - var2;
                case NONE -> throw new IllegalStateException("No Operation Selected");
                default -> throw new Exception("Unexpected exception");
            }
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}