/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author hp
 */
public class Kucing extends Hewan {
    @Override
    public void bersuara() {
        System.out.println("Meow");
    }
}

class Anjing extends Hewan {
    @Override
    public void bersuara() {
        System.out.println("Woof");
    }
}
