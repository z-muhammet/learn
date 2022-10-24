class mainManage
{
private:
    /* data */
public:
    int getIdOfhuman(int* humanList, int number)
    {
        if (humanList[number] == 0)
        {
            return number;
        }
        else
        {
            getIdOfhuman(humanList, number++);
        }
        return -1;
    }

    bool nullChecker(int humanList[])
    {
        if (getIdOfhuman(humanList, 0) == 0)
            return true;
        else
            false;
    }
     int getOrderHuman(int _humanId,int _checkListSize,int humanList[])
    {
        int i = 0;
        while (i <= _checkListSize)
        {
            if (humanList[i] == _humanId)
            {
                return i;
            }
        }

        cout << "error goh function" << endl;
    }
    
    mainManage(/* args */);
    ~mainManage();
};

mainManage::mainManage(/* args */)
{
}

mainManage::~mainManage()
{
}
