#include <iostream>
#include <string>
#include <mainManage.h>
using namespace std;
class teacher : public mainManage
{
private:
    string name[5];
    string surname[5];
    string branch[5];
    int teacherId[5];

public:
    void setIdOfTeacher(int _teacherId, int _idOfTeacher)
    {
        teacherId[_idOfTeacher] = _teacherId;
    }
    void setName(string _name, int _teacherId)
    {
        name[getOrderHuman(_teacherId,getIdOfhuman(getTeacherList(),0),getTeacherList())] = _name;
    }
    void setSurname(string _surname, int _teacherId)
    {
        surname[getOrderHuman(_teacherId,getIdOfhuman(getTeacherList(),0),getTeacherList())] = _surname;
    }
    string getName(int _teacherId)
    {
        return name[getOrderHuman(_teacherId,getIdOfhuman(getTeacherList(),0),getTeacherList())];
    }
    string getSurName(int _teacherId)
    {
        return surname[getOrderHuman(_teacherId,getIdOfhuman(getTeacherList(),0),getTeacherList())];
    }
    int *getTeacherList()
    {
        return teacherId;
    }
    void setIdOfTeacher()
    {
        if (getIdOfhuman(getTeacherList(),0) == -1)
        {
            cout << "log: gnos function error" << endl;
            return;
        }

        teacherId[getIdOfhuman(getTeacherList(),0)] = teacherId[getIdOfhuman(getTeacherList(),0) - 1] + 1;
    }
    ~teacher();
};

teacher::teacher(/* args */)
{
}

teacher::~teacher()
{
}
