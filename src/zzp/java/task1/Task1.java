package zzp.java.task1;

public class Task1 {
    public static void main(String[] args) {
        Sauce tomato = new Sauce("tomato sauce");
        Sauce sourCream = new Sauce("sour cream sauce");
        Extra onion = new Extra("onion");
        Extra bellPepper = new Extra("bellPepper");
        Extra mushrooms = new Extra("mushrooms");
        Extra cheese = new Extra("cheese");
        Extra sausage = new Extra("sausage");

        Pizza p1 = new Pizza.Builder(PizzaSize.SMALL, sourCream).saucePosition(SaucePosition.SAUCE_INSIDE).extra(cheese).extra(bellPepper).extra(onion).build();
        System.out.println(p1);
    }
}
