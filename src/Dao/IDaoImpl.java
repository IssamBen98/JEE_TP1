package Dao;

public class IDaoImpl implements IDao
{
    @Override
    public double getData()
    {
        double temperature = Math.random() * 20 ;
        return temperature;
    }
}
