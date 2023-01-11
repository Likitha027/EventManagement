package org.example;

public class EventDetails {
    public static void main(String[] args)
    {
        Birthday d=new Birthday();
        d.setEventOccasion("Birthday");
        d.setCakeFlavour("ButterScotch");
        d.setCakeShape("Round");
        d.setCakeType("Pastry");
        d.setWeightOfCake("3kg");
        d.setEventTime("7PM");
        d.setDate("15-03-2023");
        d.setEventLocation("Bangalore");
        d.setPrice(1500);

        Flower d1=new Flower();
        d1.setEventOccasion("Haldi ceremony");
        d1.setFlowerType("Gleaming Floral");
        d1.setFlowerColor("Yellow,Red,White");
        d1.setFlowerPrice(10000);
        d1.setDecorationBudget(30000);
        d1.setEventTime("10AM");
        d1.setEventLocation("Bangalore");
        d1.setDate("10-02-2023");
        System.out.println("Event occasion:"+d.getEventOccasion());
        System.out.println("Cake Type :"+d.getCakeType());
        System.out.println("Cake Flavour:"+d.getCakeFlavour());
        System.out.println("Cake shape:"+d.getCakeShape());
        System.out.println("Weight Of Cake:"+d.getWeightOfCake());
        System.out.println("Event Time:"+d.getEventTime());
        System.out.println("Cake Price:"+d.getPrice());
        System.out.println("Event Date:"+d.getDate());
        System.out.println("Event Location:"+d.getEventLocation());
        System.out.println("");
        System.out.println("Event occasion:"+d1.getEventOccasion());
        System.out.println("Flower Type: "+d1.getFlowerType());
        System.out.println("Flower Color:"+d1.getFlowerColor());
        System.out.println("Flower Price:"+d1.getFlowerPrice());
        System.out.println("Event Location:"+d1.getEventLocation());
        System.out.println("Event Date:"+d1.getDate());
        System.out.println("Decoration Budget:"+d1.getDecorationBudget());
        System.out.println("Event Time:"+d1.getEventTime());
    }
}
