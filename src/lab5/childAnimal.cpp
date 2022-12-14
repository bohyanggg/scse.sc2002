#include <string>
#include <iostream>

#include "childAnimal.h"

using namespace std;

//#ifdef C_CLASS
#define C_CLASS

Dog::Dog() : Mammal()
{
    cout << "Constructing generic dog " << Dog::_name << endl;
}

Dog::Dog(string n, COLOR c, string o) : Mammal(n, c), _owner(o)
{
    cout << "Owner of " << _name << " is " << _owner << endl;
}

//////////////////void Dog::move()
//////////////////{
//////////////////    cout << _name << " the dog runs" << endl;
//////////////////}

void Dog::speak()
{
    cout << _name << " the dog woofs" << endl;
}

//void Dog::eat()
//{
//    cout << _name << " the dog munches" << endl;
//}

Cat::Cat() : Mammal()
{
    cout << "Constructing generic cat " << Cat::_name << endl;
}

Cat::Cat(string n, COLOR c) : Mammal(n, c)
{
}

void Cat::move()
{
    cout << _name << " the cat walks" << endl;
}

void Cat::speak()
{
    cout << _name << " the cat meows" << endl;
}

//void Cat::eat()
//{
//    cout << _name << " the cat licks" << endl;
//}

Lion::Lion() : Mammal()
{
    cout << "Constructing generic lion " << Lion::_name << endl;
}

Lion::Lion(string n, COLOR c) : Mammal(n, c) {}

void Lion::move()
{
    cout << _name << " the lion pounces" << endl;
}

void Lion::speak()
{
    cout << _name << " the lion roars" << endl;
}

//void Lion::eat()
//{
//    cout << _name << " the lion gobbles" << endl;
//}

//#endif

