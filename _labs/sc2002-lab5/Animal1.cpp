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
    virtual void speak() const
    {
        cout << "Animal speaks " << endl;
    }
    void move() const {}
    // virtual void move() = 0;

private:
    string _name;
    COLOR _color;
};

class Mammal : public Animal
{
public:
    Mammal(string name, COLOR color) : Animal(name, color) {}

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

    virtual void speak() const
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

int main()
{
    Animal a;
    a.speak();

    Animal b("Cow", Blue);
    b.speak();

    Mammal m("Otter", Black);
    m.speak();

    Dog dog("muffin", Brown, "Scott");
    dog.speak();
    dog.move();

    cout << "Program exiting …. " << endl;
    return 0;
}