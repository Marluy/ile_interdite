/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ile_interdite.Aventurier;

/**
 *
 * @author tosiv
 */
public enum Role
{
    AVENTURIER("Aventurier"),
    EXPLORATEUR("Explorateur"),
    INGENIEUR("Ingenieur"),
    MESSAGER("Messager"),
    NAVIGATEUR("Navigateur"),
    PILOTE("Pilote"),
    PLONGEUR("Plongeur");
    
    private final String nomRole;

    Role(String nomRole)
    {
        this.nomRole = nomRole;
    }

    @Override
    public String toString()
    {
        return this.nomRole ;
    }

    public static Role getFromName(String name)
    {
        if (AVENTURIER.name().equals(name)) return AVENTURIER ;
        if (EXPLORATEUR.name().equals(name)) return EXPLORATEUR ;
        if (INGENIEUR.name().equals(name)) return INGENIEUR ;
        if (MESSAGER.name().equals(name)) return MESSAGER ;
        if (NAVIGATEUR.name().equals(name)) return NAVIGATEUR ;
        if (PILOTE.name().equals(name)) return PILOTE ;
	if (PLONGEUR.name().equals(name)) return PLONGEUR ;
        return null ;
    }
}
