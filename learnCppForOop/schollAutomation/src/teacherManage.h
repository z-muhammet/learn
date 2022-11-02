#include "mainManage.h"
#include <string>
#include <iostream>
#include "teacher.h"
using namespace std;
class teacherManage : protected mainManage
{
private:
public:
    teacher *teach = new teacher();
    teacherManage()
    {
        teacher *teache = teach;
    }

    int getLastIdOfTeacher(int *humanList, int number)
    {
        if (humanList[number] == 0)
        {
            return number;
        }
        else
        {
            getLastIdOfTeacher(humanList, number++);
        }
        return -1;
    }

    void addTeacher(string _name, string _surname, string _branch)
    {
        if (teach->getName(2450) == "")
        {
            teach->setName(_name, 2450);
            teach->setSurname(_surname, 2450);
            teach->setTeacherBranch(_branch, 2450);
        }
        else
        {
            teach->setName(_name, getLastIdOfTeacher(teach->getTeacherList(), 0), true);
            teach->setSurname(_surname, getLastIdOfTeacher(teach->getTeacherList(), 0), true);
            teach->setTeacherBranch(_branch, getLastIdOfTeacher(teach->getTeacherList(), 0), true);
            teach->setIdOfTeacher();
        }
    }
    void listTeacher()
    {
        int i = 0;
        while (i <= getLastIdOfTeacher(teach->getTeacherList(), 0))
        {
            cout << "id: " << teach->getTeacherId(i)
                 << "Name: " << teach->getName(i, true) << endl
                 << "SurName: " << teach->getSurName(i, true) << endl
                 << "Branch: " << teach->getTeacherBranc(i, true);
            i++;
        }
    }
    void editTeacher(int _teacherId, string _teacherName, string _teacherSurName, string _teacherBranch)
    {
        teach->setName(_teacherName, _teacherId);
        teach->setSurname(_teacherSurName, _teacherId);
        teach->setTeacherBranch(_teacherBranch, _teacherId);
    }
    void editTeacherId()
    {
        int *ptr = teach->getTeacherList();
        cout << ptr[0];
    }
};
