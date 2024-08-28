
#ifndef ANIMAL_H_
#define ANIMAL_H_

#include <iostream>
#include <string>

using namespace std;

enum COLOR
{
    Green,
    Blue,
    White,
    Black,
    Brown
};

class Animal
{
public:
    Animal() : _name("unknown")
    {
        cout << "constructing Animal object " << _name << endl;
    }

    Animal(string n, COLOR c)
    {
        _name = n;
        _color = c;

        cout << "constructing Animal object :";
        cout << " name: " << _name;
        cout << " color: " << _color << endl;
    }

    ~Animal()
    {
        cout << "destructing Animal object " << _name << endl;
    }
    void speak() const
    {
        cout << "Animal speaks " << endl;
    }
    void move() const {}
    // void eat() const {}

private:
    string _name;
    COLOR _color;
};

class Mammal : public Animal
{
public:
    Mammal(string name, COLOR color) : Animal(name, color) {}
    Mammal() : Animal() {}

    ~Mammal()
    {
        cout << "destructing Mammal object " << endl;
    }

    void eat() const
    {
        cout << "Mammal eat " << endl;
    }

    void move() const
    {
        cout << "Mammal moving" << endl;
    }

private:
};

#endif /* !ANIMAL_H_ */
