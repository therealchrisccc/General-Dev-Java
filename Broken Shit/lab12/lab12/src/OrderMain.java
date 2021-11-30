class OrderMain {

    public static void main(String[] args) {
        Order o = new Order();
        o.readOrder("order3.txt");
        System.out.println(o.orderInfo());
    }

}