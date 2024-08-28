

#ifndef CHILDANIMAL_H_
#define CHILDANIMAL_H_

#include "Animal.h"

class Dog : public Mammal
{
public:
    Dog(string name, COLOR color, string o) : Mammal(name, color)
    {
        owner = o;
    }
    ~Dog()
    {
        cout << "destructing Dog object " << endl;
    }

    void speak() const
    {
        cout << "Woof " << endl;
    }

    void move() const
    {
        cout << "Dog moving" << endl;
    }

private:
    string owner;
};

class Cat : public Mammal
{
public:
    Cat(string name, COLOR color, string o) : Mammal(name, color)
    {
        owner = o;
    }

    ~Cat()
    {
        cout << "destructing Cat object " << endl;
    }

    void speak() const
    {
        cout << "Meow " << endl;
    }

    void move() const
    {
        cout << "Cat moving" << endl;
    }

private:
    string owner;
};

class Lion : public Mammal
{
public:
    Lion(string name, COLOR color) : Mammal(name, color)
    {}
    
    ~Lion()
    {
        cout << "destructing Lion object " << endl;
    }

    void speak() const
    {
        cout << "Roar " << endl;
    }

    void move() const
    {
        cout << "Lion moving" << endl;
    }

private:
};


#endif /* !CHILDANIMAL_H_ */
