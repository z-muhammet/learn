
#include <iostream>
#include <string>
#include "mainHumanManage.h"
using namespace std;
class student : public mainHumanManage

{
private:
    string name[20];
    string surname[20];
    int schollNumber[20];
    string schollClass[20];

public:
    void setSchollNumber(int _schollNumber, int _numberOfScholl)
    {
        schollNumber[_numberOfScholl] = _schollNumber;
    }
    void setName(string _name, int _numberOfScholl)
    {
        name[getOrderHuman(_numberOfScholl, getIdOfhuman(getStudentList(), 0), getStudentList())] = _name;
    }
    void setSurname(string _surname, int _numberOfScholl)
    {
        surname[getOrderHuman(_numberOfScholl, getIdOfhuman(getStudentList(), 0), getStudentList())] = _surname;
    }
    void setSchollClass(string _schollClass, int _numberOfScholl)
    {
        schollClass[getOrderHuman(_numberOfScholl, getIdOfhuman(getStudentList(), 0), getStudentList())] = _schollClass;
    }
    string getName(int _numberOfScholl)
    {
        return name[getOrderHuman(_numberOfScholl, getIdOfhuman(getStudentList(), 0), getStudentList())];
    }
    string getSurName(int _numberOfScholl)
    {
        return surname[getOrderHuman(_numberOfScholl, getIdOfhuman(getStudentList(), 0), getStudentList())];
    }
    string getSchollClass(int _numberOfScholl)
    {
        return schollClass[getOrderHuman(_numberOfScholl, getIdOfhuman(getStudentList(), 0), getStudentList())];
    }
    int getSchollNumber(int _numberOfOrder)
    {
        return schollNumber[_numberOfOrder];
    }
    int *getStudentList()
    {
        return schollNumber;
    }
    void setSchollNumber()
    {
        if (nullChecker(getStudentList()) == -1)
        {
            cout << "log: gioh function error" << endl;
            return;
        }

        schollNumber[getIdOfhuman(getStudentList(), 0)] = schollNumber[getIdOfhuman(getStudentList(), 0) - 1] + 1;
    }
    student(string _name, string _surname, string _schollClass)
    {
        setName(_name, 0);
        setSurname(_surname, 0);
        setSchollClass(_schollClass, 0);
        setSchollNumber(11250, 0);
    }
    student()
    {
        setName("", 0);
        setSurname("", 0);
        setSchollClass("", 0);
        setSchollNumber(11250, 0);
    }
    student(/* args */);
    ~student();
};

student::student()
{
}

student::~student()
{
}
