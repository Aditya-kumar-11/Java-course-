package Inheritance;
class Animal {
public void heart() {
System.out.println("We have heart");
}}
class Mammal extends Animal {
public void MammaryGlands() {
System.out.println("We have Mammary glands!");
}}
class Reptile extends Animal {
public void Hiss() {
System.out.println("Hiss Hiss!!");
}}
public class dog extends Mammal {
public void bark() {
System.out.println("Dogs bark Bow Bow!");
}
public static void main(String[] args) {
// TODO Auto-generated method stub
dog d = new dog();
d.bark();
d.MammaryGlands();
d.heart();
}}
