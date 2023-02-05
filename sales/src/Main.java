public class Main {
    public static void main(String[] args) {

        int [] sales = {300, 239, 402, 109, 382, 98, 43, 876, 454, 925, 27, 634};
        SalesManager salesManager = new SalesManager(sales);

        System.out.println(salesManager.max());
    }
}
