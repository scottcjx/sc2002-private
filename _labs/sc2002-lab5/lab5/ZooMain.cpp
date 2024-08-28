#include <iostream>
#include <string>

#include "Animal.h"
#include "childAnimal.h"

using namespace std;

int main()
{
    int choice;

    cout << "Select the animal to send to Zoo:" << endl;
    cout << "(1) Dog (2) Cat (3) Lion (4) Move all animals (5) Quit" << endl;
    cin >> choice;

    // Animal *pAnimal;
    Mammal mammals[3];

    switch (choice)
    {
        case 1:
            mammals[0] = Dog("dog", Black, "dog_owner");
            break;
        case 2:
            mammals[0] = Cat("catto", Blue, "cat_owner");
            break;
        case 3:
            mammals[0] = Lion("lionness", Green);
            break;
        case 4:
            mammals[0] = Dog("dog", Black, "dog_owner");
            mammals[1] = Cat("catto", Blue, "cat_owner");
            mammals[2] = Lion("lionness", Green);

            for (int i = 0; i < 3; i++)
            {
                mammals[i].move();
                mammals[i].speak();
                mammals[i].eat();
            }
            break;
        default:
            return 0;
    }

    cout << "Program exiting …. " << endl;
    return 0;
}