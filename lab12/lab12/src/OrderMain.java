class OrderMain {

    public static void main(String[] args) {
        Order o = new Order();
        o.readOrder("order2.txt");
        System.out.println(o.orderInfo());
    }

}