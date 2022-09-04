package Animals;

/*Так же реализовать класс "Зоопарк", в котором будет храниться любая структура данных животных(массив, стек, очередь),
        в котором организовать приватный массив объектов-животных со следующими методами:
        1.Добавить животное в зоопарк(добавляет новое животное в структуру данных,
        для массива использовать следующий алгоритм https://gospodaretsva.com/urok-27-vstavka-elementov-v-massiv.html
        // , для стека и очереди вы алгоритмы уже знаете)
        2.Убирает животное с номером i из зоопарка
        (Использовать этот алгоритм https://gospodaretsva.com/urok-26-udalenie-elementa-iz-odnomernogo-massiva.html
        // для удаления из массива, для удаления из стека и очереди вы алгоритмы знаете)
        3.Посмотреть информацию о животном с номером i
        4.Заставить животное с номером i издать звук
        5.Напечатать информацию о животных, которые есть на данный момент в зоопарке
        6.Заставить всех животных, которые на данный момент есть в зоопарке, издать звук
        Предоставить пользователю консольный интерфейс(консольное меню),
        который позволяет пользователю добавлять новых животных в зоопарк,
        убирать животных из зоопарка, печатать информацию о конкретном животном(вводя его номер),
        печатать информацию о всех животных в зоопарке на данный момент,
        заставлять животное издавать звук(введя номер животное),
        заставлять издавать звук всех животных, которые на данный момент есть в зоопарке)
        Задание под звёздочкой(необязательное, но плюсы к карме и к оценкам):
        Сделать возможность у животных летать, если это животное птица, проявлять ласку,
        если это домашнее животное и дрессировать, если это животное собака.*/


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    List<Animal> animalList1;

    public Zoo(List <Animal> animalList1){
        this.animalList1 = animalList1;
    }


    public void addAnimal(Animal animal){

        animalList1.add(animal);
    }

    public void delAnimal(int number){
        animalList1.remove(number);
    }

    public void infoAnimal(int number){
        animalList1.get(number).getClass().getSimpleName();
        System.out.println(animalList1.get(number).printInfo());
    }

    public void sound(int number){
        animalList1.get(number).makeSound();
    }


    public void allInfoAnimal(){
        for (Animal animal : animalList1) {
            System.out.println(animal.getClass().getSimpleName() + ": " + animal.printInfo());
        }
    }

    public void allSound(){
        for (Animal animal : animalList1) {
            animal.makeSound();
        }
    }











}
