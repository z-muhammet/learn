#include <iostream>
#include <string>
#include "mainHumanManage.h"
using namespace std;
class teacher : public mainHumanManage
{
private:
   static string name[5];
   static string surname[5];
   static string branch[5];
   static int teacherId[5];

public:
    teacher(string _name, string _surname, string _branch)
    {
        setName(_name, 0);
        setSurname(_surname, 0);
        setTeacherBranch(_branch, 0);
        setIdOfTeacher(0, 2450);
    }

    teacher()
    {
        name[0] = "NULL";
        surname[0] = "NULL";
        
 
      /*  setName(NULL, 0);
        setSurname(NULL, 0);
        setTeacherBranch(NULL, 0);
        setIdOfTeacher(NULL, 2450);*/
    }

    void setIdOfTeacher(int _teacherId, int _idOfTeacher)
    {
        teacherId[_idOfTeacher] = _teacherId;
    }
    void setName(string _name, int _teacherId)
    {
        name[getOrderHuman(_teacherId, getIdOfhuman(getTeacherList(), 0), getTeacherList())] = _name;
    }
    void setName(string _Name, int _teacherOrder, bool addNew)
    {
        name[_teacherOrder] = _Name;
    }
    void setSurname(string _surname, int _teacherId)
    {
        surname[getOrderHuman(_teacherId, getIdOfhuman(getTeacherList(), 0), getTeacherList())] = _surname;
    }
    void setSurname(string _surname, int _teacherOrder, bool addNew)
    {
        surname[_teacherOrder] = _surname;
    }
    void setTeacherBranch(string _teacherBranch, int _teacherId)
    {
        branch[getOrderHuman(_teacherId, getIdOfhuman(getTeacherList(), 0), getTeacherList())] = _teacherBranch;
    }
    void setTeacherBranch(string _branch, int _teacherOrder, bool addNew)
    {
        branch[_teacherOrder] = _branch;
    }
    void setIdOfTeacher()
    {
        if (nullChecker(getTeacherList()) == -1)
        {
            cout << "log: gioh function error" << endl;
            return;
        }

        teacherId[getIdOfhuman(getTeacherList(), 0)] = teacherId[getIdOfhuman(getTeacherList(), 0) - 1] + 1;
    }
    string getName(int _teacherId)
    {
        return name[getOrderHuman(_teacherId, getIdOfhuman(getTeacherList(), 0), getTeacherList())];
    }
    string getName(int _teacherOrder,bool orderTeacher){
        return name[_teacherOrder];
    }
    string getSurName(int _teacherId)
    {
        return surname[getOrderHuman(_teacherId, getIdOfhuman(getTeacherList(), 0), getTeacherList())];
    }
    string getSurName(int _teacherOrder,bool orderTeacher){
        return surname[_teacherOrder];
    }
    string getTeacherBranc(int _teacherId)
    {
        return branch[getOrderHuman(_teacherId, getIdOfhuman(getTeacherList(), 0), getTeacherList())];
    }
    string getTeacherBranc(int _teacherOrder,bool orderTeacher){
        return branch[_teacherOrder];
    }
    int getTeacherId(int _teacherOrder){
        return teacherId[_teacherOrder];
    }
    int *getTeacherList()
    {
        return teacherId;
    }
};
