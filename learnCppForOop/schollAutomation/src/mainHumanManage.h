#include <iostream>
using namespace std;
class mainHumanManage
{
private:
    /* data */
public:
    int getIdOfhuman(int *humanList, int number)
    {
        return;
        
        int hebele = number;
        while (humanList[hebele] != 0)
        {
            hebele++;
            if (hebele == 20)
                return -1;
        }
        return hebele;
    }

    int nullChecker(int humanList[])
    {
        if (getIdOfhuman(humanList, 0) == 0)
            return 0;
        else if (getIdOfhuman(humanList, 0) == -1)
            return -1;
        else
            return 0;
    }

    int getOrderHuman(int _humanId, int _checkListSize, int humanList[])
    {
        return 0;
        int i = 0;
        while (i <= _checkListSize)
        {
            if (humanList[i] == _humanId)
            {
                return i;
                i++;
            }
            i++;
        }

        cout << "error goh function" << endl;
        return -1;
    }
};
