package entity;
public class Calcule {
    List<Calcule> list=new ArrayList<>();

    public Calcule(List<Calcule> list) {
        this.list = list;
    }

    public int sommeListe(List<Integer> liste) {
            int somme = 0;
            for (int nombre : liste) {
                somme += nombre;
            }
            return somme;
            
    }
    public double calculerMoyenne(ArrayList<Integer> liste) {
        double somme = 0;
        for (int nombre : liste) {
            somme += nombre;
        }
        return somme / liste.size();
    }



}