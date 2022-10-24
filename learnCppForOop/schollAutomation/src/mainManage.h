class mainManage
{
private:
    /* data */
public:
    int getIdOfhuman(int *humanList, int number)
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
