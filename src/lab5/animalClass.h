#include <string>

using namespace std;

#ifndef A_CLASS
#define A_CLASS

enum COLOR
{
    Green,
    Blue,
    White,
    Black,
    Brown
};

class Animal;
class Animal
{
public:
    Animal();
    Animal(string n, COLOR c);
    ~Animal();
    virtual void move() = 0; ////////////////////////////////////////////////
    virtual void speak(); ///////////////////////////////////////////////////
    //void speak();

protected:
    string _name;
    COLOR _color;
};

class Mammal;
class Mammal : public Animal
{
public:
    Mammal();
    Mammal(string n, COLOR c);
    virtual void move();
    void eat() const;
    //virtual void eat();
};

#endif //A_CLASS
