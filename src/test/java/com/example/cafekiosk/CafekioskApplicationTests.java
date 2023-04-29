package com.example.cafekiosk;

import com.example.cafekiosk.unit.CafeKiosk;
import com.example.cafekiosk.unit.beverage.Americano;
import org.junit.jupiter.api.Test;

class CafekioskApplicationTests {

  @Test
  void add() {
    CafeKiosk cafeKiosk = new CafeKiosk();
    cafeKiosk.add(new Americano());

    System.out.println(">>> 담긴 음료 수: " + cafeKiosk.getBeverages().size());
    System.out.println(">>> 담긴 음료: " + cafeKiosk.getBeverages().get(0).getName());
  }
}
