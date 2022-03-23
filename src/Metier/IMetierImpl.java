package Metier;
import Dao.IDao;

public class IMetierImpl implements IMetier
{
        private IDao dao;   /* Dependance : Couplage faible */
    /*
        On instance pas l'interface IDao ! car on va lier
        IMetierImpl à une classe et puis on va créer
        un couplage direct.
    */

    @Override
    public double calcul() {
        double temperature = dao.getData();
        double val = temperature * Math.PI;
        return val;
    }

    /*
        Le setter créé va nous permet de choisir un objet
        de la classe (extension) qui implemente l'interface
        IDao et qu'on veut injecter dans la variable dao.
    */
    public void setDao(IDao dao)
    {
        this.dao = dao;
    }
}
