#include <iostream>
#include <string>

#include "animalClass.h"
#include "childAnimal.h"

int main()
{
    Mammal **mammals = new Mammal *[3];
    mammals[0] = new Dog("Doggo", Brown, "Zheng Han");
    mammals[1] = new Cat("MaoMao", White);
    mammals[2] = new Lion("BigMeow", Brown);

    int input = -1;

    while (input != 0 && input != 5)
    {
        std::cout << "Select the animal to send to the zoo:" << std::endl
                  << "(1) Dog (2) Cat (3) Lion (4) Move all animals (5) Quit: " << std::endl;
        std::cin >> input;

        //Must store in mammals[] array:
        //1. Animal Class is abstract class and cannot be declared as an animal object
        //2. Animal Class does not have the eat() method defined

        switch (input)
        {
        case 1:
            mammals[0]->move();
            mammals[0]->speak();
            mammals[0]->eat();
            break;

        case 2:
            mammals[1]->move();
            mammals[1]->speak();
            mammals[1]->eat();
            break;

        case 3:
            mammals[2]->move();
            mammals[2]->speak();
            mammals[2]->eat();
            break;

        case 4:
            for (int i = 0; i < 3; i++)
            {
                mammals[i]->move();
                mammals[i]->speak();
                mammals[i]->eat();
                std::cout << std::endl;
            }
            break;

        case 5:
            break;

        default:
            break;
        }
    }

    return 0;
}
